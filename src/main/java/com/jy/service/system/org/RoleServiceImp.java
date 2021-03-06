package com.jy.service.system.org;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jy.common.utils.tree.entity.ZNodes;
import com.jy.dao.system.org.RoleDao;
import com.jy.entity.system.org.Role;
import com.jy.entity.system.resources.RoleResources;
import com.jy.service.base.BaseServiceImp;

@Service("RoleService")
public class RoleServiceImp extends BaseServiceImp<Role> implements RoleService{

	
	@Override
	public List<ZNodes> listAuthorized(String roleId,String layer) {
		return ((RoleDao) baseDao).listAuthorized(roleId,layer);
	}

	@Override
	@Transactional
	public void saveAuthorized(String roleId, String aus,String layer) {
		List<RoleResources> roleAuth=new ArrayList<RoleResources>();
		String[] auss=aus.split(",");
		for(String s:auss){
			if(StringUtils.isNotBlank(s))
				roleAuth.add(new RoleResources(roleId,s));
		}
		RoleDao dao=(RoleDao)baseDao;
		dao.delAuthorizedByRoleIdAndLayer(roleId, layer);
		if(roleAuth.size()>0)dao.insertAuthorizedByRoleId(roleAuth);
	}

	@Override
	@Transactional
	public void delete(Role o) {	
		//进行事务删除，删除角色还删除角色资源关系表
		RoleDao dao=(RoleDao)baseDao;
		dao.delete(o);
		dao.delAuthorizedByRoleId(o.getId());
	}

	@Override
	@Transactional
	public void deleteBatch(List<Role> os) {
		//进行事务删除，删除角色还删除角色资源关系表
		RoleDao dao=(RoleDao)baseDao;
		dao.deleteBatch(os);
		dao.deleteBatchAuthorizedByRoleId(os);
	}

}
