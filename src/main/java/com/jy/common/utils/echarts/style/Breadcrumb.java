package com.jy.common.utils.echarts.style;

import java.io.*;

public class Breadcrumb implements Serializable
{
    private static final long serialVersionUID = 1L;
    private Boolean show;
    private TextStyle textStyle;
    
    public Breadcrumb() {
    }
    
    public Breadcrumb(final Boolean show) {
        this.show = show;
    }
    
    public Breadcrumb(final Boolean show, final TextStyle textStyle) {
        this.show = show;
        this.textStyle = textStyle;
    }
    
    public Breadcrumb show(final Boolean show) {
        this.show = show;
        return this;
    }
    
    public Boolean show() {
        return this.show;
    }
    
    public Breadcrumb textStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }
    
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }
}
