package com.jy.common.utils.echarts;

import java.io.*;
import java.util.*;

public abstract class AbstractData<T> implements Data<T>, Serializable
{
    private static final long serialVersionUID = 1L;
    protected List<Object> data;
    private Boolean clickable;
    private Boolean hoverable;
    
    public List<Object> data() {
        if (this.data == null) {
            this.data = new ArrayList<Object>();
        }
        return this.data;
    }
    
    @Override
    public T data(final Object... values) {
        if (values == null || values.length == 0) {
            return (T)this;
        }
        this.data().addAll(Arrays.asList(values));
        return (T)this;
    }
    
    public Boolean clickable() {
        return this.clickable;
    }
    
    public T clickable(final Boolean clickable) {
        this.clickable = clickable;
        return (T)this;
    }
    
    public Boolean getClickable() {
        return this.clickable;
    }
    
    public void setClickable(final Boolean clickable) {
        this.clickable = clickable;
    }
    
    public Boolean hoverable() {
        return this.hoverable;
    }
    
    public T hoverable(final Boolean hoverable) {
        this.hoverable = hoverable;
        return (T)this;
    }
    
    public Boolean getHoverable() {
        return this.hoverable;
    }
    
    public void setHoverable(final Boolean hoverable) {
        this.hoverable = hoverable;
    }
    
    public List<Object> getData() {
        return this.data;
    }
    
    public void setData(final List<Object> data) {
        this.data = data;
    }
}
