package com.jy.common.utils.echarts.code;

public enum SeriesType
{
    line("line", 0), 
    bar("bar", 1), 
    scatter("scatter", 2), 
    k("k", 3), 
    pie("pie", 4), 
    radar("radar", 5), 
    chord("chord", 6), 
    force("force", 7), 
    map("map", 8), 
    funnel("funnel", 9), 
    gauge("gauge", 10), 
    island("island", 11), 
    eventRiver("eventRiver", 12), 
    venn("venn", 13), 
    treemap("treemap", 14), 
    wordCloud("wordCloud", 15), 
    tree("tree", 16), 
    heatmap("heatmap", 17);
    
    private SeriesType(final String s, final int n) {
    }
}
