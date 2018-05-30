package com.jy.common.utils.echarts;

import java.io.*;
import com.jy.common.utils.echarts.style.*;

public class LabelLine implements Serializable
{
    private static final long serialVersionUID = 3359589478018844177L;
    private Boolean show;
    private Integer length;
    private LineStyle lineStyle;
    
    public Boolean show() {
        return this.show;
    }
    
    public LabelLine show(final Boolean show) {
        this.show = show;
        return this;
    }
    
    public Integer length() {
        return this.length;
    }
    
    public LabelLine length(final Integer length) {
        this.length = length;
        return this;
    }
    
    public LineStyle lineStyle() {
        if (this.lineStyle == null) {
            this.lineStyle = new LineStyle();
        }
        return this.lineStyle;
    }
    
    public LabelLine lineStyle(final LineStyle style) {
        this.lineStyle = style;
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
    
    public Integer getLength() {
        return this.length;
    }
    
    public void setLength(final Integer length) {
        this.length = length;
    }
}
