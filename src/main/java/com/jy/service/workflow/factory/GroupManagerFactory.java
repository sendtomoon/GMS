package com.jy.service.workflow.factory;

import org.activiti.engine.impl.persistence.entity.*;
import org.activiti.engine.impl.interceptor.*;

public class GroupManagerFactory implements SessionFactory
{
    private GroupEntityManager groupEntityManager;
    
    public void setGroupEntityManager(final GroupEntityManager groupEntityManager) {
        this.groupEntityManager = groupEntityManager;
    }
    
    public Class<?> getSessionType() {
        return GroupIdentityManager.class;
    }
    
    public Session openSession() {
        return (Session)this.groupEntityManager;
    }
}
