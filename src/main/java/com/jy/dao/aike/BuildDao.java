package com.jy.dao.aike;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jy.dao.base.BaseDao;
import com.jy.dao.base.JYBatis;
import com.jy.entity.aike.build.AreaInfo;

@JYBatis
public interface BuildDao extends BaseDao<AreaInfo> {

	List<AreaInfo> getAreaInfo(@Param("id") String id);

	List<AreaInfo> listAreaInfo();

	void insertAreaInfo(AreaInfo area);

	void updateAreaInfo(AreaInfo area);

}
