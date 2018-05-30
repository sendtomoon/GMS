package com.jy.common.utils.echarts.style;

import java.io.*;
import com.jy.common.utils.echarts.code.*;

public class LineStyle implements Serializable
{
    private static final long serialVersionUID = 4765717693423256102L;
    private Object color;
    private Object color0;
    private LineType type;
    private Integer width;
    private String shadowColor;
    private Integer shadowBlur;
    private Integer shadowOffsetX;
    private Integer shadowOffsetY;
    
    public Object color() {
        return this.color;
    }
    
    public LineStyle color(final Object color) {
        this.color = color;
        return this;
    }
    
    public Object color0() {
        return this.color0;
    }
    
    public LineStyle color0(final Object color0) {
        this.color0 = color0;
        return this;
    }
    
    public LineType type() {
        return this.type;
    }
    
    public LineStyle type(final LineType type) {
        this.type = type;
        return this;
    }
    
    public Integer width() {
        return this.width;
    }
    
    public LineStyle width(final Integer width) {
        this.width = width;
        return this;
    }
    
    public String shadowColor() {
        return this.shadowColor;
    }
    
    public LineStyle shadowColor(final String shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }
    
    public Integer shadowBlur() {
        return this.shadowBlur;
    }
    
    public LineStyle shadowBlur(final Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }
    
    public Integer shadowOffsetX() {
        return this.shadowOffsetX;
    }
    
    public LineStyle shadowOffsetX(final Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return this;
    }
    
    public Integer shadowOffsetY() {
        return this.shadowOffsetY;
    }
    
    public LineStyle shadowOffsetY(final Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return this;
    }
    
    public Object getColor() {
        return this.color;
    }
    
    public void setColor(final Object color) {
        this.color = color;
    }
    
    public Object getColor0() {
        return this.color0;
    }
    
    public void setColor0(final Object color0) {
        this.color0 = color0;
    }
    
    public LineType getType() {
        return this.type;
    }
    
    public void setType(final LineType type) {
        this.type = type;
    }
    
    public Integer getWidth() {
        return this.width;
    }
    
    public void setWidth(final Integer width) {
        this.width = width;
    }
    
    public String getShadowColor() {
        return this.shadowColor;
    }
    
    public void setShadowColor(final String shadowColor) {
        this.shadowColor = shadowColor;
    }
    
    public Integer getShadowBlur() {
        return this.shadowBlur;
    }
    
    public void setShadowBlur(final Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
    }
    
    public Integer getShadowOffsetX() {
        return this.shadowOffsetX;
    }
    
    public void setShadowOffsetX(final Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
    }
    
    public Integer getShadowOffsetY() {
        return this.shadowOffsetY;
    }
    
    public void setShadowOffsetY(final Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
    }
}
