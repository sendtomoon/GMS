package com.jy.common.utils.echarts.data;

import java.io.*;

public class MapData implements Serializable
{
    private static final long serialVersionUID = 7814199168511760158L;
    private String name;
    private Object value;
    private Boolean selected;
    
    public MapData(final String name, final Object value) {
        this.name = name;
        this.value = value;
    }
    
    public MapData(final String name, final Object value, final Boolean selected) {
        this.name = name;
        this.value = value;
        this.selected = selected;
    }
    
    public String name() {
        return this.name;
    }
    
    public MapData name(final String name) {
        this.name = name;
        return this;
    }
    
    public Object value() {
        return this.value;
    }
    
    public MapData value(final Object value) {
        this.value = value;
        return this;
    }
    
    public Boolean selected() {
        return this.selected;
    }
    
    public MapData selected(final Boolean selected) {
        this.selected = selected;
        return this;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public Object getValue() {
        return this.value;
    }
    
    public void setValue(final Object value) {
        this.value = value;
    }
    
    public Boolean getSelected() {
        return this.selected;
    }
    
    public void setSelected(final Boolean selected) {
        this.selected = selected;
    }
}
