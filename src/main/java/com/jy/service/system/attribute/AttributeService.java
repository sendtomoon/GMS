package com.jy.service.system.attribute;

import java.util.List;

import com.jy.common.mybatis.Page;
import com.jy.common.utils.tree.entity.ZNodes;
import com.jy.entity.base.SelectData;
import com.jy.entity.system.attribute.Attribute;
import com.jy.entity.system.attribute.AttributeGroup;
import com.jy.entity.system.attribute.AttributeValue;
import com.jy.service.base.BaseService;

public interface AttributeService extends BaseService<AttributeGroup> {
	
	void insertGroupAndItems(AttributeGroup group);
	
	int insertAttrValue(AttributeValue value);

	List<ZNodes> getCategoryTree();
	
	int insertAttribute(Attribute attr);

	Page<AttributeGroup> findGroupByPage(AttributeGroup group,
			Page<AttributeGroup> page);

	int updateGroupAndItems(AttributeGroup group);
	
	List<Attribute> findAttrsByCid(AttributeGroup group);
	
	List<SelectData> selectAttrGroups(String categoryId);

	List<AttributeValue> findAttrValuesByBid(AttributeValue value);
	
	public List<SelectData> findDictItems(String dictId);
	
	public int findAttrCodeNum(Attribute attribute);
	
	public List<SelectData> getDictsByName(String name);
}
