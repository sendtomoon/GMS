package com.jy.common.utils.echarts.style;

import java.io.*;

public class ChordStyle implements Serializable
{
    private static final long serialVersionUID = -9135284895463659472L;
    private Integer width;
    private String color;
    private String borderColor;
    private Integer borderWidth;
    private Double opacity;
    
    public String color() {
        return this.color;
    }
    
    public ChordStyle color(final String color) {
        this.color = color;
        return this;
    }
    
    public Double opacity() {
        return this.opacity;
    }
    
    public ChordStyle opacity(final Double opacity) {
        this.opacity = opacity;
        return this;
    }
    
    public String borderColor() {
        return this.borderColor;
    }
    
    public ChordStyle borderColor(final String borderColor) {
        this.borderColor = borderColor;
        return this;
    }
    
    public Integer width() {
        return this.width;
    }
    
    public ChordStyle width(final Integer width) {
        this.width = width;
        return this;
    }
    
    public Integer borderWidth() {
        return this.borderWidth;
    }
    
    public ChordStyle borderWidth(final Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
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
    
    public Integer getWidth() {
        return this.width;
    }
    
    public void setWidth(final Integer width) {
        this.width = width;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(final String color) {
        this.color = color;
    }
    
    public Double getOpacity() {
        return this.opacity;
    }
    
    public void setOpacity(final Double opacity) {
        this.opacity = opacity;
    }
}
