package com.jy.common.utils.echarts.series.force;

import java.io.*;
import com.jy.common.utils.echarts.style.*;

public class Link implements Serializable
{
    private static final long serialVersionUID = 7882141565696266870L;
    private Object source;
    private Object target;
    private Integer weight;
    private ItemStyle itemStyle;
    
    public Link() {
    }
    
    public Link(final Object source, final Object target, final Integer weight) {
        this.source = source;
        this.target = target;
        this.weight = weight;
    }
    
    public Object source() {
        return this.source;
    }
    
    public Link source(final Object source) {
        this.source = source;
        return this;
    }
    
    public Object target() {
        return this.target;
    }
    
    public Link target(final Object target) {
        this.target = target;
        return this;
    }
    
    public Integer weight() {
        return this.weight;
    }
    
    public Link weight(final Integer weight) {
        this.weight = weight;
        return this;
    }
    
    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }
    
    public ItemStyle getItemStyle() {
        return this.itemStyle;
    }
    
    public void setItemStyle(final ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }
    
    public Object getSource() {
        return this.source;
    }
    
    public void setSource(final Object source) {
        this.source = source;
    }
    
    public Object getTarget() {
        return this.target;
    }
    
    public void setTarget(final Object target) {
        this.target = target;
    }
    
    public Integer getWeight() {
        return this.weight;
    }
    
    public void setWeight(final Integer weight) {
        this.weight = weight;
    }
}
