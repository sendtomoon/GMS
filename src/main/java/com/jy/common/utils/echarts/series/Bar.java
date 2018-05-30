package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.code.*;

public class Bar extends Series<Bar>
{
    private Integer barMinHeight;
    private Integer barWidth;
    private Integer barMaxWidth;
    private String barGap;
    private String barCategoryGap;
    
    public Bar() {
        this.type(SeriesType.bar);
    }
    
    public Bar(final String name) {
        super(name);
        this.type(SeriesType.bar);
    }
    
    public Integer barMinHeight() {
        return this.barMinHeight;
    }
    
    public Bar barMinHeight(final Integer barMinHeight) {
        this.barMinHeight = barMinHeight;
        return this;
    }
    
    public Integer barWidth() {
        return this.barWidth;
    }
    
    public Bar barWidth(final Integer barWidth) {
        this.barWidth = barWidth;
        return this;
    }
    
    public Integer barMaxWidth() {
        return this.barMaxWidth;
    }
    
    public Bar barMaxWidth(final Integer barMaxWidth) {
        this.barMaxWidth = barMaxWidth;
        return this;
    }
    
    public String barGap() {
        return this.barGap;
    }
    
    public Bar barGap(final String barGap) {
        this.barGap = barGap;
        return this;
    }
    
    public String barCategoryGap() {
        return this.barCategoryGap;
    }
    
    public Bar barCategoryGap(final String barCategoryGap) {
        this.barCategoryGap = barCategoryGap;
        return this;
    }
    
    public Integer getBarMinHeight() {
        return this.barMinHeight;
    }
    
    public void setBarMinHeight(final Integer barMinHeight) {
        this.barMinHeight = barMinHeight;
    }
    
    public String getBarGap() {
        return this.barGap;
    }
    
    public void setBarGap(final String barGap) {
        this.barGap = barGap;
    }
    
    public String getBarCategoryGap() {
        return this.barCategoryGap;
    }
    
    public void setBarCategoryGap(final String barCategoryGap) {
        this.barCategoryGap = barCategoryGap;
    }
    
    public Integer getBarWidth() {
        return this.barWidth;
    }
    
    public void setBarWidth(final Integer barWidth) {
        this.barWidth = barWidth;
    }
    
    public Integer getBarMaxWidth() {
        return this.barMaxWidth;
    }
    
    public void setBarMaxWidth(final Integer barMaxWidth) {
        this.barMaxWidth = barMaxWidth;
    }
}
