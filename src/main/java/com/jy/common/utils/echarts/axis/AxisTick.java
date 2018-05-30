package com.jy.common.utils.echarts.axis;

import java.io.*;
import com.jy.common.utils.echarts.style.*;

public class AxisTick implements Serializable
{
    private static final long serialVersionUID = -1941931349381173253L;
    private Boolean show;
    private Object interval;
    private Boolean onGap;
    private Boolean inside;
    private Integer length;
    private LineStyle lineStyle;
    private Integer splitNumber;
    
    public Boolean show() {
        return this.show;
    }
    
    public AxisTick show(final Boolean show) {
        this.show = show;
        return this;
    }
    
    public Object interval() {
        return this.interval;
    }
    
    public AxisTick interval(final Object interval) {
        this.interval = interval;
        return this;
    }
    
    public Boolean onGap() {
        return this.onGap;
    }
    
    public AxisTick onGap(final Boolean onGap) {
        this.onGap = onGap;
        return this;
    }
    
    public Boolean inside() {
        return this.inside;
    }
    
    public AxisTick inside(final Boolean inside) {
        this.inside = inside;
        return this;
    }
    
    public Integer length() {
        return this.length;
    }
    
    public AxisTick length(final Integer length) {
        this.length = length;
        return this;
    }
    
    public LineStyle lineStyle() {
        if (this.lineStyle == null) {
            this.lineStyle = new LineStyle();
        }
        return this.lineStyle;
    }
    
    public AxisTick lineStyle(final LineStyle style) {
        this.lineStyle = style;
        return this;
    }
    
    public Integer splitNumber() {
        return this.splitNumber;
    }
    
    public AxisTick splitNumber(final Integer splitNumber) {
        this.splitNumber = splitNumber;
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
    
    public Object getInterval() {
        return this.interval;
    }
    
    public void setInterval(final Object interval) {
        this.interval = interval;
    }
    
    public Boolean getOnGap() {
        return this.onGap;
    }
    
    public void setOnGap(final Boolean onGap) {
        this.onGap = onGap;
    }
    
    public Boolean getInside() {
        return this.inside;
    }
    
    public void setInside(final Boolean inside) {
        this.inside = inside;
    }
    
    public Integer getLength() {
        return this.length;
    }
    
    public void setLength(final Integer length) {
        this.length = length;
    }
    
    public Integer getSplitNumber() {
        return this.splitNumber;
    }
    
    public void setSplitNumber(final Integer splitNumber) {
        this.splitNumber = splitNumber;
    }
}
