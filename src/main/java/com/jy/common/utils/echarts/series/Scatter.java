package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.code.*;

public class Scatter extends Series<Scatter>
{
    private Boolean large;
    private Long largeThreshold;
    
    public Scatter() {
        this.type(SeriesType.scatter);
    }
    
    public Scatter(final String name) {
        super(name);
        this.type(SeriesType.scatter);
    }
    
    public Boolean large() {
        return this.large;
    }
    
    public Scatter large(final Boolean large) {
        this.large = large;
        return this;
    }
    
    public Long largeThreshold() {
        return this.largeThreshold;
    }
    
    public Scatter largeThreshold(final Long largeThreshold) {
        this.largeThreshold = largeThreshold;
        return this;
    }
    
    public Boolean getLarge() {
        return this.large;
    }
    
    public void setLarge(final Boolean large) {
        this.large = large;
    }
    
    public Long getLargeThreshold() {
        return this.largeThreshold;
    }
    
    public void setLargeThreshold(final Long largeThreshold) {
        this.largeThreshold = largeThreshold;
    }
}
