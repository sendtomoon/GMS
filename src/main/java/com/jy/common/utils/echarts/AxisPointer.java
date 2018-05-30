package com.jy.common.utils.echarts;

import java.io.*;
import com.jy.common.utils.echarts.code.*;
import com.jy.common.utils.echarts.style.*;

public class AxisPointer implements Serializable
{
    private static final long serialVersionUID = 6421899185681683630L;
    private PointerType type;
    private LineStyle lineStyle;
    private CrossStyle crossStyle;
    private ShadowStyle shadowStyle;
    private TextStyle textStyle;
    
    public TextStyle textStyle() {
        return this.textStyle;
    }
    
    public AxisPointer textStyle(final TextStyle textStyle) {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        this.textStyle = textStyle;
        return this;
    }
    
    public AxisPointer lineStyle(final LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }
    
    public AxisPointer crossStyle(final CrossStyle crossStyle) {
        this.crossStyle = crossStyle;
        return this;
    }
    
    public AxisPointer shadowStyle(final ShadowStyle shadowStyle) {
        this.shadowStyle = shadowStyle;
        return this;
    }
    
    public PointerType type() {
        return this.type;
    }
    
    public AxisPointer type(final PointerType type) {
        this.type = type;
        return this;
    }
    
    public LineStyle lineStyle() {
        if (this.lineStyle == null) {
            this.lineStyle = new LineStyle();
        }
        return this.lineStyle;
    }
    
    public CrossStyle crossStyle() {
        if (this.crossStyle == null) {
            this.crossStyle = new CrossStyle();
        }
        return this.crossStyle;
    }
    
    public ShadowStyle shadowStyle() {
        if (this.shadowStyle == null) {
            this.shadowStyle = new ShadowStyle();
        }
        return this.shadowStyle;
    }
    
    public LineStyle getLineStyle() {
        return this.lineStyle;
    }
    
    public void setLineStyle(final LineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }
    
    public CrossStyle getCrossStyle() {
        return this.crossStyle;
    }
    
    public void setCrossStyle(final CrossStyle crossStyle) {
        this.crossStyle = crossStyle;
    }
    
    public ShadowStyle getShadowStyle() {
        return this.shadowStyle;
    }
    
    public void setShadowStyle(final ShadowStyle shadowStyle) {
        this.shadowStyle = shadowStyle;
    }
    
    public PointerType getType() {
        return this.type;
    }
    
    public void setType(final PointerType type) {
        this.type = type;
    }
    
    public TextStyle getTextStyle() {
        return this.textStyle;
    }
    
    public void setTextStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
    }
}
