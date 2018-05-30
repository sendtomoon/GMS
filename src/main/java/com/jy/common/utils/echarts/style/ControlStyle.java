package com.jy.common.utils.echarts.style;

import java.io.*;

public class ControlStyle implements Serializable
{
    private static final long serialVersionUID = -3442438026749918760L;
    private Integer itemSize;
    private Integer itemGap;
    private Color normal;
    private Color emphasis;
    
    public Integer itemSize() {
        return this.itemSize;
    }
    
    public ControlStyle itemSize(final Integer itemSize) {
        this.itemSize = itemSize;
        return this;
    }
    
    public Integer itemGap() {
        return this.itemGap;
    }
    
    public ControlStyle itemGap(final Integer itemGap) {
        this.itemGap = itemGap;
        return this;
    }
    
    public Color normal() {
        if (this.normal == null) {
            this.normal = new Color();
        }
        return this.normal;
    }
    
    public ControlStyle normal(final Color normal) {
        this.normal = normal;
        return this;
    }
    
    public Color emphasis() {
        if (this.emphasis == null) {
            this.emphasis = new Color();
        }
        return this.emphasis;
    }
    
    public ControlStyle emphasis(final Color emphasis) {
        this.emphasis = emphasis;
        return this;
    }
    
    public Color getNormal() {
        return this.normal;
    }
    
    public void setNormal(final Color normal) {
        this.normal = normal;
    }
    
    public Color getEmphasis() {
        return this.emphasis;
    }
    
    public void setEmphasis(final Color emphasis) {
        this.emphasis = emphasis;
    }
    
    public Integer getItemSize() {
        return this.itemSize;
    }
    
    public void setItemSize(final Integer itemSize) {
        this.itemSize = itemSize;
    }
    
    public Integer getItemGap() {
        return this.itemGap;
    }
    
    public void setItemGap(final Integer itemGap) {
        this.itemGap = itemGap;
    }
    
    public class Color
    {
        private String color;
        
        public String color() {
            return this.color;
        }
        
        public Color color(final String color) {
            this.color = color;
            return this;
        }
        
        public String getColor() {
            return this.color;
        }
        
        public void setColor(final String color) {
            this.color = color;
        }
    }
}
