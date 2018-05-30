package com.jy.common.utils.echarts.axis;

import java.io.*;
import com.jy.common.utils.echarts.style.*;

public class SplitLine implements Serializable
{
    private static final long serialVersionUID = 6968396515815364363L;
    private Boolean show;
    private Boolean onGap;
    private LineStyle lineStyle;
    
    public Boolean show() {
        return this.show;
    }
    
    public SplitLine show(final Boolean show) {
        this.show = show;
        return this;
    }
    
    public Boolean onGap() {
        return this.onGap;
    }
    
    public SplitLine onGap(final Boolean onGap) {
        this.onGap = onGap;
        return this;
    }
    
    public SplitLine lineStyle(final LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }
    
    public LineStyle lineStyle() {
        if (this.lineStyle == null) {
            this.lineStyle = new LineStyle();
        }
        return this.lineStyle;
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
    
    public Boolean getOnGap() {
        return this.onGap;
    }
    
    public void setOnGap(final Boolean onGap) {
        this.onGap = onGap;
    }
}
