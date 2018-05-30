package com.jy.entity.system.attribute;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.type.Alias;

import com.jy.entity.base.BaseEntity;

@Alias("AttributeGroup")
public class AttributeGroup extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 8506117370408862733L;


	private String id;
	
	private String name;
	
	private Integer sort;
	
	private String categoryId;
	
	private String categoryName;
	
	private String groupId;
	
	private String description;
	
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	private List<Attribute> items = new ArrayList<Attribute>();
	
	public List<Attribute> getItems() {
		return items;
	}

	public void setItems(List<Attribute> items) {
		this.items = items;
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

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
	
}
