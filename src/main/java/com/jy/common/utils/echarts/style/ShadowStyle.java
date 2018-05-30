package com.jy.common.utils.echarts.style;

import java.io.*;

public class ShadowStyle implements Serializable
{
    private static final long serialVersionUID = -1996366699438984171L;
    private String color;
    private Object width;
    private String type;
    
    public String color() {
        return this.color;
    }
    
    public ShadowStyle color(final String color) {
        this.color = color;
        return this;
    }
    
    public Object width() {
        return this.width;
    }
    
    public ShadowStyle width(final Object width) {
        this.width = width;
        return this;
    }
    
    public String type() {
        return this.type;
    }
    
    public ShadowStyle type(final String type) {
        this.type = type;
        return this;
    }
    
    public ShadowStyle typeDefault() {
        this.type = "default";
        return this;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(final String color) {
        this.color = color;
    }
    
    public Object getWidth() {
        return this.width;
    }
    
    public void setWidth(final Object width) {
        this.width = width;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(final String type) {
        this.type = type;
    }
}
