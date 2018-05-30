package com.jy.common.utils.echarts.style;

import java.io.*;
import com.jy.common.utils.echarts.style.itemstyle.*;

public class ItemStyle implements Serializable
{
    private static final long serialVersionUID = 418674375057055357L;
    private Normal normal;
    private Emphasis emphasis;
    private Breadcrumb breadcrumb;
    private Integer childBorderWidth;
    private Object childBorderColor;
    
    public Normal normal() {
        if (this.normal == null) {
            this.normal = new Normal();
        }
        return this.normal;
    }
    
    public ItemStyle normal(final Normal normal) {
        this.normal = normal;
        return this;
    }
    
    public Emphasis emphasis() {
        if (this.emphasis == null) {
            this.emphasis = new Emphasis();
        }
        return this.emphasis;
    }
    
    public ItemStyle emphasis(final Emphasis emphasis) {
        this.emphasis = emphasis;
        return this;
    }
    
    public Normal getNormal() {
        return this.normal;
    }
    
    public void setNormal(final Normal normal) {
        this.normal = normal;
    }
    
    public Emphasis getEmphasis() {
        return this.emphasis;
    }
    
    public void setEmphasis(final Emphasis emphasis) {
        this.emphasis = emphasis;
    }
    
    public ItemStyle breadcrumb(final Breadcrumb breadcrumb) {
        this.breadcrumb = breadcrumb;
        return this;
    }
    
    public Breadcrumb breadcrumb() {
        if (this.breadcrumb == null) {
            this.breadcrumb = new Breadcrumb();
        }
        return this.breadcrumb;
    }
    
    public ItemStyle childBorderWidth(final Integer childBorderWidth) {
        this.childBorderWidth = childBorderWidth;
        return this;
    }
    
    public Integer childBorderWidth() {
        return this.childBorderWidth;
    }
    
    public ItemStyle childBorderColor(final Object childBorderColor) {
        this.childBorderColor = childBorderColor;
        return this;
    }
    
    public Object childBorderColor() {
        return this.childBorderColor;
    }
    
    public Breadcrumb getBreadcrumb() {
        return this.breadcrumb;
    }
    
    public void setBreadcrumb(final Breadcrumb breadcrumb) {
        this.breadcrumb = breadcrumb;
    }
    
    public Integer getChildBorderWidth() {
        return this.childBorderWidth;
    }
    
    public void setChildBorderWidth(final Integer childBorderWidth) {
        this.childBorderWidth = childBorderWidth;
    }
    
    public Object getChildBorderColor() {
        return this.childBorderColor;
    }
    
    public void setChildBorderColor(final Object childBorderColor) {
        this.childBorderColor = childBorderColor;
    }
}
