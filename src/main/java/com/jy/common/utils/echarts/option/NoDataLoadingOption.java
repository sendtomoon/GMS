package com.jy.common.utils.echarts.option;

import com.jy.common.utils.echarts.style.*;
import com.jy.common.utils.echarts.code.*;

public class NoDataLoadingOption
{
    private String text;
    private Object x;
    private Object y;
    private TextStyle textStyle;
    private Object effect;
    private EffectOption effectOption;
    private Integer progress;
    
    public String text() {
        return this.text;
    }
    
    public NoDataLoadingOption text(final String text) {
        this.text = text;
        return this;
    }
    
    public Object x() {
        return this.x;
    }
    
    public NoDataLoadingOption x(final Object x) {
        this.x = x;
        return this;
    }
    
    public Object y() {
        return this.y;
    }
    
    public NoDataLoadingOption y(final Object y) {
        this.y = y;
        return this;
    }
    
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }
    
    public NoDataLoadingOption textStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }
    
    public Object effect() {
        return this.effect;
    }
    
    public NoDataLoadingOption effect(final Object effect) {
        this.effect = effect;
        return this;
    }
    
    public NoDataLoadingOption effect(final LoadingEffect effect) {
        this.effect = effect;
        return this;
    }
    
    public EffectOption effectOption() {
        if (this.effectOption == null) {
            this.effectOption = new EffectOption();
        }
        return this.effectOption;
    }
    
    public NoDataLoadingOption effectOption(final EffectOption effectOption) {
        this.effectOption = effectOption;
        return this;
    }
    
    public Integer progress() {
        return this.progress;
    }
    
    public NoDataLoadingOption progress(final Integer progress) {
        this.progress = progress;
        return this;
    }
    
    public String getText() {
        return this.text;
    }
    
    public void setText(final String text) {
        this.text = text;
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
    
    public TextStyle getTextStyle() {
        return this.textStyle;
    }
    
    public void setTextStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
    }
    
    public Object getEffect() {
        return this.effect;
    }
    
    public void setEffect(final Object effect) {
        this.effect = effect;
    }
    
    public EffectOption getEffectOption() {
        return this.effectOption;
    }
    
    public void setEffectOption(final EffectOption effectOption) {
        this.effectOption = effectOption;
    }
    
    public Integer getProgress() {
        return this.progress;
    }
    
    public void setProgress(final Integer progress) {
        this.progress = progress;
    }
}
