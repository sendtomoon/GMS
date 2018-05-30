package com.jy.common.utils.echarts.data;

import java.io.*;
import com.jy.common.utils.echarts.style.*;
import java.util.*;

public class TreeData implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String name;
    private Integer value;
    private List<TreeData> children;
    private ItemStyle itemStyle;
    
    public TreeData() {
    }
    
    public TreeData(final String name, final Integer value) {
        this.name = name;
        this.value = value;
    }
    
    public TreeData name(final String name) {
        this.name = name;
        return this;
    }
    
    public String name() {
        return this.name;
    }
    
    public TreeData value(final Integer value) {
        this.value = value;
        return this;
    }
    
    public Integer value() {
        return this.value;
    }
    
    public TreeData children(final TreeData... treeDatas) {
        if (treeDatas == null || treeDatas.length == 0) {
            return this;
        }
        this.children().addAll(Arrays.asList(treeDatas));
        return this;
    }
    
    public List<TreeData> children() {
        if (this.children == null) {
            this.children = new LinkedList<TreeData>();
        }
        return this.children;
    }
    
    public TreeData itemStyle(final ItemStyle itemStyle) {
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
    
    public List<TreeData> getChildren() {
        return this.children;
    }
    
    public void setChildren(final List<TreeData> children) {
        this.children = children;
    }
    
    public ItemStyle getItemStyle() {
        return this.itemStyle;
    }
    
    public void setItemStyle(final ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }
}
