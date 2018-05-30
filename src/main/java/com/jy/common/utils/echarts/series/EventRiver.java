package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.code.*;

public class EventRiver extends Series<EventRiver>
{
    private Integer weight;
    
    public EventRiver() {
        this.type(SeriesType.eventRiver);
    }
    
    public EventRiver(final String name) {
        super(name);
        this.type(SeriesType.eventRiver);
    }
    
    public EventRiver(final String name, final Integer weight) {
        super(name);
        this.type(SeriesType.eventRiver);
        this.weight(weight);
    }
    
    public Integer weight() {
        return this.weight;
    }
    
    public EventRiver weight(final Integer weight) {
        this.weight = weight;
        return this;
    }
    
    public Integer getWeight() {
        return this.weight;
    }
    
    public void setWeight(final Integer weight) {
        this.weight = weight;
    }
}
