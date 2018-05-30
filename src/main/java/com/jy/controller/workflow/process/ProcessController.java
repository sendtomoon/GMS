package com.jy.controller.workflow.process;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jy.common.ajax.AjaxRes;
import com.jy.common.mybatis.Page;
import com.jy.controller.base.BaseController;
import com.jy.entity.workflow.process.ProcessDefinitionVo;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import org.activiti.bpmn.converter.BpmnXMLConverter;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.editor.language.json.converter.BpmnJsonConverter;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentQuery;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.repository.ProcessDefinitionQuery;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/backstage/workflow/process/" })
public class ProcessController extends BaseController<Object> {

	@Autowired
	private RepositoryService repositoryService;

	@RequestMapping({ "index" })
	public String index(org.springframework.ui.Model model) {
		if (doSecurityIntercept("1")) {
			model.addAttribute("permitBtn", getPermitBtn("2"));
			return "/system/workflow/process/list";
		}
		return "/system/noAuthorized";
	}

	@RequestMapping(value = { "findByPage" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	@ResponseBody
	public AjaxRes findByPage(Page<ProcessDefinitionVo> page, String keyWord) {
		AjaxRes ar = getAjaxRes();
		if (ar.setNoAuth(doSecurityIntercept("1", "/backstage/workflow/process/index"))) {
			try {
				int pageNum = page.getPageNum() - 1;
				int pageSize = page.getPageSize();
				ProcessDefinitionQuery query = this.repositoryService.createProcessDefinitionQuery();
				List<ProcessDefinition> processDefinitionList = new ArrayList<ProcessDefinition>();
				List<ProcessDefinitionVo> pdvoList = new ArrayList<ProcessDefinitionVo>();
				if (StringUtils.isNotBlank(keyWord))
					processDefinitionList = ((ProcessDefinitionQuery) query
							.processDefinitionNameLike("%" + keyWord + "%").orderByDeploymentId().desc())
									.listPage(pageNum, pageSize);
				else {
					processDefinitionList = ((ProcessDefinitionQuery) query.orderByDeploymentId().desc())
							.listPage(pageNum, pageSize);
				}
				for (ProcessDefinition pd : processDefinitionList) {
					String deploymentId = pd.getDeploymentId();
					Deployment deployment = (Deployment) this.repositoryService.createDeploymentQuery()
							.deploymentId(deploymentId).singleResult();
					ProcessDefinitionVo pdvo = new ProcessDefinitionVo(pd.getId(), deploymentId, pd.getName(),
							pd.getKey(), pd.getVersion(), deployment.getDeploymentTime(), pd.getResourceName(),
							pd.getDiagramResourceName());
					pdvoList.add(pdvo);
				}
				long count = query.count();
				page.setTotalRecord((int) count);
				page.setResults(pdvoList);
				Map p = new HashMap();
				p.put("permitBtn", getPermitBtn("3"));
				p.put("list", page);
				ar.setSucceed(p);
			} catch (Exception e) {
				this.logger.error(e.toString(), e);
				ar.setFailMsg("数据获取失败");
			}
		}
		return ar;
	}

	@RequestMapping(value = { "del" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	@ResponseBody
	public AjaxRes del(String processDefinitionId) {
		AjaxRes ar = getAjaxRes();
		if (ar.setNoAuth(doSecurityIntercept("3"))) {
			try {
				ProcessDefinition pd = (ProcessDefinition) this.repositoryService.createProcessDefinitionQuery()
						.processDefinitionId(processDefinitionId).singleResult();
				this.repositoryService.deleteDeployment(pd.getDeploymentId(), true);
				ar.setSucceedMsg("删除成功");
			} catch (Exception e) {
				this.logger.error(e.toString(), e);
				ar.setFailMsg("删除失败");
			}
		}
		return ar;
	}

	@RequestMapping({ "convertToModel" })
	@ResponseBody
	public AjaxRes convertToModel(String processDefinitionId) {
		AjaxRes ar = getAjaxRes();
		if (ar.setNoAuth(doSecurityIntercept("3"))) {
			try {
				ProcessDefinition processDefinition = (ProcessDefinition) this.repositoryService
						.createProcessDefinitionQuery().processDefinitionId(processDefinitionId).singleResult();
				InputStream bpmnStream = this.repositoryService.getResourceAsStream(processDefinition.getDeploymentId(),
						processDefinition.getResourceName());
				XMLInputFactory xif = XMLInputFactory.newInstance();
				InputStreamReader in = new InputStreamReader(bpmnStream, "UTF-8");
				XMLStreamReader xtr = xif.createXMLStreamReader(in);
				BpmnModel bpmnModel = new BpmnXMLConverter().convertToBpmnModel(xtr);

				BpmnJsonConverter converter = new BpmnJsonConverter();
				ObjectNode modelNode = converter.convertToJson(bpmnModel);
				org.activiti.engine.repository.Model modelData = this.repositoryService.newModel();
				modelData.setKey(processDefinition.getKey());
				modelData.setName(processDefinition.getName());
				modelData.setCategory(processDefinition.getDeploymentId());

				ObjectNode modelObjectNode = new ObjectMapper().createObjectNode();
				modelObjectNode.put("name", processDefinition.getName());
				modelObjectNode.put("revision", 1);
				modelObjectNode.put("description", processDefinition.getDescription());
				modelData.setMetaInfo(modelObjectNode.toString());

				this.repositoryService.saveModel(modelData);
				this.repositoryService.addModelEditorSource(modelData.getId(), modelNode.toString().getBytes("utf-8"));
				ar.setSucceedMsg("转换成功");
			} catch (Exception e) {
				this.logger.error("转换模型失败", e);
				ar.setFailMsg("转换失败");
			}
		}
		return ar;
	}

	@RequestMapping({ "resource/read" })
	public void loadByDeployment(@RequestParam("processDefinitionId") String processDefinitionId,
			@RequestParam("resourceType") String resourceType, HttpServletResponse response) throws Exception {
		response.setCharacterEncoding("UTF-8");
		ProcessDefinition processDefinition = (ProcessDefinition) this.repositoryService.createProcessDefinitionQuery()
				.processDefinitionId(processDefinitionId).singleResult();
		String resourceName = "";
		if (resourceType.equals("image"))
			resourceName = processDefinition.getDiagramResourceName();
		else if (resourceType.equals("xml")) {
			resourceName = processDefinition.getResourceName();
		}
		InputStream resourceAsStream = this.repositoryService.getResourceAsStream(processDefinition.getDeploymentId(),
				resourceName);
		byte[] b = new byte[1024];
		int len = -1;
		while ((len = resourceAsStream.read(b, 0, 1024)) != -1)
			response.getOutputStream().write(b, 0, len);
	}
}