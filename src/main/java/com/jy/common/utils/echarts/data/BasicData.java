package com.jy.common.utils.echarts.data;

import java.io.*;
import com.jy.common.utils.echarts.style.*;
import java.util.*;
import com.jy.common.utils.echarts.code.*;

public abstract class BasicData<T> implements Serializable
{
    private static final long serialVersionUID = 3510060011221090087L;
    private String name;
    private String text;
    private Object value;
    private Object x;
    private Object y;
    private Integer xAxis;
    private Integer yAxis;
    private MarkType type;
    private Object symbol;
    private Object symbolSize;
    private ItemStyle itemStyle;
    private TextStyle textStyle;
    
    public BasicData() {
    }
    
    protected BasicData(final String name) {
        this.name = name;
    }
    
    public BasicData(final String name, final Object value) {
        this.name = name;
        this.value = value;
    }
    
    public BasicData(final String name, final Object symbol, final Object symbolSize) {
        this.name = name;
        this.symbol = symbol;
        this.symbolSize = symbolSize;
    }
    
    public BasicData(final Object value, final Object symbol) {
        this.value = value;
        this.symbol = symbol;
    }
    
    public BasicData(final Object value, final Object symbol, final Object symbolSize) {
        this.value = value;
        this.symbol = symbol;
        this.symbolSize = symbolSize;
    }
    
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }
    
    public T textStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
        return (T)this;
    }
    
    public String text() {
        return this.text;
    }
    
    public T text(final String text) {
        this.text = text;
        return (T)this;
    }
    
    public String name() {
        return this.name;
    }
    
    public T name(final String name) {
        this.name = name;
        return (T)this;
    }
    
    public Object value() {
        return this.value;
    }
    
    public T value(final Object value) {
        this.value = value;
        return (T)this;
    }
    
    public T value(final Object... values) {
        if (values == null || values.length == 0) {
            return (T)this;
        }
        if (this.value == null) {
            this.value = new ArrayList(values.length);
        }
        if (this.value instanceof List) {
            ((List)this.value).addAll(Arrays.asList(values));
        }
        return (T)this;
    }
    
    public Object x() {
        return this.x;
    }
    
    public T x(final Object x) {
        this.x = x;
        return (T)this;
    }
    
    public Object y() {
        return this.y;
    }
    
    public T y(final Object y) {
        this.y = y;
        return (T)this;
    }
    
    public Integer xAxis() {
        return this.xAxis;
    }
    
    public T xAxis(final Integer xAxis) {
        this.xAxis = xAxis;
        return (T)this;
    }
    
    public Integer yAxis() {
        return this.yAxis;
    }
    
    public T yAxis(final Integer yAxis) {
        this.yAxis = yAxis;
        return (T)this;
    }
    
    public MarkType type() {
        return this.type;
    }
    
    public T type(final MarkType type) {
        this.type = type;
        return (T)this;
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
    
    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }
    
    public T itemStyle(final ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return (T)this;
    }
    
    public String getName() {
        return this.name;
    }
    
    public T setName(final String name) {
        this.name = name;
        return (T)this;
    }
    
    public Object getValue() {
        return this.value;
    }
    
    public T setValue(final Object value) {
        this.value = value;
        return (T)this;
    }
    
    public Object getX() {
        return this.x;
    }
    
    public T setX(final Object x) {
        this.x = x;
        return (T)this;
    }
    
    public Object getY() {
        return this.y;
    }
    
    public T setY(final Object y) {
        this.y = y;
        return (T)this;
    }
    
    public Integer getxAxis() {
        return this.xAxis;
    }
    
    public T setxAxis(final Integer xAxis) {
        this.xAxis = xAxis;
        return (T)this;
    }
    
    public Integer getyAxis() {
        return this.yAxis;
    }
    
    public T setyAxis(final Integer yAxis) {
        this.yAxis = yAxis;
        return (T)this;
    }
    
    public MarkType getType() {
        return this.type;
    }
    
    public T setType(final MarkType type) {
        this.type = type;
        return (T)this;
    }
    
    public Object getSymbol() {
        return this.symbol;
    }
    
    public T setSymbol(final Object symbol) {
        this.symbol = symbol;
        return (T)this;
    }
    
    public Object getSymbolSize() {
        return this.symbolSize;
    }
    
    public T setSymbolSize(final Object symbolSize) {
        this.symbolSize = symbolSize;
        return (T)this;
    }
    
    public ItemStyle getItemStyle() {
        return this.itemStyle;
    }
    
    public T setItemStyle(final ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return (T)this;
    }
    
    public String getText() {
        return this.text;
    }
    
    public void setText(final String text) {
        this.text = text;
    }
    
    public TextStyle getTextStyle() {
        return this.textStyle;
    }
    
    public void setTextStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
    }
}
