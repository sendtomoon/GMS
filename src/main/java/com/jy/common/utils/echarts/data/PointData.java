package com.jy.common.utils.echarts.data;

public class PointData extends BasicData<PointData>
{
    public PointData() {
    }
    
    public PointData(final String name, final Object value) {
        super(name, value);
    }
    
    public PointData(final String name, final Object symbol, final Object symbolSize) {
        super(name, symbol, symbolSize);
    }
    
    public PointData(final Object value, final Object symbol) {
        super(value, symbol);
    }
    
    public PointData(final Object value, final Object symbol, final Object symbolSize) {
        super(value, symbol, symbolSize);
    }
}
