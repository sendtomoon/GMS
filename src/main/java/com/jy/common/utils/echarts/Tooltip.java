package com.jy.common.utils.echarts;

import com.jy.common.utils.echarts.code.*;
import com.jy.common.utils.echarts.style.*;

public class Tooltip extends Basic<Tooltip> implements Component
{
    private Boolean showContent;
    private Trigger trigger;
    private Object position;
    private Object formatter;
    private String islandFormatter;
    private Integer showDelay;
    private Integer hideDelay;
    private Double transitionDuration;
    private Boolean enterable;
    private Integer borderRadius;
    private AxisPointer axisPointer;
    private TextStyle textStyle;
    
    public Tooltip axisPointer(final AxisPointer axisPointer) {
        this.axisPointer = axisPointer;
        return this;
    }
    
    public Tooltip textStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }
    
    public Boolean showContent() {
        return this.showContent;
    }
    
    public Tooltip showContent(final Boolean showContent) {
        this.showContent = showContent;
        return this;
    }
    
    public Trigger trigger() {
        return this.trigger;
    }
    
    public Tooltip trigger(final Trigger trigger) {
        this.trigger = trigger;
        return this;
    }
    
    public Object position() {
        return this.position;
    }
    
    public Tooltip position(final Object position) {
        this.position = position;
        return this;
    }
    
    public Object formatter() {
        return this.formatter;
    }
    
    public Tooltip formatter(final Object formatter) {
        this.formatter = formatter;
        return this;
    }
    
    public String islandFormatter() {
        return this.islandFormatter;
    }
    
    public Tooltip islandFormatter(final String islandFormatter) {
        this.islandFormatter = islandFormatter;
        return this;
    }
    
    public Integer showDelay() {
        return this.showDelay;
    }
    
    public Tooltip showDelay(final Integer showDelay) {
        this.showDelay = showDelay;
        return this;
    }
    
    public Integer hideDelay() {
        return this.hideDelay;
    }
    
    public Tooltip hideDelay(final Integer hideDelay) {
        this.hideDelay = hideDelay;
        return this;
    }
    
    public Double transitionDuration() {
        return this.transitionDuration;
    }
    
    public Tooltip transitionDuration(final Double transitionDuration) {
        this.transitionDuration = transitionDuration;
        return this;
    }
    
    public Boolean enterable() {
        return this.enterable;
    }
    
    public Tooltip enterable(final Boolean enterable) {
        this.enterable = enterable;
        return this;
    }
    
    public Integer borderRadius() {
        return this.borderRadius;
    }
    
    public Tooltip borderRadius(final Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }
    
    public AxisPointer axisPointer() {
        if (this.axisPointer == null) {
            this.axisPointer = new AxisPointer();
        }
        return this.axisPointer;
    }
    
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }
    
    public Boolean getShowContent() {
        return this.showContent;
    }
    
    public void setShowContent(final Boolean showContent) {
        this.showContent = showContent;
    }
    
    public Trigger getTrigger() {
        return this.trigger;
    }
    
    public void setTrigger(final Trigger trigger) {
        this.trigger = trigger;
    }
    
    public Object getPosition() {
        return this.position;
    }
    
    public void setPosition(final Object position) {
        this.position = position;
    }
    
    public Object getFormatter() {
        return this.formatter;
    }
    
    public void setFormatter(final Object formatter) {
        this.formatter = formatter;
    }
    
    public String getIslandFormatter() {
        return this.islandFormatter;
    }
    
    public void setIslandFormatter(final String islandFormatter) {
        this.islandFormatter = islandFormatter;
    }
    
    public Integer getShowDelay() {
        return this.showDelay;
    }
    
    public void setShowDelay(final Integer showDelay) {
        this.showDelay = showDelay;
    }
    
    public Integer getHideDelay() {
        return this.hideDelay;
    }
    
    public void setHideDelay(final Integer hideDelay) {
        this.hideDelay = hideDelay;
    }
    
    public Double getTransitionDuration() {
        return this.transitionDuration;
    }
    
    public void setTransitionDuration(final Double transitionDuration) {
        this.transitionDuration = transitionDuration;
    }
    
    public Boolean getEnterable() {
        return this.enterable;
    }
    
    public void setEnterable(final Boolean enterable) {
        this.enterable = enterable;
    }
    
    public Integer getBorderRadius() {
        return this.borderRadius;
    }
    
    public void setBorderRadius(final Integer borderRadius) {
        this.borderRadius = borderRadius;
    }
    
    public AxisPointer getAxisPointer() {
        return this.axisPointer;
    }
    
    public void setAxisPointer(final AxisPointer axisPointer) {
        this.axisPointer = axisPointer;
    }
    
    public TextStyle getTextStyle() {
        return this.textStyle;
    }
    
    public void setTextStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
    }
}
