package com.jy.service.aike.build;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.jy.dao.aike.BuildDao;
import com.jy.entity.aike.build.AreaInfo;
import com.jy.service.base.BaseServiceImp;


@Service("BuildServiceImpl")
public class BuildServiceImpl extends BaseServiceImp<AreaInfo> implements BuildService {
	
	@Autowired
	private BuildDao BuildDao;

	@Override
	public void insertAreaInfo(String areaJson) {
		AreaInfo area = JSON.parseObject(areaJson, AreaInfo.class);
		area.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		BuildDao.insertAreaInfo(area);
	}

	@Override
	public void updateAreaInfo(String areaJson) {
		AreaInfo area = JSON.parseObject(areaJson, AreaInfo.class);
		BuildDao.updateAreaInfo(area);
	}

	@Override
	public List<AreaInfo> getAreaInfo(String id) {
		return BuildDao.getAreaInfo(id);
	}

	@Override
	public List<AreaInfo> listAreaInfo() {
		return BuildDao.listAreaInfo();
	}
	
}
