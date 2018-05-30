package com.jy.common.utils.echarts.series.other;

import java.io.*;
import com.jy.common.utils.echarts.code.*;

public class RootLocation implements Serializable
{
    private static final long serialVersionUID = 1L;
    private Object x;
    private Object y;
    
    public RootLocation() {
    }
    
    public RootLocation(final Object x, final Object y) {
        this.x = x;
        this.y = y;
    }
    
    public RootLocation x(final X x) {
        this.x = x;
        return this;
    }
    
    public RootLocation x(final Integer x) {
        this.x = x;
        return this;
    }
    
    public RootLocation x(final String x) {
        this.x = x;
        return this;
    }
    
    public RootLocation x(final Object x) {
        this.x = x;
        return this;
    }
    
    public Object x() {
        return this.x;
    }
    
    public RootLocation y(final Y y) {
        this.y = y;
        return this;
    }
    
    public RootLocation y(final Integer y) {
        this.y = y;
        return this;
    }
    
    public RootLocation y(final String y) {
        this.y = y;
        return this;
    }
    
    public RootLocation y(final Object y) {
        this.y = y;
        return this;
    }
    
    public Object y() {
        return this.y;
    }
    
    public Object getX() {
        return this.x;
    }
    
    public void setX(final Object x) {
        this.x = x;
    }
    
    public Object getY() {
        return this.y;
    }
    
    public void setY(final Object y) {
        this.y = y;
    }
}
