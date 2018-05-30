package com.jy.common.utils.echarts.style.itemstyle;

import java.io.*;
import com.jy.common.utils.echarts.*;
import com.jy.common.utils.echarts.style.*;

public abstract class Style<T> implements Serializable
{
    private static final long serialVersionUID = -3920258078225722832L;
    private Label label;
    private LabelLine labelLine;
    private String color;
    private String color0;
    private LineStyle lineStyle;
    private AreaStyle areaStyle;
    private ChordStyle chordStyle;
    private NodeStyle nodeStyle;
    private LinkStyle linkStyle;
    private String borderColor;
    private Integer borderRadius;
    private Integer borderWidth;
    private String barBorderColor;
    private Integer barBorderRadius;
    private Integer barBorderWidth;
    
    public T label(final Label label) {
        this.label = label;
        return (T)this;
    }
    
    public T labelLine(final LabelLine labelLine) {
        this.labelLine = labelLine;
        return (T)this;
    }
    
    public T areaStyle(final AreaStyle areaStyle) {
        this.areaStyle = areaStyle;
        return (T)this;
    }
    
    public T chordStyle(final ChordStyle chordStyle) {
        this.chordStyle = chordStyle;
        return (T)this;
    }
    
    public T nodeStyle(final NodeStyle nodeStyle) {
        this.nodeStyle = nodeStyle;
        return (T)this;
    }
    
    public T linkStyle(final LinkStyle linkStyle) {
        this.linkStyle = linkStyle;
        return (T)this;
    }
    
    public Label label() {
        if (this.label == null) {
            this.label = new Label();
        }
        return this.label;
    }
    
    public LabelLine labelLine() {
        if (this.labelLine == null) {
            this.labelLine = new LabelLine();
        }
        return this.labelLine;
    }
    
    public String color() {
        return this.color;
    }
    
    public T color(final String color) {
        this.color = color;
        return (T)this;
    }
    
    public String color0() {
        return this.color0;
    }
    
    public T color0(final String color0) {
        this.color0 = color0;
        return (T)this;
    }
    
    public T lineStyle(final LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return (T)this;
    }
    
    public LineStyle lineStyle() {
        if (this.lineStyle == null) {
            this.lineStyle = new LineStyle();
        }
        return this.lineStyle;
    }
    
    public AreaStyle areaStyle() {
        if (this.areaStyle == null) {
            this.areaStyle = new AreaStyle();
        }
        return this.areaStyle;
    }
    
    public ChordStyle chordStyle() {
        if (this.chordStyle == null) {
            this.chordStyle = new ChordStyle();
        }
        return this.chordStyle;
    }
    
    public NodeStyle nodeStyle() {
        if (this.nodeStyle == null) {
            this.nodeStyle = new NodeStyle();
        }
        return this.nodeStyle;
    }
    
    public LinkStyle linkStyle() {
        if (this.linkStyle == null) {
            this.linkStyle = new LinkStyle();
        }
        return this.linkStyle;
    }
    
    public String borderColor() {
        return this.borderColor;
    }
    
    public T borderColor(final String borderColor) {
        this.borderColor = borderColor;
        return (T)this;
    }
    
    public Integer borderRadius() {
        return this.borderRadius;
    }
    
    public T borderRadius(final Integer borderRadius) {
        this.borderRadius = borderRadius;
        return (T)this;
    }
    
    public Integer borderWidth() {
        return this.borderWidth;
    }
    
    public T borderWidth(final Integer borderWidth) {
        this.borderWidth = borderWidth;
        return (T)this;
    }
    
    public String barBorderColor() {
        return this.barBorderColor;
    }
    
    public T barBorderColor(final String barBorderColor) {
        this.barBorderColor = barBorderColor;
        return (T)this;
    }
    
    public Integer barBorderRadius() {
        return this.barBorderRadius;
    }
    
    public T barBorderRadius(final Integer barBorderRadius) {
        this.barBorderRadius = barBorderRadius;
        return (T)this;
    }
    
    public Integer barBorderWidth() {
        return this.barBorderWidth;
    }
    
    public T barBorderWidth(final Integer barBorderWidth) {
        this.barBorderWidth = barBorderWidth;
        return (T)this;
    }
    
    public Label getLabel() {
        return this.label;
    }
    
    public void setLabel(final Label label) {
        this.label = label;
    }
    
    public LabelLine getLabelLine() {
        return this.labelLine;
    }
    
    public void setLabelLine(final LabelLine labelLine) {
        this.labelLine = labelLine;
    }
    
    public AreaStyle getAreaStyle() {
        return this.areaStyle;
    }
    
    public void setAreaStyle(final AreaStyle areaStyle) {
        this.areaStyle = areaStyle;
    }
    
    public ChordStyle getChordStyle() {
        return this.chordStyle;
    }
    
    public void setChordStyle(final ChordStyle chordStyle) {
        this.chordStyle = chordStyle;
    }
    
    public NodeStyle getNodeStyle() {
        return this.nodeStyle;
    }
    
    public void setNodeStyle(final NodeStyle nodeStyle) {
        this.nodeStyle = nodeStyle;
    }
    
    public LinkStyle getLinkStyle() {
        return this.linkStyle;
    }
    
    public void setLinkStyle(final LinkStyle linkStyle) {
        this.linkStyle = linkStyle;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(final String color) {
        this.color = color;
    }
    
    public String getColor0() {
        return this.color0;
    }
    
    public void setColor0(final String color0) {
        this.color0 = color0;
    }
    
    public LineStyle getLineStyle() {
        return this.lineStyle;
    }
    
    public void setLineStyle(final LineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }
    
    public String getBorderColor() {
        return this.borderColor;
    }
    
    public void setBorderColor(final String borderColor) {
        this.borderColor = borderColor;
    }
    
    public Integer getBorderRadius() {
        return this.borderRadius;
    }
    
    public void setBorderRadius(final Integer borderRadius) {
        this.borderRadius = borderRadius;
    }
    
    public Integer getBorderWidth() {
        return this.borderWidth;
    }
    
    public void setBorderWidth(final Integer borderWidth) {
        this.borderWidth = borderWidth;
    }
    
    public String getBarBorderColor() {
        return this.barBorderColor;
    }
    
    public void setBarBorderColor(final String barBorderColor) {
        this.barBorderColor = barBorderColor;
    }
    
    public Integer getBarBorderRadius() {
        return this.barBorderRadius;
    }
    
    public void setBarBorderRadius(final Integer barBorderRadius) {
        this.barBorderRadius = barBorderRadius;
    }
    
    public Integer getBarBorderWidth() {
        return this.barBorderWidth;
    }
    
    public void setBarBorderWidth(final Integer barBorderWidth) {
        this.barBorderWidth = barBorderWidth;
    }
}
