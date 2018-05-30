package com.jy.common.utils.echarts.series.force;

import java.io.*;
import com.jy.common.utils.echarts.style.*;

public class Category implements Serializable
{
    private static final long serialVersionUID = 5805816011061262622L;
    private String name;
    private Object symbol;
    private Object symbolSize;
    private Boolean draggable;
    private ItemStyle itemStyle;
    
    public Category() {
    }
    
    public Category(final String name) {
        this.name = name;
    }
    
    public String name() {
        return this.name;
    }
    
    public Category name(final String name) {
        this.name = name;
        return this;
    }
    
    public Object symbol() {
        return this.symbol;
    }
    
    public Category symbol(final Object symbol) {
        this.symbol = symbol;
        return this;
    }
    
    public Object symbolSize() {
        return this.symbolSize;
    }
    
    public Category symbolSize(final Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }
    
    public Boolean draggable() {
        return this.draggable;
    }
    
    public Category draggable(final Boolean draggable) {
        this.draggable = draggable;
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
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
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
    
    public Boolean getDraggable() {
        return this.draggable;
    }
    
    public void setDraggable(final Boolean draggable) {
        this.draggable = draggable;
    }
}
