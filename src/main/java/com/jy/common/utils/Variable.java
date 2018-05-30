package com.jy.common.utils;

import java.util.*;
import org.apache.commons.beanutils.*;
import org.apache.commons.lang3.*;

public class Variable
{
    private String keys;
    private String values;
    private String types;
    
    public String getKeys() {
        return this.keys;
    }
    
    public void setKeys(final String keys) {
        this.keys = keys;
    }
    
    public String getValues() {
        return this.values;
    }
    
    public void setValues(final String values) {
        this.values = values;
    }
    
    public String getTypes() {
        return this.types;
    }
    
    public void setTypes(final String types) {
        this.types = types;
    }
    
    public Map<String, Object> getVariableMap() {
        final Map<String, Object> vars = new HashMap<String, Object>();
        ConvertUtils.register((Converter)new DateConverter(), (Class)Date.class);
        if (StringUtils.isBlank((CharSequence)this.keys)) {
            return vars;
        }
        final String[] arrayKey = this.keys.split(",");
        final String[] arrayValue = this.values.split(",");
        final String[] arrayType = this.types.split(",");
        for (int i = 0; i < arrayKey.length; ++i) {
            if (!"".equals(arrayKey[i]) && !"".equals(arrayValue[i])) {
                if (!"".equals(arrayType[i])) {
                    final String key = arrayKey[i];
                    final String value = arrayValue[i];
                    final String type = arrayType[i];
                    final Class<?> targetType = Enum.valueOf(PropertyType.class, type).getValue();
                    final Object objectValue = ConvertUtils.convert(value, (Class)targetType);
                    vars.put(key, objectValue);
                }
            }
        }
        return vars;
    }
}
