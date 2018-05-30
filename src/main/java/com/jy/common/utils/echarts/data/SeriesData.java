package com.jy.common.utils.echarts.data;

import java.io.*;
import com.jy.common.utils.echarts.*;
import com.jy.common.utils.echarts.style.*;

public class SeriesData implements Serializable
{
    private static final long serialVersionUID = -3295595963653443202L;
    private Object value;
    private Tooltip tooltip;
    private ItemStyle itemStyle;
    
    public SeriesData(final Object value) {
        this.value = value;
    }
    
    public SeriesData(final Object value, final Tooltip tooltip) {
        this.value = value;
        this.tooltip = tooltip;
    }
    
    public SeriesData(final Object value, final ItemStyle itemStyle) {
        this.value = value;
        this.itemStyle = itemStyle;
    }
    
    public SeriesData(final Object value, final Tooltip tooltip, final ItemStyle itemStyle) {
        this.value = value;
        this.tooltip = tooltip;
        this.itemStyle = itemStyle;
    }
    
    public Object value() {
        return this.value;
    }
    
    public SeriesData value(final Object value) {
        this.value = value;
        return this;
    }
    
    public Tooltip tooltip() {
        if (this.tooltip == null) {
            this.tooltip = new Tooltip();
        }
        return this.tooltip;
    }
    
    public SeriesData tooltip(final Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }
    
    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }
    
    public SeriesData itemStyle(final ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }
    
    public Object getValue() {
        return this.value;
    }
    
    public void setValue(final Object value) {
        this.value = value;
    }
    
    public Tooltip getTooltip() {
        return this.tooltip;
    }
    
    public void setTooltip(final Tooltip tooltip) {
        this.tooltip = tooltip;
    }
    
    public ItemStyle getItemStyle() {
        return this.itemStyle;
    }
    
    public void setItemStyle(final ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }
}
