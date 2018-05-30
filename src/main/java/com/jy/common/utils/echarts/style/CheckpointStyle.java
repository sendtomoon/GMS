package com.jy.common.utils.echarts.style;

import java.io.*;
import com.jy.common.utils.echarts.*;

public class CheckpointStyle implements Serializable
{
    private static final long serialVersionUID = -5003403667974720869L;
    private Object symbol;
    private Object symbolSize;
    private String color;
    private String borderColor;
    private Object borderWidth;
    private Label label;
    
    public CheckpointStyle label(final Label label) {
        this.label = label;
        return this;
    }
    
    public Object symbol() {
        return this.symbol;
    }
    
    public CheckpointStyle symbol(final Object symbol) {
        this.symbol = symbol;
        return this;
    }
    
    public Object symbolSize() {
        return this.symbolSize;
    }
    
    public CheckpointStyle symbolSize(final Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }
    
    public String color() {
        return this.color;
    }
    
    public CheckpointStyle color(final String color) {
        this.color = color;
        return this;
    }
    
    public String borderColor() {
        return this.borderColor;
    }
    
    public CheckpointStyle borderColor(final String borderColor) {
        this.borderColor = borderColor;
        return this;
    }
    
    public Object borderWidth() {
        return this.borderWidth;
    }
    
    public CheckpointStyle borderWidth(final Object borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }
    
    public Label label() {
        if (this.label == null) {
            this.label = new Label();
        }
        return this.label;
    }
    
    public Label getLabel() {
        return this.label;
    }
    
    public void setLabel(final Label label) {
        this.label = label;
    }
    
    public Object getSymbol() {
        return this.symbol;
    }
    
    public void setSymbol(final Object symbol) {
        this.symbol = symbol;
    }
    
    public Object getSymbolSize() {
        return this.symbolSize;
    }
    
    public void setSymbolSize(final Object symbolSize) {
        this.symbolSize = symbolSize;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(final String color) {
        this.color = color;
    }
    
    public String getBorderColor() {
        return this.borderColor;
    }
    
    public void setBorderColor(final String borderColor) {
        this.borderColor = borderColor;
    }
    
    public Object getBorderWidth() {
        return this.borderWidth;
    }
    
    public void setBorderWidth(final Object borderWidth) {
        this.borderWidth = borderWidth;
    }
}
