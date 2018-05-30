package com.jy.dao.system.attribute;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jy.common.mybatis.Page;
import com.jy.common.utils.tree.entity.ZNodes;
import com.jy.dao.base.BaseDao;
import com.jy.dao.base.JYBatis;
import com.jy.entity.base.SelectData;
import com.jy.entity.system.attribute.Attribute;
import com.jy.entity.system.attribute.AttributeGroup;
import com.jy.entity.system.attribute.AttributeValue;

@JYBatis
public interface AttributeDao extends BaseDao<AttributeGroup> {
	
	int insertAttrValue(AttributeValue value);

	int findAttrGroupCount(String categoryId);
	
	List<ZNodes> getCategoryTree();

	int findCountByCode(Attribute attr);

	void deleteAttributesByGid(String gId);

	void insertAttributes(@Param("list")List<Attribute> list);

	List<AttributeGroup> findGorupByPage(@Param("param")AttributeGroup group,
			Page<AttributeGroup> page);

	void insertAttribute(Attribute attr);

	void updateAttributes(@Param("list")List<Attribute> items);
	
	List<Attribute> findAttrsByCid(AttributeGroup group);
	
	void addAttrsValue(@Param("list") List<AttributeValue> list);
	
	void updateAttrsValue(@Param("list")List<AttributeValue> list);
	
	List<SelectData> selectAttrGroups(String categoryId);

	List<AttributeValue> findAttrValuesByBid(AttributeValue value);
	
	List<SelectData> findDictItems(String dictId);
	
	int findAttrCodeNum(Attribute attribute);
	
	List<SelectData> getDictsByName(String dictName);
	
	int queryGroupCount(String groupId);
	
	List<AttributeValue> findBusinessId(@Param("str")String str);
}
