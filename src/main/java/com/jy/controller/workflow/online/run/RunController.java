package com.jy.controller.workflow.online.run;

import com.jy.controller.base.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.activiti.engine.*;
import org.springframework.ui.*;
import com.jy.common.mybatis.*;
import com.jy.entity.workflow.process.*;
import com.jy.common.ajax.*;
import com.jy.common.utils.security.*;
import org.activiti.engine.runtime.*;
import org.activiti.engine.task.*;
import com.jy.entity.workflow.online.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({ "/backstage/workflow/online/run/" })
public class RunController extends BaseController<Object>
{
    private static final String SECURITY_URL = "/backstage/workflow/online/run/index";
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    
    @RequestMapping({ "index" })
    public String index(final Model model) {
        if (this.doSecurityIntercept("1")) {
            model.addAttribute("permitBtn", (Object)this.getPermitBtn("2"));
            return "/system/workflow/online/run/list";
        }
        return "/system/noAuthorized";
    }
    
    @RequestMapping(value = { "findByPage" }, method = { RequestMethod.POST })
    @ResponseBody
    public AjaxRes findByPage(final Page<ProcessInstanceVo> page, final String keyWord) {
        final AjaxRes ar = this.getAjaxRes();
        if (ar.setNoAuth(this.doSecurityIntercept("1", "/backstage/workflow/online/run/index"))) {
            try {
                final int pageNum = page.getPageNum() - 1;
                final int pageSize = page.getPageSize();
                final List<ProcessInstanceVo> vos = new ArrayList<ProcessInstanceVo>();
                final String currentUserId = AccountShiroUtil.getCurrentUser().getAccountId();
                final ProcessInstanceQuery query = (ProcessInstanceQuery)this.runtimeService.createProcessInstanceQuery().involvedUser(currentUserId).active().orderByProcessInstanceId().desc();
                final List<ProcessInstance> list = (List<ProcessInstance>)query.listPage(pageNum, pageSize);
                for (final ProcessInstance t : list) {
                    final ProcessInstanceVo vo = new ProcessInstanceVo(t.getId(), t.getProcessInstanceId(), t.getProcessDefinitionId());
                    final Task task = (Task)((TaskQuery)((TaskQuery)((TaskQuery)this.taskService.createTaskQuery().processInstanceId(t.getProcessInstanceId())).active().orderByTaskCreateTime()).desc()).singleResult();
                    final TaskVo taskVo = new TaskVo(task.getId(), task.getTaskDefinitionKey(), task.getName(), task.getProcessDefinitionId(), task.getProcessInstanceId(), task.getPriority(), task.getCreateTime(), task.getDueDate(), task.getDescription(), task.getOwner(), task.getAssignee());
                    vo.setTask(taskVo);
                    vos.add(vo);
                }
                final long count = query.count();
                page.setTotalRecord((int)count);
                page.setResults(vos);
                final Map<String, Object> p = new HashMap<String, Object>();
                p.put("permitBtn", this.getPermitBtn("3"));
                p.put("list", page);
                ar.setSucceed(p);
            }
            catch (Exception e) {
                this.logger.error(e.toString(), (Throwable)e);
                ar.setFailMsg("\u6570\u636e\u83b7\u53d6\u5931\u8d25");
            }
        }
        return ar;
    }
}
