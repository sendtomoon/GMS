package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.code.*;

public class Line extends Series<Line>
{
    private Boolean smooth;
    private Object dataFilter;
    
    public Line() {
        this.type(SeriesType.line);
    }
    
    public Line(final String name) {
        super(name);
        this.type(SeriesType.line);
    }
    
    public Object dataFilter() {
        return this.dataFilter;
    }
    
    public Line dataFilter(final Object dataFilter) {
        this.dataFilter = dataFilter;
        return this;
    }
    
    public Line dataFilter(final DataFilter dataFilter) {
        this.dataFilter = dataFilter;
        return this;
    }
    
    public Boolean smooth() {
        return this.smooth;
    }
    
    public Line smooth(final Boolean smooth) {
        this.smooth = smooth;
        return this;
    }
    
    public Boolean getSmooth() {
        return this.smooth;
    }
    
    public void setSmooth(final Boolean smooth) {
        this.smooth = smooth;
    }
    
    public Object getDataFilter() {
        return this.dataFilter;
    }
    
    public void setDataFilter(final Object dataFilter) {
        this.dataFilter = dataFilter;
    }
}
