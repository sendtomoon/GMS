package com.jy.common.utils.echarts.style;

import java.io.*;

public class AreaStyle implements Serializable
{
    private static final long serialVersionUID = -6547716731700677234L;
    private Object color;
    private Object type;
    
    public Object color() {
        return this.color;
    }
    
    public AreaStyle color(final Object color) {
        this.color = color;
        return this;
    }
    
    public Object type() {
        return this.type;
    }
    
    public AreaStyle type(final Object type) {
        this.type = type;
        return this;
    }
    
    public AreaStyle typeDefault() {
        this.type = "default";
        return this;
    }
    
    public Object getColor() {
        return this.color;
    }
    
    public void setColor(final Object color) {
        this.color = color;
    }
    
    public Object getType() {
        return this.type;
    }
    
    public void setType(final Object type) {
        this.type = type;
    }
}
