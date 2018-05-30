package com.jy.common.utils.echarts.code;

public enum Magic
{
    line("line", 0), 
    bar("bar", 1), 
    stack("stack", 2), 
    tiled("tiled", 3), 
    force("force", 4), 
    chord("chord", 5), 
    pie("pie", 6), 
    funnel("funnel", 7);
    
    private Magic(final String s, final int n) {
    }
}
