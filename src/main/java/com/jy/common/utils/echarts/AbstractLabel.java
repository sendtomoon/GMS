package com.jy.common.utils.echarts;

import java.io.*;
import com.jy.common.utils.echarts.style.*;
import com.jy.common.utils.echarts.code.*;

public abstract class AbstractLabel<T> implements Serializable
{
    private static final long serialVersionUID = -6908403517815789999L;
    private Boolean show;
    private Object interval;
    private Integer rotate;
    private Object formatter;
    private TextStyle textStyle;
    private Object position;
    private Boolean clickable;
    private Integer margin;
    private String color;
    
    public T textStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
        return (T)this;
    }
    
    public Boolean show() {
        return this.show;
    }
    
    public T show(final Boolean show) {
        this.show = show;
        return (T)this;
    }
    
    public Object position() {
        return this.position;
    }
    
    public T position(final Object position) {
        this.position = position;
        return (T)this;
    }
    
    public T position(final Position position) {
        this.position = position;
        return (T)this;
    }
    
    public Object interval() {
        return this.interval;
    }
    
    public T interval(final Object interval) {
        this.interval = interval;
        return (T)this;
    }
    
    public Integer rotate() {
        return this.rotate;
    }
    
    public T rotate(final Integer rotate) {
        this.rotate = rotate;
        return (T)this;
    }
    
    public Boolean clickable() {
        return this.clickable;
    }
    
    public T clickable(final Boolean clickable) {
        this.clickable = clickable;
        return (T)this;
    }
    
    public Object formatter() {
        return this.formatter;
    }
    
    public T formatter(final Object formatter) {
        this.formatter = formatter;
        return (T)this;
    }
    
    public String color() {
        return this.color;
    }
    
    public T color(final String color) {
        this.color = color;
        return (T)this;
    }
    
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }
    
    public Integer margin() {
        return this.margin;
    }
    
    public T margin(final Integer margin) {
        this.margin = margin;
        return (T)this;
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
    
    public Object getPosition() {
        return this.position;
    }
    
    public void setPosition(final Object position) {
        this.position = position;
    }
    
    public Object getInterval() {
        return this.interval;
    }
    
    public void setInterval(final Object interval) {
        this.interval = interval;
    }
    
    public Integer getRotate() {
        return this.rotate;
    }
    
    public void setRotate(final Integer rotate) {
        this.rotate = rotate;
    }
    
    public Boolean getClickable() {
        return this.clickable;
    }
    
    public void setClickable(final Boolean clickable) {
        this.clickable = clickable;
    }
    
    public Object getFormatter() {
        return this.formatter;
    }
    
    public void setFormatter(final Object formatter) {
        this.formatter = formatter;
    }
    
    public Integer getMargin() {
        return this.margin;
    }
    
    public void setMargin(final Integer margin) {
        this.margin = margin;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(final String color) {
        this.color = color;
    }
}
