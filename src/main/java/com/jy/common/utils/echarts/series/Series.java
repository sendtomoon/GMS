package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.*;
import com.jy.common.utils.echarts.style.*;
import com.jy.common.utils.echarts.code.*;

public abstract class Series<T> extends AbstractData<T> implements Chart
{
    private Boolean legendHoverLink;
    private Integer xAxisIndex;
    private Integer yAxisIndex;
    private String name;
    private SeriesType type;
    private String stack;
    private Tooltip tooltip;
    private ItemStyle itemStyle;
    private MarkPoint markPoint;
    private MarkLine markLine;
    private Object symbol;
    private Object symbolSize;
    private Object symbolRoate;
    private Boolean showAllSymbol;
    private Boolean calculable;
    private Integer zlevel;
    private Integer z;
    
    protected Series() {
    }
    
    protected Series(final String name) {
        this.name = name;
    }
    
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
    
    public Series tooltip(final Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }
    
    public Series itemStyle(final ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }
    
    public Series markPoint(final MarkPoint markPoint) {
        this.markPoint = markPoint;
        return this;
    }
    
    public Series markLine(final MarkLine markLine) {
        this.markLine = markLine;
        return this;
    }
    
    public Boolean legendHoverLink() {
        return this.legendHoverLink;
    }
    
    public T legendHoverLink(final Boolean legendHoverLink) {
        this.legendHoverLink = legendHoverLink;
        return (T)this;
    }
    
    public Integer xAxisIndex() {
        return this.xAxisIndex;
    }
    
    public T xAxisIndex(final Integer xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
        return (T)this;
    }
    
    public Integer yAxisIndex() {
        return this.yAxisIndex;
    }
    
    public T yAxisIndex(final Integer yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return (T)this;
    }
    
    public String name() {
        return this.name;
    }
    
    public T name(final String name) {
        this.name = name;
        return (T)this;
    }
    
    public SeriesType type() {
        return this.type;
    }
    
    public T type(final SeriesType type) {
        this.type = type;
        return (T)this;
    }
    
    public String stack() {
        return this.stack;
    }
    
    public T stack(final String stack) {
        this.stack = stack;
        return (T)this;
    }
    
    public Tooltip tooltip() {
        if (this.tooltip == null) {
            this.tooltip = new Tooltip();
        }
        return this.tooltip;
    }
    
    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }
    
    public MarkPoint markPoint() {
        if (this.markPoint == null) {
            this.markPoint = new MarkPoint();
        }
        return this.markPoint;
    }
    
    public MarkLine markLine() {
        if (this.markLine == null) {
            this.markLine = new MarkLine();
        }
        return this.markLine;
    }
    
    public Object symbol() {
        return this.symbol;
    }
    
    public T symbol(final Object symbol) {
        this.symbol = symbol;
        return (T)this;
    }
    
    public T symbol(final Symbol symbol) {
        this.symbol = symbol;
        return (T)this;
    }
    
    public Object symbolSize() {
        return this.symbolSize;
    }
    
    public T symbolSize(final Object symbolSize) {
        this.symbolSize = symbolSize;
        return (T)this;
    }
    
    public Object symbolRoate() {
        return this.symbolRoate;
    }
    
    public T symbolRoate(final Object symbolRoate) {
        this.symbolRoate = symbolRoate;
        return (T)this;
    }
    
    public Boolean showAllSymbol() {
        return this.showAllSymbol;
    }
    
    public T calcuable(final Boolean calculable) {
        this.calculable = calculable;
        return (T)this;
    }
    
    public Boolean calculable() {
        return this.calculable;
    }
    
    public T showAllSymbol(final Boolean showAllSymbol) {
        this.showAllSymbol = showAllSymbol;
        return (T)this;
    }
    
    public Boolean getLegendHoverLink() {
        return this.legendHoverLink;
    }
    
    public void setLegendHoverLink(final Boolean legendHoverLink) {
        this.legendHoverLink = legendHoverLink;
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
    
    public MarkPoint getMarkPoint() {
        return this.markPoint;
    }
    
    public void setMarkPoint(final MarkPoint markPoint) {
        this.markPoint = markPoint;
    }
    
    public MarkLine getMarkLine() {
        return this.markLine;
    }
    
    public void setMarkLine(final MarkLine markLine) {
        this.markLine = markLine;
    }
    
    public Integer getxAxisIndex() {
        return this.xAxisIndex;
    }
    
    public void setxAxisIndex(final Integer xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
    }
    
    public Integer getyAxisIndex() {
        return this.yAxisIndex;
    }
    
    public void setyAxisIndex(final Integer yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public SeriesType getType() {
        return this.type;
    }
    
    public void setType(final SeriesType type) {
        this.type = type;
    }
    
    public String getStack() {
        return this.stack;
    }
    
    public void setStack(final String stack) {
        this.stack = stack;
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
    
    public Boolean getShowAllSymbol() {
        return this.showAllSymbol;
    }
    
    public void setShowAllSymbol(final Boolean showAllSymbol) {
        this.showAllSymbol = showAllSymbol;
    }
    
    public Boolean getCalculable() {
        return this.calculable;
    }
    
    public void setCalculable(final Boolean calculable) {
        this.calculable = calculable;
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
