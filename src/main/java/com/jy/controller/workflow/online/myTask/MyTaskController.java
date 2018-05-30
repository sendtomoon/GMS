package com.jy.controller.workflow.online.myTask;

import com.jy.controller.base.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.activiti.engine.*;
import com.jy.service.oa.leave.*;
import org.springframework.ui.*;
import com.jy.common.mybatis.*;
import com.jy.entity.workflow.online.*;
import com.jy.common.ajax.*;
import com.jy.common.utils.security.*;
import org.activiti.engine.task.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import com.jy.common.utils.*;
import com.jy.entity.oa.leave.*;

@Controller
@RequestMapping({ "/backstage/workflow/online/myTask/" })
public class MyTaskController extends BaseController<Object>
{
    private static final String SIGN_SECURITY_URL = "/backstage/workflow/online/myTask/signList";
    private static final String TODO_SECURITY_URL = "/backstage/workflow/online/myTask/todoList";
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private IdentityService identityService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private LeaveService leaveService;
    
    @RequestMapping({ "signList" })
    public String signList(final Model model) {
        if (this.doSecurityIntercept("1")) {
            model.addAttribute("permitBtn", (Object)this.getPermitBtn("2"));
            return "/system/workflow/online/myTask/signList";
        }
        return "/system/noAuthorized";
    }
    
