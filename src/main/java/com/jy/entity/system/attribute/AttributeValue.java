package com.jy.entity.system.attribute;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import com.jy.entity.base.BaseEntity;

@Alias("AttributeValue")
public class AttributeValue extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 8913807363848112009L;
	
	private String id;
	private String businessId;
	private String attributeId;
	private String value;
	private String name;
	private String attributeCode;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getAttributeId() {
		return attributeId;
	}
	public void setAttributeId(String attributeId) {
		this.attributeId = attributeId;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getAttributeCode() {
		return attributeCode;
	}
	public void setAttributeCode(String attributeCode) {
		this.attributeCode = attributeCode;
	}
	
}
