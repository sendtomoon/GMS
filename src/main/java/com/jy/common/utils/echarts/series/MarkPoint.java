package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.*;
import com.jy.common.utils.echarts.style.*;

public class MarkPoint extends AbstractData<MarkPoint>
{
    private Object symbol;
    private Object symbolSize;
    private Object symbolRoate;
    private Boolean large;
    private Effect effect;
    private ItemStyle itemStyle;
    private GeoCoord geoCoord;
    
    public MarkPoint effect(final Effect effect) {
        this.effect = effect;
        return this;
    }
    
    public MarkPoint itemStyle(final ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }
    
    public Object symbol() {
        return this.symbol;
    }
    
    public MarkPoint symbol(final Object symbol) {
        this.symbol = symbol;
        return this;
    }
    
    public Object symbolSize() {
        return this.symbolSize;
    }
    
    public MarkPoint symbolSize(final Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }
    
    public Object symbolRoate() {
        return this.symbolRoate;
    }
    
    public MarkPoint symbolRoate(final Object symbolRoate) {
        this.symbolRoate = symbolRoate;
        return this;
    }
    
    public Boolean large() {
        return this.large;
    }
    
    public MarkPoint large(final Boolean large) {
        this.large = large;
        return this;
    }
    
    public Effect effect() {
        if (this.effect == null) {
            this.effect = new Effect();
        }
        return this.effect;
    }
    
    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }
    
    public GeoCoord geoCoord() {
        if (this.geoCoord == null) {
            this.geoCoord = new GeoCoord();
        }
        return this.geoCoord;
    }
    
    public MarkPoint geoCoord(final String name, final String x, final String y) {
        this.geoCoord().put(name, x, y);
        return this;
    }
    
    public ItemStyle getItemStyle() {
        return this.itemStyle;
    }
    
    public void setItemStyle(final ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }
    
    public Effect getEffect() {
        return this.effect;
    }
    
    public void setEffect(final Effect effect) {
        this.effect = effect;
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
    
    public Object getSymbolRoate() {
        return this.symbolRoate;
    }
    
    public void setSymbolRoate(final Object symbolRoate) {
        this.symbolRoate = symbolRoate;
    }
    
    public Boolean getLarge() {
        return this.large;
    }
    
    public void setLarge(final Boolean large) {
        this.large = large;
    }
    
    public GeoCoord getGeoCoord() {
        return this.geoCoord;
    }
    
    public void setGeoCoord(final GeoCoord geoCoord) {
        this.geoCoord = geoCoord;
    }
}
