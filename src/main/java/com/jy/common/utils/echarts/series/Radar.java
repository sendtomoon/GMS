package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.code.*;

public class Radar extends Series<Radar>
{
    private Integer polarIndex;
    
    public Radar() {
        this.type(SeriesType.radar);
    }
    
    public Radar(final String name) {
        super(name);
        this.type(SeriesType.radar);
    }
    
    public Integer polarIndex() {
        return this.polarIndex;
    }
    
    public Radar polarIndex(final Integer polarIndex) {
        this.polarIndex = polarIndex;
        return this;
    }
    
    public Integer getPolarIndex() {
        return this.polarIndex;
    }
    
    public void setPolarIndex(final Integer polarIndex) {
        this.polarIndex = polarIndex;
    }
}
