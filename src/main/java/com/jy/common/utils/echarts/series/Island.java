package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.code.*;

public class Island extends Series<Island>
{
    private Object r;
    private Object calculateStep;
    
    public Island() {
        this.type(SeriesType.island);
    }
    
    public Island(final String name) {
        super(name);
        this.type(SeriesType.island);
    }
    
    public Object r() {
        return this.r;
    }
    
    public Island r(final Object r) {
        this.r = r;
        return this;
    }
    
    public Object calculateStep() {
        return this.calculateStep;
    }
    
    public Island calculateStep(final Object calculateStep) {
        this.calculateStep = calculateStep;
        return this;
    }
    
    public Object getR() {
        return this.r;
    }
    
    public void setR(final Object r) {
        this.r = r;
    }
    
    public Object getCalculateStep() {
        return this.calculateStep;
    }
    
    public void setCalculateStep(final Object calculateStep) {
        this.calculateStep = calculateStep;
    }
}
