package com.jy.common.utils.echarts.data;

import java.io.*;

public class PieData implements Serializable
{
    private static final long serialVersionUID = -2573889018261931162L;
    private Object value;
    private String name;
    
    public PieData(final String name, final Object value) {
        this.value = value;
        this.name = name;
    }
    
    public Object value() {
        return this.value;
    }
    
    public PieData value(final Object value) {
        this.value = value;
        return this;
    }
    
    public String name() {
        return this.name;
    }
    
    public PieData name(final String name) {
        this.name = name;
        return this;
    }
    
    public Object getValue() {
        return this.value;
    }
    
    public void setValue(final Object value) {
        this.value = value;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
}
