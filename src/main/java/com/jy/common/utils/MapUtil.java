package com.jy.common.utils;

import java.util.*;
import org.apache.commons.beanutils.*;
import org.apache.commons.lang3.*;
import java.beans.*;

public class MapUtil
{
    public static Map<String, Object> beanToMap(final Object obj) {
        final Map<String, Object> params = new HashMap<String, Object>(0);
        try {
            final PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean();
            final PropertyDescriptor[] descriptors = propertyUtilsBean.getPropertyDescriptors(obj);
            for (int i = 0; i < descriptors.length; ++i) {
                final String name = descriptors[i].getName();
                if (!StringUtils.equals((CharSequence)name, (CharSequence)"class")) {
                    params.put(name, propertyUtilsBean.getNestedProperty(obj, name));
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return params;
    }
}
