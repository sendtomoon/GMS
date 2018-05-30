package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.code.*;

public class Pie extends Series<Pie>
{
    private Object[] center;
    private Object radius;
    private Integer startAngle;
    private Integer minAngle;
    private Boolean clockWise;
    private RoseType roseType;
    private Integer selectedOffset;
    private SelectedMode selectedMode;
    
    public Pie() {
        this.type(SeriesType.pie);
    }
    
    public Pie(final String name) {
        super(name);
        this.type(SeriesType.pie);
    }
    
    public Object[] center() {
        return this.center;
    }
    
    public Pie center(final Object[] center) {
        this.center = center;
        return this;
    }
    
    public Object radius() {
        return this.radius;
    }
    
    public Pie center(final Object width, final Object height) {
        this.center = new Object[] { width, height };
        return this;
    }
    
    public Pie radius(final Object radius) {
        this.radius = radius;
        return this;
    }
    
    public Pie radius(final Object width, final Object height) {
        this.radius = new Object[] { width, height };
        return this;
    }
    
    public Integer startAngle() {
        return this.startAngle;
    }
    
    public Pie startAngle(final Integer startAngle) {
        this.startAngle = startAngle;
        return this;
    }
    
    public Integer minAngle() {
        return this.minAngle;
    }
    
    public Pie minAngle(final Integer minAngle) {
        this.minAngle = minAngle;
        return this;
    }
    
    public Boolean clockWise() {
        return this.clockWise;
    }
    
    public Pie clockWise(final Boolean clockWise) {
        this.clockWise = clockWise;
        return this;
    }
    
    public RoseType roseType() {
        return this.roseType;
    }
    
    public Pie roseType(final RoseType roseType) {
        this.roseType = roseType;
        return this;
    }
    
    public Integer selectedOffset() {
        return this.selectedOffset;
    }
    
    public Pie selectedOffset(final Integer selectedOffset) {
        this.selectedOffset = selectedOffset;
        return this;
    }
    
    public SelectedMode selectedMode() {
        return this.selectedMode;
    }
    
    public Pie selectedMode(final SelectedMode selectedMode) {
        this.selectedMode = selectedMode;
        return this;
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
    
    public Integer getStartAngle() {
        return this.startAngle;
    }
    
    public void setStartAngle(final Integer startAngle) {
        this.startAngle = startAngle;
    }
    
    public Integer getMinAngle() {
        return this.minAngle;
    }
    
    public void setMinAngle(final Integer minAngle) {
        this.minAngle = minAngle;
    }
    
    public Boolean getClockWise() {
        return this.clockWise;
    }
    
    public void setClockWise(final Boolean clockWise) {
        this.clockWise = clockWise;
    }
    
    public RoseType getRoseType() {
        return this.roseType;
    }
    
    public void setRoseType(final RoseType roseType) {
        this.roseType = roseType;
    }
    
    public Integer getSelectedOffset() {
        return this.selectedOffset;
    }
    
    public void setSelectedOffset(final Integer selectedOffset) {
        this.selectedOffset = selectedOffset;
    }
    
    public SelectedMode getSelectedMode() {
        return this.selectedMode;
    }
    
    public void setSelectedMode(final SelectedMode selectedMode) {
        this.selectedMode = selectedMode;
    }
}
