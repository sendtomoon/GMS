package com.jy.common.utils.echarts.series;

import java.util.*;
import java.math.*;
import java.io.*;

public class GeoCoord extends HashMap<String, BigDecimal[]> implements Serializable
{
    private static final long serialVersionUID = 7548362611708057870L;
    
    public GeoCoord put(final String key, final String x, final String y) {
        super.put(key, new BigDecimal[] { new BigDecimal(x), new BigDecimal(y) });
        return this;
    }
}
