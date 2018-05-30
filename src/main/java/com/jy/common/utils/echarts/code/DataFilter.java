package com.jy.common.utils.echarts.code;

public enum DataFilter
{
    nearest("nearest", 0), 
    min("min", 1), 
    max("max", 2), 
    average("average", 3);
    
    private DataFilter(final String s, final int n) {
    }
}
