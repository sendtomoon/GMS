package com.jy.service.workflow.factory;

import org.activiti.engine.impl.persistence.entity.*;
import org.activiti.engine.impl.interceptor.*;

public class UserManagerFactory implements SessionFactory
{
    private UserEntityManager userEntityManager;
    
    public void setUserEntityManager(final UserEntityManager userEntityManager) {
        this.userEntityManager = userEntityManager;
    }
    
    public Class<?> getSessionType() {
        return UserIdentityManager.class;
    }
    
    public Session openSession() {
        return (Session)this.userEntityManager;
    }
}
