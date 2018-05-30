package com.jy.common.utils.echarts.data;

public class LineData extends BasicData<LineData>
{
    private Integer valueIndex;
    
    public LineData() {
    }
    
    public LineData(final String name, final Object value) {
        super(name, value);
    }
    
    public LineData(final String name, final Object symbol, final Object symbolSize) {
        super(name, symbol, symbolSize);
    }
    
    public LineData(final Object value, final Object symbol) {
        super(value, symbol);
    }
    
    public LineData(final Object value, final Object symbol, final Object symbolSize) {
        super(value, symbol, symbolSize);
    }
    
    public Integer valueIndex() {
        return this.valueIndex;
    }
    
    public LineData valueIndex(final Integer valueIndex) {
        this.valueIndex = valueIndex;
        return this;
    }
    
    public Integer getValueIndex() {
        return this.valueIndex;
    }
    
    public LineData setValueIndex(final Integer valueIndex) {
        this.valueIndex = valueIndex;
        return this;
    }
}
