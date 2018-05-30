package com.jy.common.utils.echarts;

public class Grid extends Basic<Grid> implements Component
{
    private Object x2;
    private Object y2;
    private Object width;
    private Object height;
    
    public Object x2() {
        return this.x2;
    }
    
    public Grid x2(final Object x2) {
        this.x2 = x2;
        return this;
    }
    
    public Object y2() {
        return this.y2;
    }
    
    public Grid y2(final Object y2) {
        this.y2 = y2;
        return this;
    }
    
    public Object width() {
        return this.width;
    }
    
    public Grid width(final Object width) {
        this.width = width;
        return this;
    }
    
    public Object height() {
        return this.height;
    }
    
    public Grid height(final Object height) {
        this.height = height;
        return this;
    }
    
    public Object getX2() {
        return this.x2;
    }
    
    public void setX2(final Object x2) {
        this.x2 = x2;
    }
    
    public Object getY2() {
        return this.y2;
    }
    
    public void setY2(final Object y2) {
        this.y2 = y2;
    }
    
    public Object getWidth() {
        return this.width;
    }
    
    public void setWidth(final Object width) {
        this.width = width;
    }
    
    public Object getHeight() {
        return this.height;
    }
    
    public void setHeight(final Object height) {
        this.height = height;
    }
}
