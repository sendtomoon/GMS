package com.jy.common.utils.echarts.data;

import com.jy.common.utils.echarts.*;

public class Data extends BasicData<Data>
{
    private Integer valueIndex;
    private Object min;
    private Object max;
    private String icon;
    private Boolean selected;
    private Tooltip tooltip;
    private Double smoothRadian;
    
    public Data() {
    }
    
    public Data(final String name) {
        super(name);
    }
    
    public Data(final String name, final Object value) {
        super(name, value);
    }
    
    public Data(final String name, final Object symbol, final Object symbolSize) {
        super(name, symbol, symbolSize);
    }
    
    public Data(final Object value, final Object symbol) {
        super(value, symbol);
    }
    
    public Data(final Object value, final Object symbol, final Object symbolSize) {
        super(value, symbol, symbolSize);
    }
    
    public Double smoothRadian() {
        return this.smoothRadian;
    }
    
    public Data smoothRadian(final Double smoothRadian) {
        this.smoothRadian = smoothRadian;
        return this;
    }
    
    public Tooltip tooltip() {
        if (this.tooltip == null) {
            this.tooltip = new Tooltip();
        }
        return this.tooltip;
    }
    
    public Data tooltip(final Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }
    
    public Boolean selected() {
        return this.selected;
    }
    
    public Data selected(final Boolean selected) {
        this.selected = selected;
        return this;
    }
    
    public String icon() {
        return this.icon;
    }
    
    public Data icon(final String icon) {
        this.icon = icon;
        return this;
    }
    
    public Object min() {
        return this.min;
    }
    
    public Data min(final Object min) {
        this.min = min;
        return this;
    }
    
    public Object max() {
        return this.max;
    }
    
    public Data max(final Object max) {
        this.max = max;
        return this;
    }
    
    public Integer valueIndex() {
        return this.valueIndex;
    }
    
    public Data valueIndex(final Integer valueIndex) {
        this.valueIndex = valueIndex;
        return this;
    }
    
    public Integer getValueIndex() {
        return this.valueIndex;
    }
    
    public Data setValueIndex(final Integer valueIndex) {
        this.valueIndex = valueIndex;
        return this;
    }
    
    public Object getMin() {
        return this.min;
    }
    
    public void setMin(final Object min) {
        this.min = min;
    }
    
    public Object getMax() {
        return this.max;
    }
    
    public void setMax(final Object max) {
        this.max = max;
    }
    
    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(final String icon) {
        this.icon = icon;
    }
    
    public Boolean getSelected() {
        return this.selected;
    }
    
    public void setSelected(final Boolean selected) {
        this.selected = selected;
    }
    
    public Tooltip getTooltip() {
        return this.tooltip;
    }
    
    public void setTooltip(final Tooltip tooltip) {
        this.tooltip = tooltip;
    }
    
    public Double getSmoothRadian() {
        return this.smoothRadian;
    }
    
    public void setSmoothRadian(final Double smoothRadian) {
        this.smoothRadian = smoothRadian;
    }
}
