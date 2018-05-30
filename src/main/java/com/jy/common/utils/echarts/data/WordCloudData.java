package com.jy.common.utils.echarts.data;

import java.io.*;
import com.jy.common.utils.echarts.style.*;

public class WordCloudData implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String name;
    private Integer value;
    private ItemStyle itemStyle;
    
    public WordCloudData() {
    }
    
    public WordCloudData(final String name, final Integer value) {
        this.name = name;
        this.value = value;
    }
    
    public WordCloudData name(final String name) {
        this.name = name;
        return this;
    }
    
    public String name() {
        return this.name;
    }
    
    public WordCloudData value(final Integer value) {
        this.value = value;
        return this;
    }
    
    public Integer value() {
        return this.value;
    }
    
    public WordCloudData itemStyle(final ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }
    
    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public Integer getValue() {
        return this.value;
    }
    
    public void setValue(final Integer value) {
        this.value = value;
    }
    
    public ItemStyle getItemStyle() {
        return this.itemStyle;
    }
    
    public void setItemStyle(final ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }
}
