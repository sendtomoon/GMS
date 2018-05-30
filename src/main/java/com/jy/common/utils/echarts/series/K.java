package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.code.*;

public class K extends Series<K>
{
    private Integer barWidth;
    private Integer barMaxWidth;
    
    public K() {
        this.type(SeriesType.k);
    }
    
    public K(final String name) {
        super(name);
        this.type(SeriesType.k);
    }
    
    public K data(final Double open, final Double close, final Double min, final Double max) {
        final Object[] kData = { open, close, min, max };
        super.data().add(kData);
        return this;
    }
    
    public Integer barWidth() {
        return this.barWidth;
    }
    
    public K barWidth(final Integer barWidth) {
        this.barWidth = barWidth;
        return this;
    }
    
    public Integer barMaxWidth() {
        return this.barMaxWidth;
    }
    
    public K barMaxWidth(final Integer barMaxWidth) {
        this.barMaxWidth = barMaxWidth;
        return this;
    }
    
    public Integer getBarWidth() {
        return this.barWidth;
    }
    
    public void setBarWidth(final Integer barWidth) {
        this.barWidth = barWidth;
    }
    
    public Integer getBarMaxWidth() {
        return this.barMaxWidth;
    }
    
    public void setBarMaxWidth(final Integer barMaxWidth) {
        this.barMaxWidth = barMaxWidth;
    }
}
