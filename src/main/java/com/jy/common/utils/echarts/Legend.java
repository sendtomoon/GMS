package com.jy.common.utils.echarts;

import com.jy.common.utils.echarts.code.*;
import com.jy.common.utils.echarts.style.*;
import java.util.*;

public class Legend extends Basic<Legend> implements Data<Legend>, Component
{
    private Orient orient;
    private Integer itemWidth;
    private Integer itemHeight;
    private TextStyle textStyle;
    private Object selectedMode;
    private Map<String, Boolean> selected;
    private List<Object> data;
    
    public Legend() {
    }
    
    public Legend(final Object... values) {
        this.data(values);
    }
    
    public Legend textStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }
    
    public Legend data(final List<Object> data) {
        this.data = data;
        return this;
    }
    
    public Orient orient() {
        return this.orient;
    }
    
    public Legend orient(final Orient orient) {
        this.orient = orient;
        return this;
    }
    
    public Integer itemWidth() {
        return this.itemWidth;
    }
    
    public Legend itemWidth(final Integer itemWidth) {
        this.itemWidth = itemWidth;
        return this;
    }
    
    public Integer itemHeight() {
        return this.itemHeight;
    }
    
    public Legend itemHeight(final Integer itemHeight) {
        this.itemHeight = itemHeight;
        return this;
    }
    
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }
    
    public Object selectedMode() {
        return this.selectedMode;
    }
    
    public Legend selectedMode(final Object selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }
    
    public Boolean selected(final String name) {
        if (this.selected == null) {
            return null;
        }
        return this.selected.get(name);
    }
    
    public Legend selected(final String name, final Boolean selected) {
        if (!this.data.contains(name)) {
            throw new RuntimeException("Legend\u4e2d\u4e0d\u5305\u542bname\u4e3a" + name + "\u7684\u56fe\u4f8b");
        }
        if (this.selected == null) {
            this.selected = new LinkedHashMap<String, Boolean>();
        }
        this.selected.put(name, selected);
        return this;
    }
    
    public List<Object> data() {
        if (this.data == null) {
            this.data = new ArrayList<Object>();
        }
        return this.data;
    }
    
    @Override
    public Legend data(final Object... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.data().addAll(Arrays.asList(values));
        return this;
    }
    
    public TextStyle getTextStyle() {
        return this.textStyle;
    }
    
    public void setTextStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
    }
    
    public List<Object> getData() {
        return this.data;
    }
    
    public void setData(final List<Object> data) {
        this.data = data;
    }
    
    public Orient getOrient() {
        return this.orient;
    }
    
    public void setOrient(final Orient orient) {
        this.orient = orient;
    }
    
    public Integer getItemWidth() {
        return this.itemWidth;
    }
    
    public void setItemWidth(final Integer itemWidth) {
        this.itemWidth = itemWidth;
    }
    
    public Integer getItemHeight() {
        return this.itemHeight;
    }
    
    public void setItemHeight(final Integer itemHeight) {
        this.itemHeight = itemHeight;
    }
    
    public Object getSelectedMode() {
        return this.selectedMode;
    }
    
    public void setSelectedMode(final Object selectedMode) {
        this.selectedMode = selectedMode;
    }
    
    public Map<String, Boolean> getSelected() {
        return this.selected;
    }
    
    public void setSelected(final Map<String, Boolean> selected) {
        this.selected = selected;
    }
}
