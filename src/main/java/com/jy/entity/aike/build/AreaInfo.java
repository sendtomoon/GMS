package com.jy.entity.aike.build;

import org.apache.ibatis.type.Alias;

import com.jy.entity.base.BaseEntity;

@Alias("AreaInfo")
public class AreaInfo extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1898907912440617858L;
	private String id;
	private String areaName;
	private String areaType;
	private String areaFullName;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the areaName
	 */
	public String getAreaName() {
		return areaName;
	}

	/**
	 * @param areaName
	 *            the areaName to set
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	/**
	 * @return the areaType
	 */
	public String getAreaType() {
		return areaType;
	}

	/**
	 * @param areaType
	 *            the areaType to set
	 */
	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}

	/**
	 * @return the areaFullName
	 */
	public String getAreaFullName() {
		return areaFullName;
	}

	/**
	 * @param areaFullName the areaFullName to set
	 */
	public void setAreaFullName(String areaFullName) {
		this.areaFullName = areaFullName;
	}
}
