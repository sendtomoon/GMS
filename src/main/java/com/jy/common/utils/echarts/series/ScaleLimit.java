package com.jy.common.utils.echarts.series;

import java.io.*;

public class ScaleLimit implements Serializable
{
    private static final long serialVersionUID = 6026916937450874614L;
    private Double min;
    private Double max;
    
    public ScaleLimit() {
    }
    
    public ScaleLimit(final Double min, final Double max) {
        this.min = min;
        this.max = max;
    }
    
    public Double min() {
        return this.min;
    }
    
    public ScaleLimit min(final Double min) {
        this.min = min;
        return this;
    }
    
    public Double max() {
        return this.max;
    }
    
    public ScaleLimit max(final Double max) {
        this.max = max;
        return this;
    }
    
    public Double getMin() {
        return this.min;
    }
    
    public void setMin(final Double min) {
        this.min = min;
    }
    
    public Double getMax() {
        return this.max;
    }
    
    public void setMax(final Double max) {
        this.max = max;
    }
}
