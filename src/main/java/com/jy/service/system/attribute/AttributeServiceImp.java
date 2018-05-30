package com.jy.service.system.attribute;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.jy.common.mybatis.Page;
import com.jy.common.utils.base.UuidUtil;
import com.jy.common.utils.tree.entity.ZNodes;
import com.jy.dao.system.attribute.AttributeDao;
import com.jy.entity.base.SelectData;
import com.jy.entity.system.attribute.Attribute;
import com.jy.entity.system.attribute.AttributeGroup;
import com.jy.entity.system.attribute.AttributeValue;
import com.jy.service.base.BaseServiceImp;

@Service("AttributeService")
public class AttributeServiceImp extends BaseServiceImp<AttributeGroup> implements
		AttributeService {
	
	@Autowired
	private AttributeDao attributeDao;
	
	@Override
	@Transactional
	public void insertGroupAndItems(AttributeGroup group) {
		//int count=attributeDao.queryGroupCount(gId);
		if(!StringUtils.isEmpty(group) && StringUtils.isEmpty(group.getId())){
			group.setId(UuidUtil.get32UUID());
			attributeDao.insert(group);
		}else{			
			attributeDao.update(group);
			attributeDao.deleteAttributesByGid(group.getId());
		}
		List<Attribute> items=group.getItems();
		if(!CollectionUtils.isEmpty(items)){
			for(Attribute attr:items){
				attr.setId(UuidUtil.get32UUID());
				attr.setGroupId(group.getId());
			}
			attributeDao.insertAttributes(items);
		}
	}

	@Override
	public int insertAttrValue(AttributeValue value) {
		
		return attributeDao.insertAttrValue(value);
	}

	@Override
	public List<ZNodes> getCategoryTree() {
		
		return attributeDao.getCategoryTree();
	}

	@Override
	public int insertAttribute(Attribute attr) {
		int res = -1;
		if(attributeDao.findCountByCode(attr)==0){
			attributeDao.insertAttribute(attr);
			res = 1;
		}
		return res;
	}

	@Override
	public Page<AttributeGroup> findGroupByPage(AttributeGroup group,
			Page<AttributeGroup> page) {
		page.setResults(attributeDao.findGorupByPage(group, page));
		return page;
	}

	@Override
	@Transactional
	public int updateGroupAndItems(AttributeGroup group) {
		int res = -1;
		String gId=group.getId();
		attributeDao.update(group);
		List<Attribute> items=group.getItems();
		List<Attribute> updateList = new ArrayList<Attribute>();//已存在的集合
		List<Attribute> insertList = new ArrayList<Attribute>();//新增的集合
		if(items!=null&&items.size()>0){
			for(Attribute attr:items){
				if(StringUtils.isEmpty(attr.getId())){
					attr.setId(UuidUtil.get32UUID());
					attr.setGroupId(gId);
					insertList.add(attr);
				}else{
					updateList.add(attr);
				}
			}
		}
		if(!CollectionUtils.isEmpty(updateList)){			
			attributeDao.updateAttributes(updateList);
		}
		if(!CollectionUtils.isEmpty(insertList)){			
			attributeDao.insertAttributes(insertList);
		}
		res=1;
		return res;
	}

	@Override
	public List<Attribute> findAttrsByCid(AttributeGroup group) {
		return attributeDao.findAttrsByCid(group);
	}

	@Override
	public List<SelectData> selectAttrGroups(String categoryId) {
		return attributeDao.selectAttrGroups(categoryId);
	}

	@Override
	public List<AttributeValue> findAttrValuesByBid(AttributeValue value) {
		return attributeDao.findAttrValuesByBid(value);
	}

	public List<SelectData> findDictItems(String dictId){
		return attributeDao.findDictItems(dictId);
	}

	@Override
	public int findAttrCodeNum(Attribute attribute) {
		return attributeDao.findAttrCodeNum(attribute);
	}

	@Override
	public List<SelectData> getDictsByName(String dictName) {
		return attributeDao.getDictsByName(dictName);
	}
	
}
