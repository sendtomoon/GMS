package com.jy.common.utils.echarts;

import com.jy.common.utils.echarts.style.*;
import com.jy.common.utils.echarts.data.*;
import com.jy.common.utils.echarts.code.*;
import java.util.*;

public class DataRange extends Basic<DataRange> implements Component
{
    private Orient orient;
    private Integer itemWidth;
    private Integer itemHeight;
    private Integer min;
    private Integer max;
    private Integer precision;
    private Integer splitNumber;
    private Boolean calculable;
    private Boolean realtime;
    private List<String> color;
    private Object formatter;
    private List<String> text;
    private TextStyle textStyle;
    private Boolean hoverLink;
    private RangeData range;
    private List<RangeData> splitList;
    private Object selectedMode;
    
    public Object selectedMode() {
        return this.selectedMode;
    }
    
    public DataRange selectedMode(final Object selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }
    
    public DataRange selectedMode(final SelectedMode selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }
    
    public DataRange range(final RangeData range) {
        this.range = range;
        return this;
    }
    
    public RangeData range() {
        return this.range;
    }
    
    public DataRange splitList(final RangeData... splitList) {
        if (splitList == null || splitList.length == 0) {
            return this;
        }
        this.splitList().addAll(Arrays.asList(splitList));
        return this;
    }
    
    public List<RangeData> splitList() {
        if (this.splitList == null) {
            this.splitList = new ArrayList<RangeData>();
        }
        return this.splitList;
    }
    
    public DataRange color(final List<String> color) {
        this.color = color;
        return this;
    }
    
    public DataRange text(final List<String> text) {
        this.text = text;
        return this;
    }
    
    public Boolean hoverLink() {
        return this.hoverLink;
    }
    
    public DataRange hoverLink(final Boolean hoverLink) {
        this.hoverLink = hoverLink;
        return this;
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
    
    public Integer getMin() {
        return this.min;
    }
    
    public void setMin(final Integer min) {
        this.min = min;
    }
    
    public Integer getMax() {
        return this.max;
    }
    
    public void setMax(final Integer max) {
        this.max = max;
    }
    
    public Integer getPrecision() {
        return this.precision;
    }
    
    public void setPrecision(final Integer precision) {
        this.precision = precision;
    }
    
    public Integer getSplitNumber() {
        return this.splitNumber;
    }
    
    public void setSplitNumber(final Integer splitNumber) {
        this.splitNumber = splitNumber;
    }
    
    public Boolean getCalculable() {
        return this.calculable;
    }
    
    public void setCalculable(final Boolean calculable) {
        this.calculable = calculable;
    }
    
    public Boolean getRealtime() {
        return this.realtime;
    }
    
    public void setRealtime(final Boolean realtime) {
        this.realtime = realtime;
    }
    
    public Object getFormatter() {
        return this.formatter;
    }
    
    public void setFormatter(final Object formatter) {
        this.formatter = formatter;
    }
    
    public DataRange textStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }
    
    public Orient orient() {
        return this.orient;
    }
    
    public DataRange orient(final Orient orient) {
        this.orient = orient;
        return this;
    }
    
    public Integer itemWidth() {
        return this.itemWidth;
    }
    
    public DataRange itemWidth(final Integer itemWidth) {
        this.itemWidth = itemWidth;
        return this;
    }
    
    public Integer itemHeight() {
        return this.itemHeight;
    }
    
    public DataRange itemHeight(final Integer itemHeight) {
        this.itemHeight = itemHeight;
        return this;
    }
    
    public Integer min() {
        return this.min;
    }
    
    public DataRange min(final Integer min) {
        this.min = min;
        return this;
    }
    
    public Integer max() {
        return this.max;
    }
    
    public DataRange max(final Integer max) {
        this.max = max;
        return this;
    }
    
    public Integer precision() {
        return this.precision;
    }
    
    public DataRange precision(final Integer precision) {
        this.precision = precision;
        return this;
    }
    
    public Integer splitNumber() {
        return this.splitNumber;
    }
    
    public DataRange splitNumber(final Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }
    
    public Boolean calculable() {
        return this.calculable;
    }
    
    public DataRange calculable(final Boolean calculable) {
        this.calculable = calculable;
        return this;
    }
    
    public Boolean realtime() {
        return this.realtime;
    }
    
    public DataRange realtime(final Boolean realtime) {
        this.realtime = realtime;
        return this;
    }
    
    public List<String> color() {
        if (this.color == null) {
            this.color = new ArrayList<String>();
        }
        return this.color;
    }
    
    public DataRange color(final String... colors) {
        if (colors == null || colors.length == 0) {
            return this;
        }
        this.color().addAll(Arrays.asList(colors));
        return this;
    }
    
    public Object formatter() {
        return this.formatter;
    }
    
    public DataRange formatter(final Object formatter) {
        this.formatter = formatter;
        return this;
    }
    
    public List<String> text() {
        if (this.text == null) {
            this.text = new ArrayList<String>();
        }
        return this.text;
    }
    
    public DataRange text(final String... texts) {
        if (texts == null || texts.length == 0) {
            return this;
        }
        this.text().addAll(Arrays.asList(texts));
        return this;
    }
    
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }
    
    public List<String> getColor() {
        return this.color;
    }
    
    public void setColor(final List<String> color) {
        this.color = color;
    }
    
    public List<String> getText() {
        return this.text;
    }
    
    public void setText(final List<String> text) {
        this.text = text;
    }
    
    public TextStyle getTextStyle() {
        return this.textStyle;
    }
    
    public void setTextStyle(final TextStyle textStyle) {
        this.textStyle = textStyle;
    }
    
    public Boolean getHoverLink() {
        return this.hoverLink;
    }
    
    public void setHoverLink(final Boolean hoverLink) {
        this.hoverLink = hoverLink;
    }
    
    public RangeData getRange() {
        return this.range;
    }
    
    public void setRange(final RangeData range) {
        this.range = range;
    }
    
    public List<RangeData> getSplitList() {
        return this.splitList;
    }
    
    public void setSplitList(final List<RangeData> splitList) {
        this.splitList = splitList;
    }
    
    public Object getSelectedMode() {
        return this.selectedMode;
    }
    
    public void setSelectedMode(final Object selectedMode) {
        this.selectedMode = selectedMode;
    }
}
