package com.jy.common.utils.echarts;

import com.jy.common.utils.echarts.code.*;
import com.jy.common.utils.echarts.style.*;

public class Title extends Basic<Title> implements Component
{
    private String text;
    private String link;
    private String target;
    private String subtext;
    private String sublink;
    private String subtarget;
    private X textAlign;
    private TextStyle textStyle;
    private TextStyle subtextStyle;
    private Object offsetCenter;
    
    public Title textStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }
    
    public Title subtextStyle(final TextStyle subtextStyle) {
        this.subtextStyle = subtextStyle;
        return this;
    }
    
    public String text() {
        return this.text;
    }
    
    public Title text(final String text) {
        this.text = text;
        return this;
    }
    
    public String link() {
        return this.link;
    }
    
    public Title link(final String link) {
        this.link = link;
        return this;
    }
    
    public String target() {
        return this.target;
    }
    
    public Title target(final String target) {
        this.target = target;
        return this;
    }
    
    public String subtext() {
        return this.subtext;
    }
    
    public Title subtext(final String subtext) {
        this.subtext = subtext;
        return this;
    }
    
    public String sublink() {
        return this.sublink;
    }
    
    public Title sublink(final String sublink) {
        this.sublink = sublink;
        return this;
    }
    
    public String subtarget() {
        return this.subtarget;
    }
    
    public Title subtarget(final String subtarget) {
        this.subtarget = subtarget;
        return this;
    }
    
    public X textAlign() {
        return this.textAlign;
    }
    
    public Title textAlign(final X textAlign) {
        this.textAlign = textAlign;
        return this;
    }
    
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }
    
    public TextStyle subtextStyle() {
        if (this.subtextStyle == null) {
            this.subtextStyle = new TextStyle();
        }
        return this.subtextStyle;
    }
    
    public Object offsetCenter() {
        return this.offsetCenter;
    }
    
    public Title offsetCenter(final Object offsetCenter) {
        this.offsetCenter = offsetCenter;
        return this;
    }
    
    public TextStyle getTextStyle() {
        return this.textStyle;
    }
    
    public void setTextStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
    }
    
    public TextStyle getSubtextStyle() {
        return this.subtextStyle;
    }
    
    public void setSubtextStyle(final TextStyle subtextStyle) {
        this.subtextStyle = subtextStyle;
    }
    
    public String getText() {
        return this.text;
    }
    
    public void setText(final String text) {
        this.text = text;
    }
    
    public String getLink() {
        return this.link;
    }
    
    public void setLink(final String link) {
        this.link = link;
    }
    
    public String getTarget() {
        return this.target;
    }
    
    public void setTarget(final String target) {
        this.target = target;
    }
    
    public String getSubtext() {
        return this.subtext;
    }
    
    public void setSubtext(final String subtext) {
        this.subtext = subtext;
    }
    
    public String getSublink() {
        return this.sublink;
    }
    
    public void setSublink(final String sublink) {
        this.sublink = sublink;
    }
    
    public String getSubtarget() {
        return this.subtarget;
    }
    
    public void setSubtarget(final String subtarget) {
        this.subtarget = subtarget;
    }
    
    public X getTextAlign() {
        return this.textAlign;
    }
    
    public void setTextAlign(final X textAlign) {
        this.textAlign = textAlign;
    }
    
    public Object getOffsetCenter() {
        return this.offsetCenter;
    }
    
    public void setOffsetCenter(final Object offsetCenter) {
        this.offsetCenter = offsetCenter;
    }
}
