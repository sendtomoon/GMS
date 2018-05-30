package com.jy.common.utils.echarts.feature;

import java.io.*;
import com.jy.common.utils.echarts.style.*;
import com.jy.common.utils.echarts.code.*;

public class Feature implements Serializable
{
    public static final DataView dataView;
    public static final DataZoom dataZoom;
    public static final Mark mark;
    public static final SaveAsImage saveAsImage;
    public static final MagicType magicType;
    public static final Restore restore;
    private static final long serialVersionUID = 8546465308711709471L;
    private Boolean show;
    private Object title;
    private Object type;
    private Boolean readOnly;
    private Object lang;
    private LineStyle lineStyle;
    private TextStyle textStyle;
    private String icon;
    
    static {
        dataView = new DataView();
        dataZoom = new DataZoom();
        mark = new Mark();
        saveAsImage = new SaveAsImage();
        magicType = new MagicType(new Magic[0]);
        restore = new Restore();
    }
    
    public Boolean show() {
        return this.show;
    }
    
    public Feature show(final Boolean show) {
        this.show = show;
        return this;
    }
    
    public Object title() {
        return this.title;
    }
    
    public Feature title(final Object title) {
        this.title = title;
        return this;
    }
    
    public Object type() {
        return this.type;
    }
    
    public Feature type(final Object type) {
        this.type = type;
        return this;
    }
    
    public Boolean readOnly() {
        return this.readOnly;
    }
    
    public Feature readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    
    public Object lang() {
        return this.lang;
    }
    
    public Feature lang(final Object lang) {
        this.lang = lang;
        return this;
    }
    
    public LineStyle lineStyle() {
        return this.lineStyle;
    }
    
    public Feature lineStyle(final LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }
    
    public TextStyle textStyle() {
        return this.textStyle;
    }
    
    public Feature textStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }
    
    public String icon() {
        return this.icon;
    }
    
    public Feature icon(final String icon) {
        this.icon = icon;
        return this;
    }
    
    public Boolean getShow() {
        return this.show;
    }
    
    public void setShow(final Boolean show) {
        this.show = show;
    }
    
    public Object getTitle() {
        return this.title;
    }
    
    public void setTitle(final Object title) {
        this.title = title;
    }
    
    public Object getType() {
        return this.type;
    }
    
    public void setType(final Object type) {
        this.type = type;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }
    
    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }
    
    public Object getLang() {
        return this.lang;
    }
    
    public void setLang(final Object lang) {
        this.lang = lang;
    }
    
    public LineStyle getLineStyle() {
        return this.lineStyle;
    }
    
    public void setLineStyle(final LineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }
    
    public TextStyle getTextStyle() {
        return this.textStyle;
    }
    
    public void setTextStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
    }
    
    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(final String icon) {
        this.icon = icon;
    }
}
