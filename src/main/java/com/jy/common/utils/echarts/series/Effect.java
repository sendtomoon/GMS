package com.jy.common.utils.echarts.series;

import java.io.*;

public class Effect implements Serializable
{
    private static final long serialVersionUID = 2768587032945006946L;
    private Type type;
    private Boolean show;
    private Boolean loop;
    private Integer period;
    private Integer scaleSize;
    private String color;
    private String shadowColor;
    private Integer shadowBlur;
    private Integer bounceDistance;
    
    public Type type() {
        return this.type;
    }
    
    public Effect type(final Type type) {
        this.type = type;
        return this;
    }
    
    public Boolean show() {
        return this.show;
    }
    
    public Effect show(final Boolean show) {
        this.show = show;
        return this;
    }
    
    public Boolean loop() {
        return this.loop;
    }
    
    public Effect loop(final Boolean loop) {
        this.loop = loop;
        return this;
    }
    
    public Integer period() {
        return this.period;
    }
    
    public Effect period(final Integer period) {
        this.period = period;
        return this;
    }
    
    public Integer scaleSize() {
        return this.scaleSize;
    }
    
    public Effect scaleSize(final Integer scaleSize) {
        this.scaleSize = scaleSize;
        return this;
    }
    
    public String color() {
        return this.color;
    }
    
    public Effect color(final String color) {
        this.color = color;
        return this;
    }
    
    public String shadowColor() {
        return this.shadowColor;
    }
    
    public Effect shadowColor(final String shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }
    
    public Integer shadowBlur() {
        return this.shadowBlur;
    }
    
    public Effect shadowBlur(final Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }
    
    public Integer bounceDistance() {
        return this.bounceDistance;
    }
    
    public Effect bounceDistance(final Integer bounceDistance) {
        this.bounceDistance = bounceDistance;
        return this;
    }
    
    public Boolean getShow() {
        return this.show;
    }
    
    public void setShow(final Boolean show) {
        this.show = show;
    }
    
    public Boolean getLoop() {
        return this.loop;
    }
    
    public void setLoop(final Boolean loop) {
        this.loop = loop;
    }
    
    public Integer getPeriod() {
        return this.period;
    }
    
    public void setPeriod(final Integer period) {
        this.period = period;
    }
    
    public Integer getScaleSize() {
        return this.scaleSize;
    }
    
    public void setScaleSize(final Integer scaleSize) {
        this.scaleSize = scaleSize;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(final String color) {
        this.color = color;
    }
    
    public String getShadowColor() {
        return this.shadowColor;
    }
    
    public void setShadowColor(final String shadowColor) {
        this.shadowColor = shadowColor;
    }
    
    public Integer getShadowBlur() {
        return this.shadowBlur;
    }
    
    public void setShadowBlur(final Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
    }
    
    public Type getType() {
        return this.type;
    }
    
    public void setType(final Type type) {
        this.type = type;
    }
    
    public Integer getBounceDistance() {
        return this.bounceDistance;
    }
    
    public void setBounceDistance(final Integer bounceDistance) {
        this.bounceDistance = bounceDistance;
    }
    
    public enum Type
    {
        scale("scale", 0), 
        bounce("bounce", 1);
        
        private Type(final String s, final int n) {
        }
    }
}
