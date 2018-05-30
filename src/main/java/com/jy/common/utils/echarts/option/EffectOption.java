package com.jy.common.utils.echarts.option;

import com.jy.common.utils.echarts.style.*;

public class EffectOption
{
    private Object effect;
    private Integer progress;
    private TextStyle textStyle;
    
    public Object effect() {
        return this.effect;
    }
    
    public EffectOption effect(final Object effect) {
        this.effect = effect;
        return this;
    }
    
    public Integer progress() {
        return this.progress;
    }
    
    public EffectOption progress(final Integer progress) {
        this.progress = progress;
        return this;
    }
    
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }
    
    public EffectOption textStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }
    
    public Object getEffect() {
        return this.effect;
    }
    
    public void setEffect(final Object effect) {
        this.effect = effect;
    }
    
    public Integer getProgress() {
        return this.progress;
    }
    
    public void setProgress(final Integer progress) {
        this.progress = progress;
    }
    
    public TextStyle getTextStyle() {
        return this.textStyle;
    }
    
    public void setTextStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
    }
}
