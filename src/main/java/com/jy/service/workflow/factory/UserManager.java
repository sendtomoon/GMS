package com.jy.service.workflow.factory;

import com.jy.dao.system.account.*;
import com.jy.common.utils.*;
import com.jy.entity.system.account.*;
import org.activiti.engine.identity.*;
import com.jy.entity.system.org.*;
import javax.annotation.*;
import org.activiti.engine.impl.*;
import java.util.*;
import org.activiti.engine.impl.persistence.entity.*;

public class UserManager extends UserEntityManager
{
    private AccountDao accountDao;
    
    public User findUserById(final String userId) {
        final Account account = this.accountDao.findAccountById(userId);
        final UserEntity userEntity = ActivitiUtils.toActivitiUser(account);
        return (User)userEntity;
    }
    
    public List<Group> findGroupsByUser(final String userId) {
        final List<Position> poss = this.accountDao.getPoss(userId);
        final List<Group> gs = ActivitiUtils.toActivitiGroups(poss);
        return gs;
    }
    
    @Resource
    public void setAccountDao(final AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    
    public List<User> findPotentialStarterUsers(final String proceDefId) {
        throw new RuntimeException("not implement method.");
    }
    
    public List<User> findUserByQueryCriteria(final UserQueryImpl query, final Page page) {
        throw new RuntimeException("not implement method.");
    }
    
    public long findUserCountByNativeQuery(final Map<String, Object> parameterMap) {
        throw new RuntimeException("not implement method.");
    }
    
    public long findUserCountByQueryCriteria(final UserQueryImpl query) {
        throw new RuntimeException("not implement method.");
    }
    
    public IdentityInfoEntity findUserInfoByUserIdAndKey(final String userId, final String key) {
        throw new RuntimeException("not implement method.");
    }
    
    public List<String> findUserInfoKeysByUserIdAndType(final String userId, final String type) {
        throw new RuntimeException("not implement method.");
    }
    
    public List<User> findUsersByNativeQuery(final Map<String, Object> parameterMap, final int firstResult, final int maxResults) {
        throw new RuntimeException("not implement method.");
    }
}
