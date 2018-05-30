package com.jy.service.workflow.factory;

import org.activiti.engine.impl.persistence.entity.*;
import com.jy.dao.system.account.*;
import org.activiti.engine.identity.*;
import com.jy.common.utils.*;
import com.jy.entity.system.org.*;
import javax.annotation.*;
import org.activiti.engine.impl.*;
import java.util.*;

public class GroupManager extends GroupEntityManager
{
    private AccountDao accountDao;
    
    public List<Group> findGroupsByUser(final String userId) {
        final List<Position> poss = this.accountDao.getPoss(userId);
        final List<Group> gs = ActivitiUtils.toActivitiGroups(poss);
        return gs;
    }
    
    @Resource
    public void setAccountDao(final AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    
    public List<Group> findGroupByQueryCriteria(final GroupQueryImpl query, final Page page) {
        throw new RuntimeException("not implement method.");
    }
    
    public long findGroupCountByNativeQuery(final Map<String, Object> parameterMap) {
        throw new RuntimeException("not implement method.");
    }
    
    public long findGroupCountByQueryCriteria(final GroupQueryImpl query) {
        throw new RuntimeException("not implement method.");
    }
    
    public List<Group> findGroupsByNativeQuery(final Map<String, Object> parameterMap, final int firstResult, final int maxResults) {
        throw new RuntimeException("not implement method.");
    }
}
