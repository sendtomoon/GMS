package com.jy.common.utils.echarts.data;

import java.io.*;

public class RangeData implements Serializable
{
    private static final long serialVersionUID = 1L;
    private Integer start;
    private Integer end;
    private String label;
    private Object color;
    
    public RangeData() {
    }
    
    public RangeData(final Integer start, final Integer end) {
        this.start = start;
        this.end = end;
    }
    
    public RangeData start(final Integer start) {
        this.start = start;
        return this;
    }
    
    public Integer start() {
        return this.start;
    }
    
    public RangeData end(final Integer end) {
        this.end = end;
        return this;
    }
    
    public Integer end() {
        return this.end;
    }
    
    public RangeData label(final String label) {
        this.label = label;
        return this;
    }
    
    public String label() {
        return this.label;
    }
    
    public RangeData color(final Object color) {
        this.color = color;
        return this;
    }
    
    public Object color() {
        return this.color;
    }
    
    public Integer getStart() {
        return this.start;
    }
    
    public void setStart(final Integer start) {
        this.start = start;
    }
    
    public Integer getEnd() {
        return this.end;
    }
    
    public void setEnd(final Integer end) {
        this.end = end;
    }
    
    public String getLabel() {
        return this.label;
    }
    
    public void setLabel(final String label) {
        this.label = label;
    }
    
    public Object getColor() {
        return this.color;
    }
    
    public void setColor(final Object color) {
        this.color = color;
    }
}
