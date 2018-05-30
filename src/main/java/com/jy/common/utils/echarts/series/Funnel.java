package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.code.*;

public class Funnel extends Series<Funnel>
{
    private Object x;
    private Object y;
    private Object x2;
    private Object y2;
    private Object width;
    private Object height;
    private X funnelAlign;
    private Integer min;
    private Integer max;
    private String minSize;
    private String maxSize;
    private Sort sort;
    private Integer gap;
    
    public Funnel() {
        this.type(SeriesType.funnel);
    }
    
    public Funnel(final String name) {
        super(name);
        this.type(SeriesType.funnel);
    }
    
    public Object x() {
        return this.x;
    }
    
    public Funnel x(final Object x) {
        this.x = x;
        return this;
    }
    
    public Object y() {
        return this.y;
    }
    
    public Funnel y(final Object y) {
        this.y = y;
        return this;
    }
    
    public Object x2() {
        return this.x2;
    }
    
    public Funnel x2(final Object x2) {
        this.x2 = x2;
        return this;
    }
    
    public Object y2() {
        return this.y2;
    }
    
    public Funnel y2(final Object y2) {
        this.y2 = y2;
        return this;
    }
    
    public Object width() {
        return this.width;
    }
    
    public Funnel width(final Object width) {
        this.width = width;
        return this;
    }
    
    public Object height() {
        return this.height;
    }
    
    public Funnel height(final Object height) {
        this.height = height;
        return this;
    }
    
    public X funnelAlign() {
        return this.funnelAlign;
    }
    
    public Funnel funnelAlign(final X funnelAlign) {
        this.funnelAlign = funnelAlign;
        return this;
    }
    
    public Integer min() {
        return this.min;
    }
    
    public Funnel min(final Integer min) {
        this.min = min;
        return this;
    }
    
    public Integer max() {
        return this.max;
    }
    
    public Funnel max(final Integer max) {
        this.max = max;
        return this;
    }
    
    public String minSize() {
        return this.minSize;
    }
    
    public Funnel minSize(final String minSize) {
        this.minSize = minSize;
        return this;
    }
    
    public String maxSize() {
        return this.maxSize;
    }
    
    public Funnel maxSize(final String maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    
    public Sort sort() {
        return this.sort;
    }
    
    public Funnel sort(final Sort sort) {
        this.sort = sort;
        return this;
    }
    
    public Integer gap() {
        return this.gap;
    }
    
    public Funnel gap(final Integer gap) {
        this.gap = gap;
        return this;
    }
    
    public Object getX() {
        return this.x;
    }
    
    public void setX(final Object x) {
        this.x = x;
    }
    
    public Object getY() {
        return this.y;
    }
    
    public void setY(final Object y) {
        this.y = y;
    }
    
    public Object getX2() {
        return this.x2;
    }
    
    public void setX2(final Object x2) {
        this.x2 = x2;
    }
    
    public Object getY2() {
        return this.y2;
    }
    
    public void setY2(final Object y2) {
        this.y2 = y2;
    }
    
    public Object getWidth() {
        return this.width;
    }
    
    public void setWidth(final Object width) {
        this.width = width;
    }
    
    public Object getHeight() {
        return this.height;
    }
    
    public void setHeight(final Object height) {
        this.height = height;
    }
    
    public Integer getMin() {
        return this.min;
    }
    
    public void setMin(final Integer min) {
        this.min = min;
    }
    
    public Integer getMax() {
        return this.max;
    }
    
    public void setMax(final Integer max) {
        this.max = max;
    }
    
    public String getMinSize() {
        return this.minSize;
    }
    
    public void setMinSize(final String minSize) {
        this.minSize = minSize;
    }
    
    public String getMaxSize() {
        return this.maxSize;
    }
    
    public void setMaxSize(final String maxSize) {
        this.maxSize = maxSize;
    }
    
    public Sort getSort() {
        return this.sort;
    }
    
    public void setSort(final Sort sort) {
        this.sort = sort;
    }
    
    public Integer getGap() {
        return this.gap;
    }
    
    public void setGap(final Integer gap) {
        this.gap = gap;
    }
    
    public X getFunnelAlign() {
        return this.funnelAlign;
    }
    
    public void setFunnelAlign(final X funnelAlign) {
        this.funnelAlign = funnelAlign;
    }
}
