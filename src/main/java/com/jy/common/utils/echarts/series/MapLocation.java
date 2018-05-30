package com.jy.common.utils.echarts.series;

import java.io.*;
import com.jy.common.utils.echarts.code.*;

public class MapLocation implements Serializable
{
    private static final long serialVersionUID = -9175820401945407194L;
    private Object x;
    private Object y;
    private Object width;
    private Object height;
    
    public MapLocation() {
    }
    
    public MapLocation(final Object x, final Object y) {
        this.x = x;
        this.y = y;
    }
    
    public MapLocation(final Object x, final Object y, final Object width) {
        this.x = x;
        this.y = y;
        this.width = width;
    }
    
    public MapLocation(final Object x, final Object y, final Object width, final Object height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public MapLocation(final X x, final Y y) {
        this.x = x;
        this.y = y;
    }
    
    public MapLocation(final X x, final Y y, final Object width) {
        this.x = x;
        this.y = y;
        this.width = width;
    }
    
    public MapLocation(final X x, final Y y, final Object width, final Object height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public Object x() {
        return this.x;
    }
    
    public MapLocation x(final Object x) {
        this.x = x;
        return this;
    }
    
    public MapLocation x(final X x) {
        this.x = x;
        return this;
    }
    
    public Object y() {
        return this.y;
    }
    
    public MapLocation y(final Y y) {
        this.y = y;
        return this;
    }
    
    public MapLocation y(final Object y) {
        this.y = y;
        return this;
    }
    
    public Object width() {
        return this.width;
    }
    
    public MapLocation width(final Object width) {
        this.width = width;
        return this;
    }
    
    public Object height() {
        return this.height;
    }
    
    public MapLocation height(final Object height) {
        this.height = height;
        return this;
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
