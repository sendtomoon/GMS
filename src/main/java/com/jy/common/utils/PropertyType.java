package com.jy.common.utils;

import java.util.*;

public enum PropertyType
{
    S((Class<?>)String.class), 
    I((Class<?>)Integer.class), 
    L((Class<?>)Long.class), 
    F((Class<?>)Float.class), 
    N((Class<?>)Double.class), 
    D((Class<?>)Date.class), 
    SD((Class<?>)java.sql.Date.class), 
    B((Class<?>)Boolean.class);
    
    private Class<?> clazz;
    
    private PropertyType(final Class<?> clazz) {
        this.clazz = clazz;
    }
    
    public Class<?> getValue() {
        return this.clazz;
    }
}