    @RequestMapping(value = { "findSignByPage" }, method = { RequestMethod.POST })
    @ResponseBody
    public AjaxRes findSignByPage(final Page<TaskVo> page, final String keyWord) {
        final AjaxRes ar = this.getAjaxRes();
        if (ar.setNoAuth(this.doSecurityIntercept("1", "/backstage/workflow/online/myTask/signList"))) {
            try {
                final int pageNum = page.getPageNum() - 1;
                final int pageSize = page.getPageSize();
                final List<TaskVo> taskVos = new ArrayList<TaskVo>();
                final String currentUserId = AccountShiroUtil.getCurrentUser().getAccountId();
                final TaskQuery taskQuery = (TaskQuery)this.taskService.createTaskQuery().taskCandidateUser(currentUserId);
                final List<Task> tasks = (List<Task>)taskQuery.listPage(pageNum, pageSize);
                for (final Task t : tasks) {
                    final TaskVo taskVo = new TaskVo(t.getId(), t.getTaskDefinitionKey(), t.getName(), t.getProcessDefinitionId(), t.getProcessInstanceId(), t.getPriority(), t.getCreateTime(), t.getDueDate(), t.getDescription(), t.getOwner(), t.getAssignee());
                    taskVos.add(taskVo);
                }
                final long count = taskQuery.count();
                page.setTotalRecord((int)count);
                page.setResults(taskVos);
                final Map<String, Object> p = new HashMap<String, Object>();
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
    
    @RequestMapping({ "todoList" })
    public String todoList(final Model model) {
        if (this.doSecurityIntercept("1")) {
            model.addAttribute("permitBtn", (Object)this.getPermitBtn("2"));
            return "/system/workflow/online/myTask/todoList";
        }
        return "/system/noAuthorized";
    }
    
    @RequestMapping(value = { "findTodoByPage" }, method = { RequestMethod.POST })
    @ResponseBody
    public AjaxRes findTodoByPage(final Page<TaskVo> page, final String keyWord) {
        final AjaxRes ar = this.getAjaxRes();
        if (ar.setNoAuth(this.doSecurityIntercept("1", "/backstage/workflow/online/myTask/todoList"))) {
            try {
                final int pageNum = page.getPageNum() - 1;
                final int pageSize = page.getPageSize();
                final List<TaskVo> taskVos = new ArrayList<TaskVo>();
                final String currentUserId = AccountShiroUtil.getCurrentUser().getAccountId();
                final TaskQuery taskQuery = (TaskQuery)this.taskService.createTaskQuery().taskAssignee(currentUserId);
                final List<Task> tasks = (List<Task>)taskQuery.listPage(pageNum, pageSize);
                for (final Task t : tasks) {
                    final TaskVo taskVo = new TaskVo(t.getId(), t.getTaskDefinitionKey(), t.getName(), t.getProcessDefinitionId(), t.getProcessInstanceId(), t.getPriority(), t.getCreateTime(), t.getDueDate(), t.getDescription(), t.getOwner(), t.getAssignee());
                    taskVos.add(taskVo);
                }
                final long count = taskQuery.count();
                page.setTotalRecord((int)count);
                page.setResults(taskVos);
                final Map<String, Object> p = new HashMap<String, Object>();
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
    
    @RequestMapping(value = { "claim/{id}" }, method = { RequestMethod.POST })
    @ResponseBody
    public AjaxRes claimTask(@PathVariable("id") final String taskId) {
        final AjaxRes ar = this.getAjaxRes();
        if (ar.setNoAuth(this.doSecurityIntercept("1", "/backstage/workflow/online/myTask/signList"))) {
            try {
                final String currentUserId = AccountShiroUtil.getCurrentUser().getAccountId();
                this.taskService.claim(taskId, currentUserId);
                ar.setSucceedMsg("\u7b7e\u6536\u6210\u529f");
            }
            catch (Exception e) {
                this.logger.error(e.toString(), (Throwable)e);
                ar.setFailMsg("\u7b7e\u6536\u5931\u8d25");
            }
        }
        return ar;
    }
    
    @RequestMapping(value = { "complete/{id}" }, method = { RequestMethod.POST })
    @ResponseBody
    public AjaxRes complete(@PathVariable("id") final String taskId, final Variable var) {
        final AjaxRes ar = this.getAjaxRes();
        if (ar.setNoAuth(this.doSecurityIntercept("1", "/backstage/workflow/online/myTask/todoList"))) {
            try {
                final Map<String, Object> variables = var.getVariableMap();
                this.taskService.complete(taskId, (Map)variables);
                ar.setSucceedMsg("\u529e\u7406\u6210\u529f");
            }
            catch (Exception e) {
                this.logger.error(e.toString(), (Throwable)e);
                ar.setFailMsg("\u529e\u7406\u5931\u8d25");
            }
        }
        return ar;
    }
    
    @RequestMapping(value = { "findTask" }, method = { RequestMethod.POST })
    @ResponseBody
    public AjaxRes findTask(final String pId) {
        final AjaxRes ar = this.getAjaxRes();
        if (ar.setNoAuth(this.doSecurityIntercept("1", "/backstage/workflow/online/myTask/todoList"))) {
            try {
                final Leave leave = this.leaveService.findLeaveByPId(pId);
                ar.setSucceed(leave, "\u6570\u636e\u83b7\u53d6\u6210\u529f");
            }
            catch (Exception e) {
                this.logger.error(e.toString(), (Throwable)e);
                ar.setFailMsg("\u6570\u636e\u83b7\u53d6\u5931\u8d25");
            }
        }
        return ar;
    }
    
    @RequestMapping(value = { "reject/{id}" }, method = { RequestMethod.POST })
    @ResponseBody
    public AjaxRes reject(@PathVariable("id") final String taskId, final String pId, final String rejectReason, final Variable var) {
        final AjaxRes ar = this.getAjaxRes();
        if (ar.setNoAuth(this.doSecurityIntercept("1", "/backstage/workflow/online/myTask/todoList"))) {
            try {
                final Map<String, Object> variables = var.getVariableMap();
                this.leaveService.updateRejectReason(pId, rejectReason);
                this.taskService.complete(taskId, (Map)variables);
                ar.setSucceedMsg("\u9a73\u56de\u6210\u529f");
            }
            catch (Exception e) {
                this.logger.error(e.toString(), (Throwable)e);
                ar.setFailMsg("\u9a73\u56de\u5931\u8d25");
            }
        }
        return ar;
    }
    
    @RequestMapping(value = { "adjust/{taskId}" }, method = { RequestMethod.POST })
    @ResponseBody
    public AjaxRes adjust(@PathVariable("taskId") final String taskId, final String pId, final String description, final Variable var) {
        final AjaxRes ar = this.getAjaxRes();
        if (ar.setNoAuth(this.doSecurityIntercept("1", "/backstage/workflow/online/myTask/todoList"))) {
            try {
                final Map<String, Object> variables = var.getVariableMap();
                this.leaveService.updateDescription(pId, description);
                this.taskService.complete(taskId, (Map)variables);
                ar.setSucceedMsg("\u8c03\u6574\u6210\u529f");
            }
            catch (Exception e) {
                this.logger.error(e.toString(), (Throwable)e);
                ar.setFailMsg("\u8c03\u6574\u5931\u8d25");
            }
        }
        return ar;
    }
}
