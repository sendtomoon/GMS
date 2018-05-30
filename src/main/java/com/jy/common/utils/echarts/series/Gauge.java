package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.axis.*;
import com.jy.common.utils.echarts.*;
import com.jy.common.utils.echarts.series.gauge.*;
import com.jy.common.utils.echarts.code.*;

public class Gauge extends Series<Gauge>
{
    private Object[] center;
    private Object radius;
    private Integer startAngle;
    private Integer endAngle;
    private Integer min;
    private Integer max;
    private Integer splitNumber;
    private Line axisLine;
    private AxisTick axisTick;
    private Label axisLabel;
    private SplitLine splitLine;
    private Pointer pointer;
    private Title title;
    private Detail detail;
    
    public Gauge() {
        this.type(SeriesType.gauge);
    }
    
    public Gauge(final String name) {
        super(name);
        this.type(SeriesType.gauge);
    }
    
    public Object[] center() {
        return this.center;
    }
    
    public Gauge center(final Object[] center) {
        this.center = center;
        return this;
    }
    
    public Object radius() {
        return this.radius;
    }
    
    public Gauge axisLine(final Line axisLine) {
        this.axisLine = axisLine;
        return this;
    }
    
    public Gauge axisTick(final AxisTick axisTick) {
        this.axisTick = axisTick;
        return this;
    }
    
    public Gauge axisLabel(final Label axisLabel) {
        this.axisLabel = axisLabel;
        return this;
    }
    
    public Gauge splitLine(final SplitLine splitLine) {
        this.splitLine = splitLine;
        return this;
    }
    
    public Gauge pointer(final Pointer pointer) {
        this.pointer = pointer;
        return this;
    }
    
    public Gauge title(final Title title) {
        this.title = title;
        return this;
    }
    
    public Gauge detail(final Detail detail) {
        this.detail = detail;
        return this;
    }
    
    public Gauge center(final Object width, final Object height) {
        this.center = new Object[] { width, height };
        return this;
    }
    
    public Gauge radius(final Object radius) {
        this.radius = radius;
        return this;
    }
    
    public Gauge radius(final Object width, final Object height) {
        this.radius = new Object[] { width, height };
        return this;
    }
    
    public Integer startAngle() {
        return this.startAngle;
    }
    
    public Gauge startAngle(final Integer startAngle) {
        this.startAngle = startAngle;
        return this;
    }
    
    public Integer endAngle() {
        return this.endAngle;
    }
    
    public Gauge endAngle(final Integer endAngle) {
        this.endAngle = endAngle;
        return this;
    }
    
    public Integer min() {
        return this.min;
    }
    
    public Gauge min(final Integer min) {
        this.min = min;
        return this;
    }
    
    public Integer max() {
        return this.max;
    }
    
    public Gauge max(final Integer max) {
        this.max = max;
        return this;
    }
    
    public Integer splitNumber() {
        return this.splitNumber;
    }
    
    public Gauge splitNumber(final Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }
    
    public Line axisLine() {
        if (this.axisLine == null) {
            this.axisLine = new Line();
        }
        return this.axisLine;
    }
    
    public AxisTick axisTick() {
        if (this.axisTick == null) {
            this.axisTick = new AxisTick();
        }
        return this.axisTick;
    }
    
    public Label axisLabel() {
        if (this.axisLabel == null) {
            this.axisLabel = new Label();
        }
        return this.axisLabel;
    }
    
    public SplitLine splitLine() {
        if (this.splitLine == null) {
            this.splitLine = new SplitLine();
        }
        return this.splitLine;
    }
    
    public Pointer pointer() {
        if (this.pointer == null) {
            this.pointer = new Pointer();
        }
        return this.pointer;
    }
    
    public Title title() {
        if (this.title == null) {
            this.title = new Title();
        }
        return this.title;
    }
    
    public Detail detail() {
        if (this.detail == null) {
            this.detail = new Detail();
        }
        return this.detail;
    }
    
    public Object[] getCenter() {
        return this.center;
    }
    
    public void setCenter(final Object[] center) {
        this.center = center;
    }
    
    public Object getRadius() {
        return this.radius;
    }
    
    public void setRadius(final Object radius) {
        this.radius = radius;
    }
    
    public Line getAxisLine() {
        return this.axisLine;
    }
    
    public void setAxisLine(final Line axisLine) {
        this.axisLine = axisLine;
    }
    
    public AxisTick getAxisTick() {
        return this.axisTick;
    }
    
    public void setAxisTick(final AxisTick axisTick) {
        this.axisTick = axisTick;
    }
    
    public Label getAxisLabel() {
        return this.axisLabel;
    }
    
    public void setAxisLabel(final Label axisLabel) {
        this.axisLabel = axisLabel;
    }
    
    public SplitLine getSplitLine() {
        return this.splitLine;
    }
    
    public void setSplitLine(final SplitLine splitLine) {
        this.splitLine = splitLine;
    }
    
    public Pointer getPointer() {
        return this.pointer;
    }
    
    public void setPointer(final Pointer pointer) {
        this.pointer = pointer;
    }
    
    public Title getTitle() {
        return this.title;
    }
    
    public void setTitle(final Title title) {
        this.title = title;
    }
    
    public Detail getDetail() {
        return this.detail;
    }
    
    public void setDetail(final Detail detail) {
        this.detail = detail;
    }
    
    public Integer getStartAngle() {
        return this.startAngle;
    }
    
    public void setStartAngle(final Integer startAngle) {
        this.startAngle = startAngle;
    }
    
    public Integer getEndAngle() {
        return this.endAngle;
    }
    
    public void setEndAngle(final Integer endAngle) {
        this.endAngle = endAngle;
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
    
    public Integer getSplitNumber() {
        return this.splitNumber;
    }
    
    public void setSplitNumber(final Integer splitNumber) {
        this.splitNumber = splitNumber;
    }
}
