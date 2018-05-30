package com.jy.controller.workflow.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jy.common.ajax.AjaxRes;
import com.jy.common.mybatis.Page;
import com.jy.controller.base.BaseController;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.activiti.bpmn.converter.BpmnXMLConverter;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.Process;
import org.activiti.editor.language.json.converter.BpmnJsonConverter;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentBuilder;
import org.activiti.engine.repository.ModelQuery;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"/backstage/workflow/model/"})
public class ModelController extends BaseController<Object>
{

  @Autowired
  private RepositoryService repositoryService;

  @RequestMapping({"index"})
  public String index(org.springframework.ui.Model model)
  {
    if (doSecurityIntercept("1")) {
      model.addAttribute("permitBtn", getPermitBtn("2"));
      return "/system/workflow/model/list";
    }
    return "/system/noAuthorized";
  }
  @RequestMapping(value={"findByPage"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  @ResponseBody
  public AjaxRes findByPage(Page<org.activiti.engine.repository.Model> page, String keyWord) {
    AjaxRes ar = getAjaxRes();
    if (ar.setNoAuth(doSecurityIntercept("1", "/backstage/workflow/model/index"))) {
      try {
        int pageNum = page.getPageNum() - 1;
        int pageSize = page.getPageSize();
        ModelQuery modelQuery = this.repositoryService.createModelQuery();
        List list = new ArrayList();
        if (StringUtils.isNotBlank(keyWord))
          list = 
            ((ModelQuery)modelQuery.modelNameLike("%" + keyWord + "%")
            .orderByCreateTime().desc())
            .listPage(pageNum, pageSize);
        else {
          list = ((ModelQuery)modelQuery.orderByCreateTime().desc())
            .listPage(pageNum, pageSize);
        }
        long count = modelQuery.count();
        page.setTotalRecord((int)count);
        page.setResults(list);
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

  @RequestMapping(value={"create"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public void create(String name, String key, String description, HttpServletRequest request, HttpServletResponse response)
  {
    if (doSecurityIntercept("2"))
      try {
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode editorNode = objectMapper.createObjectNode();
        editorNode.put("id", "canvas");
        editorNode.put("resourceId", "canvas");
        ObjectNode stencilSetNode = objectMapper.createObjectNode();
        stencilSetNode.put("namespace", "http://b3mn.org/stencilset/bpmn2.0#");
        editorNode.put("stencilset", stencilSetNode);
        org.activiti.engine.repository.Model modelData = this.repositoryService.newModel();

        ObjectNode modelObjectNode = objectMapper.createObjectNode();
        modelObjectNode.put("name", name);
        modelObjectNode.put("revision", 1);
        description = StringUtils.defaultString(description);
        modelObjectNode.put("description", description);
        modelData.setMetaInfo(modelObjectNode.toString());
        modelData.setName(name);
        modelData.setKey(StringUtils.defaultString(key));

        this.repositoryService.saveModel(modelData);
        this.repositoryService.addModelEditorSource(modelData.getId(), editorNode.toString().getBytes("utf-8"));

        response.sendRedirect(request.getContextPath() + "/act-process-editor/modeler.html?modelId=" + modelData.getId());
      } catch (Exception e) {
        this.logger.error("创建模型失败", e);
      }
    else
      try {
        response.sendRedirect(request.getContextPath() + "/backstage/noAuthorized");
      } catch (Exception e) {
        this.logger.error(e.toString(), e);
      }
  }

  @RequestMapping({"edit"})
  public void edit(String modelId, HttpServletRequest request, HttpServletResponse response)
  {
    try
    {
      if (doSecurityIntercept("3"))
        response.sendRedirect(request.getContextPath() + "/act-process-editor/modeler.html?modelId=" + modelId);
      else
        response.sendRedirect(request.getContextPath() + "/backstage/noAuthorized");
    }
    catch (Exception e) {
      this.logger.error(e.toString(), e);
    }
  }

  @RequestMapping(value={"deploy"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  @ResponseBody
  public AjaxRes deploy(String modelId)
  {
    AjaxRes ar = getAjaxRes();
    if (ar.setNoAuth(doSecurityIntercept("3"))) {
      try {
        org.activiti.engine.repository.Model modelData = this.repositoryService.getModel(modelId);
        ObjectNode modelNode = (ObjectNode)new ObjectMapper()
          .readTree(this.repositoryService.getModelEditorSource(modelData.getId()));
        byte[] bpmnBytes = null;
        BpmnModel model = new BpmnJsonConverter().convertToBpmnModel(modelNode);
        bpmnBytes = new BpmnXMLConverter().convertToXML(model);
        String processName = modelData.getName() + ".bpmn20.xml";
        Deployment deployment = this.repositoryService.createDeployment()
          .name(modelData.getName()).addString(processName, new String(bpmnBytes)).deploy();
        ar.setSucceedMsg("模型部署流程成功");
        this.logger.info("模型部署流程成功，部署ID=" + deployment.getId());
      } catch (Exception e) {
        this.logger.error("根据模型部署流程失败：modelId={}", modelId, e);
        ar.setFailMsg("模型部署流程失败");
      }
    }
    return ar;
  }

  @RequestMapping({"export/{modelId}/{type}"})
  public void export(@PathVariable("modelId") String modelId, @PathVariable("type") String type, HttpServletResponse response)
  {
    if (doSecurityIntercept("3", "/backstage/workflow/model/export"))
      try {
        org.activiti.engine.repository.Model modelData = this.repositoryService.getModel(modelId);
        BpmnJsonConverter jsonConverter = new BpmnJsonConverter();
        byte[] modelEditorSource = this.repositoryService.getModelEditorSource(modelData.getId());

        JsonNode editorNode = new ObjectMapper().readTree(modelEditorSource);
        BpmnModel bpmnModel = jsonConverter.convertToBpmnModel(editorNode);

        if (bpmnModel.getMainProcess() == null) {
          response.setStatus(HttpStatus.UNPROCESSABLE_ENTITY.value());
          response.getOutputStream().println("no main process, can't export for type: " + type);
          response.flushBuffer();
          return;
        }
        String filename = "";
        byte[] exportBytes = null;
        String mainProcessId = bpmnModel.getMainProcess().getId();
        String str1;
        switch ((str1 = type).hashCode()) { case 3030639:
          if (str1.equals("bpmn")) break; break;
        case 3271912:
          if (!str1.equals("json")) {

            BpmnXMLConverter xmlConverter = new BpmnXMLConverter();
            exportBytes = xmlConverter.convertToXML(bpmnModel);
            filename = mainProcessId + ".bpmn20.xml";
          }
          else
          {
            exportBytes = modelEditorSource;
            filename = mainProcessId + ".json";
          }
          break;
        }
        ByteArrayInputStream in = new ByteArrayInputStream(exportBytes);
        IOUtils.copy(in, response.getOutputStream());

        response.setHeader("Content-Disposition", "attachment; filename=" + filename);
        response.flushBuffer();
      } catch (Exception e) {
        this.logger.error("导出model的xml文件失败：modelId={}, type={}", new Object[] { modelId, type, e });
      }
  }

  @RequestMapping(value={"del"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  @ResponseBody
  public AjaxRes del(String modelId) {
    AjaxRes ar = getAjaxRes();
    if (ar.setNoAuth(doSecurityIntercept("3"))) {
      try {
        this.repositoryService.deleteModel(modelId);
        ar.setSucceedMsg("删除成功");
      } catch (Exception e) {
        this.logger.error(e.toString(), e);
        ar.setFailMsg("删除失败");
      }
    }
    return ar;
  }
}