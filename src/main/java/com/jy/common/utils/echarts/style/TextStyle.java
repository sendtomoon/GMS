package com.jy.common.utils.echarts.style;

import java.io.*;
import com.jy.common.utils.echarts.code.*;

public class TextStyle implements Serializable
{
    private static final long serialVersionUID = 5748410562515851843L;
    private String color;
    private X align;
    private Baseline baseline;
    private String decoration;
    private Integer fontSize;
    private String fontFamily;
    private String fontFamily2;
    private FontStyle fontStyle;
    private Object fontWeight;
    
    public Baseline baseline() {
        return this.baseline;
    }
    
    public TextStyle baseline(final Baseline baseline) {
        this.baseline = baseline;
        return this;
    }
    
    public String color() {
        return this.color;
    }
    
    public TextStyle color(final String color) {
        this.color = color;
        return this;
    }
    
    public String decoration() {
        return this.decoration;
    }
    
    public TextStyle decoration(final String decoration) {
        this.decoration = decoration;
        return this;
    }
    
    public X align() {
        return this.align;
    }
    
    public TextStyle align(final X align) {
        this.align = align;
        return this;
    }
    
    public Integer fontSize() {
        return this.fontSize;
    }
    
    public TextStyle fontSize(final Integer fontSize) {
        this.fontSize = fontSize;
        return this;
    }
    
    public String fontFamily() {
        return this.fontFamily;
    }
    
    public TextStyle fontFamily(final String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }
    
    public String fontFamily2() {
        return this.fontFamily2;
    }
    
    public TextStyle fontFamily2(final String fontFamily2) {
        this.fontFamily2 = fontFamily2;
        return this;
    }
    
    public FontStyle fontStyle() {
        return this.fontStyle;
    }
    
    public TextStyle fontStyle(final FontStyle fontStyle) {
        this.fontStyle = fontStyle;
        return this;
    }
    
    public Object fontWeight() {
        return this.fontWeight;
    }
    
    public TextStyle fontWeight(final Object fontWeight) {
        this.fontWeight = fontWeight;
        return this;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(final String color) {
        this.color = color;
    }
    
    public String getDecoration() {
        return this.decoration;
    }
    
    public void setDecoration(final String decoration) {
        this.decoration = decoration;
    }
    
    public X getAlign() {
        return this.align;
    }
    
    public void setAlign(final X align) {
        this.align = align;
    }
    
    public Integer getFontSize() {
        return this.fontSize;
    }
    
    public void setFontSize(final Integer fontSize) {
        this.fontSize = fontSize;
    }
    
    public String getFontFamily() {
        return this.fontFamily;
    }
    
    public void setFontFamily(final String fontFamily) {
        this.fontFamily = fontFamily;
    }
    
    public String getFontFamily2() {
        return this.fontFamily2;
    }
    
    public void setFontFamily2(final String fontFamily2) {
        this.fontFamily2 = fontFamily2;
    }
    
    public FontStyle getFontStyle() {
        return this.fontStyle;
    }
    
    public void setFontStyle(final FontStyle fontStyle) {
        this.fontStyle = fontStyle;
    }
    
    public Object getFontWeight() {
        return this.fontWeight;
    }
    
    public void setFontWeight(final Object fontWeight) {
        this.fontWeight = fontWeight;
    }
    
    public Baseline getBaseline() {
        return this.baseline;
    }
    
    public void setBaseline(final Baseline baseline) {
        this.baseline = baseline;
    }
}
