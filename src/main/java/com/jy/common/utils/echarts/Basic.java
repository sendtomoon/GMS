package com.jy.common.utils.echarts;

import java.io.*;
import com.jy.common.utils.echarts.code.*;

public abstract class Basic<T> implements Serializable
{
    private static final long serialVersionUID = 1L;
    private Boolean show;
    private Object x;
    private Object y;
    private String backgroundColor;
    private String borderColor;
    private Integer borderWidth;
    private Object padding;
    private Integer itemGap;
    private Integer zlevel;
    private Integer z;
    
    public T zlevel(final Integer zlevel) {
        this.zlevel = zlevel;
        return (T)this;
    }
    
    public Integer zlevel() {
        return this.zlevel;
    }
    
    public T z(final Integer z) {
        this.z = z;
        return (T)this;
    }
    
    public Integer z() {
        return this.z;
    }
    
    public Boolean show() {
        return this.show;
    }
    
    public T show(final Boolean show) {
        this.show = show;
        return (T)this;
    }
    
    public Object x() {
        return this.x;
    }
    
    public T x(final Object x) {
        this.x = x;
        return (T)this;
    }
    
    public Object y() {
        return this.y;
    }
    
    public T y(final Object y) {
        this.y = y;
        return (T)this;
    }
    
    public String backgroundColor() {
        return this.backgroundColor;
    }
    
    public T backgroundColor(final String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return (T)this;
    }
    
    public String borderColor() {
        return this.borderColor;
    }
    
    public T borderColor(final String borderColor) {
        this.borderColor = borderColor;
        return (T)this;
    }
    
    public Integer borderWidth() {
        return this.borderWidth;
    }
    
    public T borderWidth(final Integer borderWidth) {
        this.borderWidth = borderWidth;
        return (T)this;
    }
    
    public Object padding() {
        return this.padding;
    }
    
    public T padding(final Integer padding) {
        this.padding = padding;
        return (T)this;
    }
    
    public T padding(final Integer... padding) {
        if (padding != null && padding.length > 4) {
            throw new RuntimeException("padding\u5c5e\u6027\u6700\u591a\u53ef\u4ee5\u63a5\u65364\u4e2a\u53c2\u6570!");
        }
        this.padding = padding;
        return (T)this;
    }
    
    public Integer itemGap() {
        return this.itemGap;
    }
    
    public T itemGap(final Integer itemGap) {
        this.itemGap = itemGap;
        return (T)this;
    }
    
    public T x(final X x) {
        this.x = x;
        return (T)this;
    }
    
    public T y(final Y y) {
        this.y = y;
        return (T)this;
    }
    
    public Boolean getShow() {
        return this.show;
    }
    
    public void setShow(final Boolean show) {
        this.show = show;
    }
    
    public Object getX() {
        return this.x;
    }
    
    public void setX(final Object x) {
        this.x = x;
    }
    
    public Object getY() {
        return this.y;
    }
    
    public void setY(final Object y) {
        this.y = y;
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
    
    public Object getPadding() {
        return this.padding;
    }
    
    public void setPadding(final Integer padding) {
        this.padding = padding;
    }
    
    public void setPadding(final Object padding) {
        this.padding = padding;
    }
    
    public Integer getItemGap() {
        return this.itemGap;
    }
    
    public void setItemGap(final Integer itemGap) {
        this.itemGap = itemGap;
    }
    
    public Integer getZlevel() {
        return this.zlevel;
    }
    
    public void setZlevel(final Integer zlevel) {
        this.zlevel = zlevel;
    }
    
    public Integer getZ() {
        return this.z;
    }
    
    public void setZ(final Integer z) {
        this.z = z;
    }
}
