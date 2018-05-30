package com.jy.entity.system.attribute;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import com.jy.entity.base.BaseEntity;

@Alias("Attribute")
public class Attribute extends BaseEntity implements Serializable {

	
	private static final long serialVersionUID = 2173090469456898479L;
	
	private String id;
	private String groupId;
	private String name;
	private String code;
	private Integer sort;
	private String type;
	private String dictId;
	private String dictName;
	private Integer length;
	private String nullable;
	private String filterTag;
	private String groupName;
	private String categoryId;
	private String categoryName;
	private String status;
	private String attrdictId;
	
	public String getAttrdictId() {
		return attrdictId;
	}
	public void setAttrdictId(String attrdictId) {
		this.attrdictId = attrdictId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public String getNullable() {
		return nullable;
	}
	public void setNullable(String nullable) {
		this.nullable = nullable;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getDictId() {
		return dictId;
	}
	public void setDictId(String dictId) {
		this.dictId = dictId;
	}
	public String getFilterTag() {
		return filterTag;
	}
	public void setFilterTag(String filterTag) {
		this.filterTag = filterTag;
	}
	public String getDictName() {
		return dictName;
	}
	public void setDictName(String dictName) {
		this.dictName = dictName;
	}
	
	
}
