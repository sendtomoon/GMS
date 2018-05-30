package com.jy.common.utils.echarts.data;

import java.io.*;

public class KData implements Serializable
{
    private static final long serialVersionUID = 3593085721806381731L;
    private Double[] value;
    
    public KData(final Double open, final Double close, final Double min, final Double max) {
        (this.value = new Double[4])[0] = open;
        this.value[1] = close;
        this.value[2] = min;
        this.value[3] = max;
    }
    
    public Double[] value() {
        return this.value;
    }
    
    public KData value(final Double[] value) {
        this.value = value;
        return this;
    }
    
    public Double[] getValue() {
        return this.value;
    }
    
    public void setValue(final Double[] value) {
        this.value = value;
    }
}
