package com.jy.common.utils.echarts.series.gauge;

import java.io.*;

public class Pointer implements Serializable
{
    private static final long serialVersionUID = 2575834098541231673L;
    private Object length;
    private Object width;
    private String color;
    
    public Object length() {
        return this.length;
    }
    
    public Pointer length(final Object length) {
        this.length = length;
        return this;
    }
    
    public Object width() {
        return this.width;
    }
    
    public Pointer width(final Object width) {
        this.width = width;
        return this;
    }
    
    public String color() {
        return this.color;
    }
    
    public Pointer color(final String color) {
        this.color = color;
        return this;
    }
    
    public Object getLength() {
        return this.length;
    }
    
    public void setLength(final Object length) {
        this.length = length;
    }
    
    public Object getWidth() {
        return this.width;
    }
    
    public void setWidth(final Object width) {
        this.width = width;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(final String color) {
        this.color = color;
    }
}
