package com.jy.common.utils.echarts.axis;

import java.io.*;
import com.jy.common.utils.echarts.style.*;

public class AxisLine implements Serializable
{
    private static final long serialVersionUID = -7486014114670118509L;
    private Boolean show;
    private Boolean onZero;
    private LineStyle lineStyle;
    
    public Boolean show() {
        return this.show;
    }
    
    public AxisLine show(final Boolean show) {
        this.show = show;
        return this;
    }
    
    public Boolean onZero() {
        return this.onZero;
    }
    
    public AxisLine onZero(final Boolean onZero) {
        this.onZero = onZero;
        return this;
    }
    
    public LineStyle lineStyle() {
        if (this.lineStyle == null) {
            this.lineStyle = new LineStyle();
        }
        return this.lineStyle;
    }
    
    public AxisLine lineStyle(final LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }
    
    public LineStyle getLineStyle() {
        return this.lineStyle;
    }
    
    public void setLineStyle(final LineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }
    
    public Boolean getShow() {
        return this.show;
    }
    
    public void setShow(final Boolean show) {
        this.show = show;
    }
    
    public Boolean getOnZero() {
        return this.onZero;
    }
    
    public void setOnZero(final Boolean onZero) {
        this.onZero = onZero;
    }
}
