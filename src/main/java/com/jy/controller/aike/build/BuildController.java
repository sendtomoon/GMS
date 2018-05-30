package com.jy.controller.aike.build;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jy.common.ajax.AjaxRes;
import com.jy.controller.base.BaseController;
import com.jy.entity.aike.build.AreaInfo;
import com.jy.service.aike.build.BuildService;

@Controller
@RequestMapping(value = "/aike/build")
public class BuildController extends BaseController<AreaInfo> {

	@Autowired
	BuildService buildService;

	@RequestMapping(value = "/insertAreaInfo")
	@ResponseBody
	public AjaxRes insertAreaInfo(String areaJson) {
		AjaxRes ar = getAjaxRes();
		try {
			buildService.insertAreaInfo(areaJson);
			ar.setResMsg("插入成功");
		} catch (Exception e) {
			logger.error(e.toString(), e);
		}
		return ar;
	}
	
	@RequestMapping(value = "/updateAreaInfo")
	@ResponseBody
	public AjaxRes updateAreaInfo(String areaJson) {
		AjaxRes ar = getAjaxRes();
		try {
			buildService.updateAreaInfo(areaJson);
			ar.setResMsg("修改成功");
		} catch (Exception e) {
			logger.error(e.toString(), e);
		}
		return ar;
	}
	
	@RequestMapping(value = "/getAreaInfo")
	@ResponseBody
	public AjaxRes getAreaInfo(String id) {
		AjaxRes ar = getAjaxRes();
		try {
			List<AreaInfo> list = buildService.getAreaInfo(id);
			ar.setSucceed(list);
		} catch (Exception e) {
			logger.error(e.toString(), e);
		}
		return ar;
	}
	
	@RequestMapping(value = "/listAreaInfo")
	@ResponseBody
	public AjaxRes listAreaInfo() {
		AjaxRes ar = getAjaxRes();
		try {
			List<AreaInfo> list = buildService.listAreaInfo();
			ar.setSucceed(list);
		} catch (Exception e) {
			logger.error(e.toString(), e);
		}
		return ar;
	}

}
