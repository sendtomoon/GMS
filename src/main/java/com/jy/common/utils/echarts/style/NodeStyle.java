package com.jy.common.utils.echarts.style;

import com.jy.common.utils.echarts.code.*;

public class NodeStyle extends LinkStyle
{
    private BrushType brushType;
    private String color;
    
    public BrushType brushType() {
        return this.brushType;
    }
    
    public NodeStyle brushType(final BrushType brushType) {
        this.brushType = brushType;
        return this;
    }
    
    public String color() {
        return this.color;
    }
    
    public NodeStyle color(final String color) {
        this.color = color;
        return this;
    }
    
    public BrushType getBrushType() {
        return this.brushType;
    }
    
    public void setBrushType(final BrushType brushType) {
        this.brushType = brushType;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(final String color) {
        this.color = color;
    }
}
