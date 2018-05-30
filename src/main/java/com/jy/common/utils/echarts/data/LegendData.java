package com.jy.common.utils.echarts.data;

import java.io.*;
import com.jy.common.utils.echarts.style.*;

public class LegendData implements Serializable
{
    private static final long serialVersionUID = 7218201600361155091L;
    private String name;
    private TextStyle textStyle;
    private String icon;
    
    public LegendData(final String name) {
        this.name = name;
    }
    
    public LegendData(final String name, final TextStyle textStyle) {
        this.name = name;
        this.textStyle = textStyle;
    }
    
    public LegendData(final String name, final TextStyle textStyle, final String icon) {
        this.name = name;
        this.textStyle = textStyle;
        this.icon = icon;
    }
    
    public String name() {
        return this.name;
    }
    
    public LegendData name(final String name) {
        this.name = name;
        return this;
    }
    
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }
    
    public LegendData textStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }
    
    public String icon() {
        return this.icon;
    }
    
    public LegendData icon(final String icon) {
        this.icon = icon;
        return this;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public TextStyle getTextStyle() {
        return this.textStyle;
    }
    
    public void setTextStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
    }
    
    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(final String icon) {
        this.icon = icon;
    }
}
