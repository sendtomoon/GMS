package com.jy.common.utils.echarts.axis;

import com.jy.common.utils.echarts.*;
import com.jy.common.utils.echarts.code.*;
import java.util.*;

public abstract class Axis<T> extends AbstractData<T> implements Component
{
    private Boolean show;
    private AxisType type;
    private Object position;
    private String name;
    private AxisLine axisLine;
    private AxisTick axisTick;
    private AxisLabel axisLabel;
    private SplitLine splitLine;
    private SplitArea splitArea;
    private Integer zlevel;
    private Integer z;
    
    public T zlevel(final Integer zlevel) {
        this.zlevel = zlevel;
        return (T)this;
    }
    
    public Integer zlevel() {
        return this.zlevel;
    }
    
    public T z(final Integer z) {
        this.z = z;
        return (T)this;
    }
    
    public Integer z() {
        return this.z;
    }
    
    public Boolean show() {
        return this.show;
    }
    
    public T show(final Boolean show) {
        this.show = show;
        return (T)this;
    }
    
    public AxisType type() {
        return this.type;
    }
    
    public AxisType getType() {
        return this.type;
    }
    
    public void setType(final AxisType type) {
        this.type = type;
    }
    
    public Object getPosition() {
        return this.position;
    }
    
    public void setPosition(final Object position) {
        this.position = position;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public T type(final AxisType type) {
        this.type = type;
        return (T)this;
    }
    
    public Object position() {
        return this.position;
    }
    
    public T position(final Object position) {
        this.position = position;
        return (T)this;
    }
    
    public T position(final X position) {
        this.position = position;
        return (T)this;
    }
    
    public T position(final Y position) {
        this.position = position;
        return (T)this;
    }
    
    public String name() {
        return this.name;
    }
    
    public T name(final String name) {
        this.name = name;
        return (T)this;
    }
    
    public AxisLine axisLine() {
        if (this.axisLine == null) {
            this.axisLine = new AxisLine();
        }
        return this.axisLine;
    }
    
    public T axisLine(final AxisLine axisLine) {
        this.axisLine = axisLine;
        return (T)this;
    }
    
    public AxisTick axisTick() {
        if (this.axisTick == null) {
            this.axisTick = new AxisTick();
        }
        return this.axisTick;
    }
    
    public T axisTick(final AxisTick axisTick) {
        this.axisTick = axisTick;
        return (T)this;
    }
    
    public AxisLabel axisLabel() {
        if (this.axisLabel == null) {
            this.axisLabel = new AxisLabel();
        }
        return this.axisLabel;
    }
    
    public T axisLabel(final AxisLabel label) {
        this.axisLabel = label;
        return (T)this;
    }
    
    public SplitLine splitLine() {
        if (this.splitLine == null) {
            this.splitLine = new SplitLine();
        }
        return this.splitLine;
    }
    
    public T splitLine(final SplitLine splitLine) {
        if (this.splitLine == null) {
            this.splitLine = splitLine;
        }
        return (T)this;
    }
    
    public SplitArea splitArea() {
        if (this.splitArea == null) {
            this.splitArea = new SplitArea();
        }
        return this.splitArea;
    }
    
    public T splitArea(final SplitArea splitArea) {
        this.splitArea = splitArea;
        return (T)this;
    }
    
    @Override
    public T data(final Object... values) {
        if (values == null || values.length == 0) {
            return (T)this;
        }
        if (this.data == null) {
            if (this.type != AxisType.category) {
                throw new RuntimeException("\u6570\u636e\u8f74\u4e0d\u80fd\u6dfb\u52a0\u7c7b\u76ee\u4fe1\u606f!");
            }
            this.data = new ArrayList<Object>();
        }
        this.data.addAll(Arrays.asList(values));
        return (T)this;
    }
    
    public Boolean getShow() {
        return this.show;
    }
    
    public void setShow(final Boolean show) {
        this.show = show;
    }
    
    public AxisLine getAxisLine() {
        return this.axisLine;
    }
    
    public void setAxisLine(final AxisLine axisLine) {
        this.axisLine = axisLine;
    }
    
    public AxisTick getAxisTick() {
        return this.axisTick;
    }
    
    public void setAxisTick(final AxisTick axisTick) {
        this.axisTick = axisTick;
    }
    
    public AxisLabel getAxisLabel() {
        return this.axisLabel;
    }
    
    public void setAxisLabel(final AxisLabel axisLabel) {
        this.axisLabel = axisLabel;
    }
    
    public SplitLine getSplitLine() {
        return this.splitLine;
    }
    
    public void setSplitLine(final SplitLine splitLine) {
        this.splitLine = splitLine;
    }
    
    public SplitArea getSplitArea() {
        return this.splitArea;
    }
    
    public void setSplitArea(final SplitArea splitArea) {
        this.splitArea = splitArea;
    }
    
    public Integer getZlevel() {
        return this.zlevel;
    }
    
    public void setZlevel(final Integer zlevel) {
        this.zlevel = zlevel;
    }
    
    public Integer getZ() {
        return this.z;
    }
    
    public void setZ(final Integer z) {
        this.z = z;
    }
}
