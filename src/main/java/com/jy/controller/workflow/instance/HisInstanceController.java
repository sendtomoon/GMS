package com.jy.controller.workflow.instance;

import com.jy.controller.base.*;
import org.springframework.stereotype.*;
import org.activiti.engine.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.ui.*;
import com.jy.common.mybatis.*;
import com.jy.entity.workflow.process.*;
import com.jy.common.ajax.*;
import org.activiti.engine.history.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({ "/backstage/workflow/instance/his/" })
public class HisInstanceController extends BaseController<Object> {
	@Autowired
	private HistoryService historyService;

	@RequestMapping({ "index" })
	public String index(final Model model) {
		if (this.doSecurityIntercept("1")) {
			model.addAttribute("permitBtn", (Object) this.getPermitBtn("2"));
			return "/system/workflow/instance/his/list";
		}
		return "/system/noAuthorized";
	}

	@RequestMapping(value = { "findByPage" }, method = { RequestMethod.POST })
	@ResponseBody
	public AjaxRes findByPage(final Page<HistoricProcessInstanceVo> page, final String keyWord) {
		final AjaxRes ar = this.getAjaxRes();
		if (ar.setNoAuth(this.doSecurityIntercept("1", "/backstage/workflow/instance/his/index"))) {
			try {
				final int pageNum = page.getPageNum() - 1;
				final int pageSize = page.getPageSize();
				final HistoricProcessInstanceQuery query = (HistoricProcessInstanceQuery) this.historyService
						.createHistoricProcessInstanceQuery().finished().orderByProcessInstanceEndTime().desc();
				final List<HistoricProcessInstance> list = (List<HistoricProcessInstance>) query.listPage(pageNum,
						pageSize);
				final List<HistoricProcessInstanceVo> vos = new ArrayList<HistoricProcessInstanceVo>();
				for (final HistoricProcessInstance t : list) {
					final HistoricProcessInstanceVo vo = new HistoricProcessInstanceVo(t.getId(),
							t.getProcessDefinitionId(), t.getStartTime(), t.getEndTime(), t.getDeleteReason());
					vos.add(vo);
				}
				final long count = query.count();
				page.setTotalRecord((int) count);
				page.setResults(vos);
				final Map<String, Object> p = new HashMap<String, Object>();
				p.put("permitBtn", this.getPermitBtn("3"));
				p.put("list", page);
				ar.setSucceed(p);
			} catch (Exception e) {
				this.logger.error(e.toString(), (Throwable) e);
				ar.setFailMsg("\u6570\u636e\u83b7\u53d6\u5931\u8d25");
			}
		}
		return ar;
	}
}
