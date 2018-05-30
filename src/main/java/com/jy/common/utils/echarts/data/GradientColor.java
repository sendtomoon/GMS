package com.jy.common.utils.echarts.data;

public class GradientColor
{
    private Double offset;
    private Object color;
    
    public GradientColor(final Double offset, final Object color) {
        this.offset = offset;
        this.color = color;
    }
    
    public Double offset() {
        return this.offset;
    }
    
    public GradientColor offset(final Double offset) {
        this.offset = offset;
        return this;
    }
    
    public Object color() {
        return this.color;
    }
    
    public GradientColor color(final Object color) {
        this.color = color;
        return this;
    }
    
    public Double getOffset() {
        return this.offset;
    }
    
    public void setOffset(final Double offset) {
        this.offset = offset;
    }
    
    public Object getColor() {
        return this.color;
    }
    
    public void setColor(final Object color) {
        this.color = color;
    }
}
