package com.jy.common.utils.echarts.data;

import java.io.*;
import com.jy.common.utils.echarts.style.*;

public class AxisData implements Serializable
{
    private static final long serialVersionUID = -6515942952591477027L;
    private Object value;
    private TextStyle textStyle;
    
    public AxisData(final Object value) {
        this.value = value;
    }
    
    public AxisData(final Object value, final TextStyle textStyle) {
        this.value = value;
        this.textStyle = textStyle;
    }
    
    public Object value() {
        return this.value;
    }
    
    public AxisData value(final Object value) {
        this.value = value;
        return this;
    }
    
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }
    
    public AxisData textStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }
    
    public Object getValue() {
        return this.value;
    }
    
    public void setValue(final Object value) {
        this.value = value;
    }
    
    public TextStyle getTextStyle() {
        return this.textStyle;
    }
    
    public void setTextStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
    }
}
