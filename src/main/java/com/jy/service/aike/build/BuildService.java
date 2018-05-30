package com.jy.service.aike.build;

import java.util.List;

import com.jy.entity.aike.build.AreaInfo;
import com.jy.service.base.BaseService;

public interface BuildService extends BaseService<AreaInfo> {

	public void insertAreaInfo(String areaJson);

	public void updateAreaInfo(String areaJson);

	public List<AreaInfo> getAreaInfo(String id);

	public List<AreaInfo> listAreaInfo();

}
