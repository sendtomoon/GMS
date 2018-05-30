package com.jy.common.utils.echarts;

import com.jy.common.utils.echarts.code.*;

public class DataZoom extends Basic<DataZoom> implements Component
{
    private Orient orient;
    private String dataBackgroundColor;
    private String fillerColor;
    private String handleColor;
    private Integer handleSize;
    private Object xAxisIndex;
    private Object yAxisIndex;
    private Integer start;
    private Integer end;
    private Boolean realtime;
    private Boolean zoomLock;
    private Boolean showDetail;
    
    public Integer handleSize() {
        return this.handleSize;
    }
    
    public DataZoom handleSize(final Integer handleSize) {
        this.handleSize = handleSize;
        return this;
    }
    
    public Orient orient() {
        return this.orient;
    }
    
    public DataZoom orient(final Orient orient) {
        this.orient = orient;
        return this;
    }
    
    public String dataBackgroundColor() {
        return this.dataBackgroundColor;
    }
    
    public DataZoom dataBackgroundColor(final String dataBackgroundColor) {
        this.dataBackgroundColor = dataBackgroundColor;
        return this;
    }
    
    public String fillerColor() {
        return this.fillerColor;
    }
    
    public DataZoom fillerColor(final String fillerColor) {
        this.fillerColor = fillerColor;
        return this;
    }
    
    public String handleColor() {
        return this.handleColor;
    }
    
    public DataZoom handleColor(final String handleColor) {
        this.handleColor = handleColor;
        return this;
    }
    
    public Object xAxisIndex() {
        return this.xAxisIndex;
    }
    
    public DataZoom xAxisIndex(final Object xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
        return this;
    }
    
    public Object yAxisIndex() {
        return this.yAxisIndex;
    }
    
    public DataZoom yAxisIndex(final Object yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return this;
    }
    
    public Integer start() {
        return this.start;
    }
    
    public DataZoom start(final Integer start) {
        this.start = start;
        return this;
    }
    
    public Integer end() {
        return this.end;
    }
    
    public DataZoom end(final Integer end) {
        this.end = end;
        return this;
    }
    
    public Boolean realtime() {
        return this.realtime;
    }
    
    public DataZoom realtime(final Boolean realtime) {
        this.realtime = realtime;
        return this;
    }
    
    public Boolean zoomLock() {
        return this.zoomLock;
    }
    
    public DataZoom zoomLock(final Boolean zoomLock) {
        this.zoomLock = zoomLock;
        return this;
    }
    
    public Boolean showDetail() {
        return this.showDetail;
    }
    
    public DataZoom showDetail(final Boolean showDetail) {
        this.showDetail = showDetail;
        return this;
    }
    
    public Orient getOrient() {
        return this.orient;
    }
    
    public void setOrient(final Orient orient) {
        this.orient = orient;
    }
    
    public String getDataBackgroundColor() {
        return this.dataBackgroundColor;
    }
    
    public void setDataBackgroundColor(final String dataBackgroundColor) {
        this.dataBackgroundColor = dataBackgroundColor;
    }
    
    public String getFillerColor() {
        return this.fillerColor;
    }
    
    public void setFillerColor(final String fillerColor) {
        this.fillerColor = fillerColor;
    }
    
    public String getHandleColor() {
        return this.handleColor;
    }
    
    public void setHandleColor(final String handleColor) {
        this.handleColor = handleColor;
    }
    
    public Object getxAxisIndex() {
        return this.xAxisIndex;
    }
    
    public void setxAxisIndex(final Object xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
    }
    
    public Object getyAxisIndex() {
        return this.yAxisIndex;
    }
    
    public void setyAxisIndex(final Object yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
    }
    
    public Integer getStart() {
        return this.start;
    }
    
    public void setStart(final Integer start) {
        this.start = start;
    }
    
    public Integer getEnd() {
        return this.end;
    }
    
    public void setEnd(final Integer end) {
        this.end = end;
    }
    
    public Boolean getRealtime() {
        return this.realtime;
    }
    
    public void setRealtime(final Boolean realtime) {
        this.realtime = realtime;
    }
    
    public Boolean getZoomLock() {
        return this.zoomLock;
    }
    
    public void setZoomLock(final Boolean zoomLock) {
        this.zoomLock = zoomLock;
    }
    
    public Boolean getShowDetail() {
        return this.showDetail;
    }
    
    public void setShowDetail(final Boolean showDetail) {
        this.showDetail = showDetail;
    }
    
    public Integer getHandleSize() {
        return this.handleSize;
    }
    
    public void setHandleSize(final Integer handleSize) {
        this.handleSize = handleSize;
    }
}
