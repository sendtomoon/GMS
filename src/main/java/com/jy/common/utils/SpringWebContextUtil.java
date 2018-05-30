package com.jy.common.utils;

import org.springframework.web.context.*;
import javax.servlet.*;
import org.springframework.web.context.support.*;
import org.springframework.context.*;

public class SpringWebContextUtil implements ServletContextListener
{
    private static WebApplicationContext wac;
    
    public void contextDestroyed(final ServletContextEvent sce) {
    }
    
    public void contextInitialized(final ServletContextEvent sce) {
        SpringWebContextUtil.wac = WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
    }
    
    public static ApplicationContext getApplicationContext() {
        return (ApplicationContext)SpringWebContextUtil.wac;
    }
}
