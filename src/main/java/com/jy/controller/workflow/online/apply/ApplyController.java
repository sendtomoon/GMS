package com.jy.controller.workflow.online.apply;

import com.jy.controller.base.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.activiti.engine.*;
import com.jy.service.oa.leave.*;
import org.springframework.ui.*;
import com.jy.entity.oa.leave.*;
import com.jy.common.ajax.*;
import com.jy.common.utils.security.*;
import java.util.*;
import org.activiti.engine.runtime.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({ "/backstage/workflow/online/apply/" })
public class ApplyController extends BaseController<Object>
{
    private static final String SECURITY_URL = "/backstage/workflow/online/apply/index";
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private IdentityService identityService;
    @Autowired
    private LeaveService leaveService;
    
    @RequestMapping({ "index" })
    public String index(final Model model) {
        if (this.doSecurityIntercept("1")) {
            model.addAttribute("permitBtn", (Object)this.getPermitBtn("2"));
            return "/system/workflow/online/apply/list";
        }
        return "/system/noAuthorized";
    }
    
    @RequestMapping(value = { "start" }, method = { RequestMethod.POST })
    @ResponseBody
    public AjaxRes startWorkflow(final Leave leave) {
        final AjaxRes ar = this.getAjaxRes();
        if (ar.setNoAuth(this.doSecurityIntercept("1", "/backstage/workflow/online/apply/index"))) {
            try {
                final String currentUserId = AccountShiroUtil.getCurrentUser().getAccountId();
                final Map<String, Object> variables = new HashMap<String, Object>();
                this.identityService.setAuthenticatedUserId(currentUserId);
                final ProcessInstance processInstance = this.runtimeService.startProcessInstanceByKey("leave", (Map)variables);
                final String pId = processInstance.getId();
                leave.setpId(pId);
                leave.setAccount_id(currentUserId);
                leave.setCreateTime(new Date());
                leave.setId(this.get32UUID());
                this.leaveService.insert(leave);
                ar.setSucceedMsg("\u6d41\u7a0b\u5df2\u542f\u52a8\uff0c\u6d41\u7a0bID\uff1a" + processInstance.getId());
            }
            catch (Exception e) {
                this.logger.error(e.toString(), (Throwable)e);
                ar.setFailMsg("\u542f\u52a8\u6d41\u7a0b\u5931\u8d25");
                return ar;
            }
            finally {
                this.identityService.setAuthenticatedUserId((String)null);
            }
            this.identityService.setAuthenticatedUserId((String)null);
        }
        return ar;
    }
}
