package com.jy.common.utils.echarts;

public enum Event
{
    REFRESH("REFRESH", 0, "refresh"), 
    RESTORE("RESTORE", 1, "restore"), 
    RESIZE("RESIZE", 2, "resize"), 
    CLICK("CLICK", 3, "click"), 
    DBLCLICK("DBLCLICK", 4, "dblclick"), 
    HOVER("HOVER", 5, "hover"), 
    DATA_CHANGED("DATA_CHANGED", 6, "dataChanged"), 
    DATA_ZOOM("DATA_ZOOM", 7, "dataZoom"), 
    DATA_RANGE("DATA_RANGE", 8, "dataRange"), 
    LEGEND_SELECTED("LEGEND_SELECTED", 9, "legendSelected"), 
    MAP_SELECTED("MAP_SELECTED", 10, "mapSelected"), 
    PIE_SELECTED("PIE_SELECTED", 11, "pieSelected"), 
    MAGIC_TYPE_CHANGED("MAGIC_TYPE_CHANGED", 12, "magicTypeChanged"), 
    DATA_VIEW_CHANGED("DATA_VIEW_CHANGED", 13, "dataViewChanged"), 
    TIMELINE_CHANGED("TIMELINE_CHANGED", 14, "timelineChanged"), 
    MAP_ROAM("MAP_ROAM", 15, "mapRoam"), 
    TOOLTIP_HOVER("TOOLTIP_HOVER", 16, "tooltipHover"), 
    TOOLTIP_IN_GRID("TOOLTIP_IN_GRID", 17, "tooltipInGrid"), 
    TOOLTIP_OUT_GRID("TOOLTIP_OUT_GRID", 18, "tooltipOutGrid");
    
    private String event;
    
    private Event(final String s, final int n, final String event) {
        this.event = event;
    }
    
    @Override
    public String toString() {
        return this.event;
    }
}
