package com.jy.common.utils.echarts.axis;

import com.jy.common.utils.echarts.style.*;
import com.jy.common.utils.echarts.code.*;

public class ValueAxis extends Axis<ValueAxis>
{
    private NameLocation nameLocation;
    private LineStyle nameTextStyle;
    private Integer min;
    private Integer max;
    private Boolean scale;
    private Integer precision;
    private Integer power;
    private Integer splitNumber;
    private Double[] boundaryGap;
    
    public ValueAxis() {
        this.type(AxisType.value);
    }
    
    public Integer min() {
        return this.min;
    }
    
    public ValueAxis min(final Integer min) {
        this.min = min;
        return this;
    }
    
    public Integer max() {
        return this.max;
    }
    
    public ValueAxis max(final Integer max) {
        this.max = max;
        return this;
    }
    
    public Boolean scale() {
        return this.scale;
    }
    
    public ValueAxis scale(final Boolean scale) {
        this.scale = scale;
        return this;
    }
    
    public Integer precision() {
        return this.precision;
    }
    
    public ValueAxis precision(final Integer precision) {
        this.precision = precision;
        return this;
    }
    
    public Integer power() {
        return this.power;
    }
    
    public ValueAxis power(final Integer power) {
        this.power = power;
        return this;
    }
    
    public Integer splitNumber() {
        return this.splitNumber;
    }
    
    public ValueAxis splitNumber(final Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }
    
    public Double[] boundaryGap() {
        if (this.boundaryGap == null) {
            this.boundaryGap = new Double[2];
        }
        return this.boundaryGap;
    }
    
    public ValueAxis boundaryGap(final Double[] boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }
    
    public ValueAxis boundaryGap(final Double min, final Double max) {
        this.boundaryGap()[0] = min;
        this.boundaryGap()[1] = max;
        return this;
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
    
    public Boolean getScale() {
        return this.scale;
    }
    
    public void setScale(final Boolean scale) {
        this.scale = scale;
    }
    
    public Integer getPrecision() {
        return this.precision;
    }
    
    public void setPrecision(final Integer precision) {
        this.precision = precision;
    }
    
    public Integer getPower() {
        return this.power;
    }
    
    public void setPower(final Integer power) {
        this.power = power;
    }
    
    public Integer getSplitNumber() {
        return this.splitNumber;
    }
    
    public void setSplitNumber(final Integer splitNumber) {
        this.splitNumber = splitNumber;
    }
    
    public Double[] getBoundaryGap() {
        return this.boundaryGap;
    }
    
    public void setBoundaryGap(final Double[] boundaryGap) {
        this.boundaryGap = boundaryGap;
    }
    
    public NameLocation getNameLocation() {
        return this.nameLocation;
    }
    
    public void setNameLocation(final NameLocation nameLocation) {
        this.nameLocation = nameLocation;
    }
    
    public LineStyle getNameTextStyle() {
        return this.nameTextStyle;
    }
    
    public void setNameTextStyle(final LineStyle nameTextStyle) {
        this.nameTextStyle = nameTextStyle;
    }
    
    public NameLocation nameLocation() {
        return this.nameLocation;
    }
    
    public ValueAxis nameLocation(final NameLocation nameLocation) {
        this.nameLocation = nameLocation;
        return this;
    }
    
    public LineStyle nameTextStyle() {
        if (this.nameTextStyle == null) {
            this.nameTextStyle = new LineStyle();
        }
        return this.nameTextStyle;
    }
    
    public ValueAxis nameTextStyle(final LineStyle style) {
        this.nameTextStyle = style;
        return this;
    }
}
