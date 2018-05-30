package com.jy.controller.workflow.instance;

import com.jy.controller.base.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.activiti.engine.*;
import org.springframework.ui.*;
import com.jy.common.mybatis.*;
import com.jy.entity.workflow.process.*;
import com.jy.common.ajax.*;
import org.apache.commons.lang3.*;
import org.activiti.engine.runtime.*;
import org.activiti.engine.task.*;
import com.jy.entity.workflow.online.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({ "/backstage/workflow/instance/pro/" })
public class ProInstanceController extends BaseController<Object>
{
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    
    @RequestMapping({ "index" })
    public String index(final Model model) {
        if (this.doSecurityIntercept("1")) {
            model.addAttribute("permitBtn", (Object)this.getPermitBtn("2"));
            return "/system/workflow/instance/pro/list";
        }
        return "/system/noAuthorized";
    }
    
    @RequestMapping(value = { "findByPage" }, method = { RequestMethod.POST })
    @ResponseBody
    public AjaxRes findByPage(final Page<ProcessInstanceVo> page, final String keyWord) {
        final AjaxRes ar = this.getAjaxRes();
        if (ar.setNoAuth(this.doSecurityIntercept("1", "/backstage/workflow/instance/pro/index"))) {
            try {
                final int pageNum = page.getPageNum() - 1;
                final int pageSize = page.getPageSize();
                final ProcessInstanceQuery query = this.runtimeService.createProcessInstanceQuery();
                List<ProcessInstance> list = new ArrayList<ProcessInstance>();
                final List<ProcessInstanceVo> vos = new ArrayList<ProcessInstanceVo>();
                if (StringUtils.isNotBlank((CharSequence)keyWord)) {
                    list = (List<ProcessInstance>)((ProcessInstanceQuery)query.processInstanceTenantIdLike("%" + keyWord + "%").orderByProcessInstanceId().desc()).listPage(pageNum, pageSize);
                }
                else {
                    list = (List<ProcessInstance>)((ProcessInstanceQuery)query.orderByProcessInstanceId().desc()).listPage(pageNum, pageSize);
                }
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
