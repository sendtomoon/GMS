package com.jy.common.utils.echarts.series.gauge;

import java.io.*;
import com.jy.common.utils.echarts.style.*;

public class Detail implements Serializable
{
    private static final long serialVersionUID = 4155443904476463247L;
    private Boolean show;
    private String backgroundColor;
    private String borderColor;
    private Integer borderWidth;
    private Object width;
    private Object height;
    private Object offsetCenter;
    private String formatter;
    private TextStyle textStyle;
    
    public Boolean show() {
        return this.show;
    }
    
    public Detail show(final Boolean show) {
        this.show = show;
        return this;
    }
    
    public String backgroundColor() {
        return this.backgroundColor;
    }
    
    public Detail backgroundColor(final String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    
    public String borderColor() {
        return this.borderColor;
    }
    
    public Detail borderColor(final String borderColor) {
        this.borderColor = borderColor;
        return this;
    }
    
    public Integer borderWidth() {
        return this.borderWidth;
    }
    
    public Detail borderWidth(final Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }
    
    public Object width() {
        return this.width;
    }
    
    public Detail width(final Object width) {
        this.width = width;
        return this;
    }
    
    public Object height() {
        return this.height;
    }
    
    public Detail height(final Object height) {
        this.height = height;
        return this;
    }
    
    public Object offsetCenter() {
        return this.offsetCenter;
    }
    
    public Detail offsetCenter(final Object offsetCenter) {
        this.offsetCenter = offsetCenter;
        return this;
    }
    
    public String formatter() {
        return this.formatter;
    }
    
    public Detail formatter(final String formatter) {
        this.formatter = formatter;
        return this;
    }
    
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }
    
    public TextStyle getTextStyle() {
        return this.textStyle;
    }
    
    public void setTextStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
    }
    
    public Boolean getShow() {
        return this.show;
    }
    
    public void setShow(final Boolean show) {
        this.show = show;
    }
    
    public String getBackgroundColor() {
        return this.backgroundColor;
    }
    
    public void setBackgroundColor(final String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    
    public String getBorderColor() {
        return this.borderColor;
    }
    
    public void setBorderColor(final String borderColor) {
        this.borderColor = borderColor;
    }
    
    public Integer getBorderWidth() {
        return this.borderWidth;
    }
    
    public void setBorderWidth(final Integer borderWidth) {
        this.borderWidth = borderWidth;
    }
    
    public Object getWidth() {
        return this.width;
    }
    
    public void setWidth(final Object width) {
        this.width = width;
    }
    
    public Object getHeight() {
        return this.height;
    }
    
    public void setHeight(final Object height) {
        this.height = height;
    }
    
    public Object getOffsetCenter() {
        return this.offsetCenter;
    }
    
    public void setOffsetCenter(final Object offsetCenter) {
        this.offsetCenter = offsetCenter;
    }
    
    public String getFormatter() {
        return this.formatter;
    }
    
    public void setFormatter(final String formatter) {
        this.formatter = formatter;
    }
}
