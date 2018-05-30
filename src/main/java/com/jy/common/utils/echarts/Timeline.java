package com.jy.common.utils.echarts;

import com.jy.common.utils.echarts.code.*;
import com.jy.common.utils.echarts.style.*;

public class Timeline extends AbstractData<Timeline> implements Component
{
    private Boolean show;
    private Integer zlevel;
    private Integer z;
    private TimeLineType type;
    private Boolean notMerge;
    private Boolean realtime;
    private Object x;
    private Object y;
    private Object x2;
    private Object y2;
    private Object width;
    private Object height;
    private String backgroundColor;
    private Integer borderWidth;
    private String borderColor;
    private Integer padding;
    private ControlPosition controlPosition;
    private Boolean autoPlay;
    private Boolean loop;
    private Integer playInterval;
    private LineStyle lineStyle;
    private Label label;
    private CheckpointStyle checkpointStyle;
    private ControlStyle controlStyle;
    private Object symbol;
    private Object symbolSize;
    private Integer currentIndex;
    
    public Boolean show() {
        return this.show;
    }
    
    public Timeline show(final Boolean show) {
        this.show = show;
        return this;
    }
    
    public TimeLineType type() {
        return this.type;
    }
    
    public Timeline type(final TimeLineType type) {
        this.type = type;
        return this;
    }
    
    public Boolean notMerge() {
        return this.notMerge;
    }
    
    public Timeline notMerge(final Boolean notMerge) {
        this.notMerge = notMerge;
        return this;
    }
    
    public Boolean realtime() {
        return this.realtime;
    }
    
    public Timeline realtime(final Boolean realtime) {
        this.realtime = realtime;
        return this;
    }
    
    public Object x() {
        return this.x;
    }
    
    public Timeline x(final Object x) {
        this.x = x;
        return this;
    }
    
    public Object y() {
        return this.y;
    }
    
    public Timeline y(final Object y) {
        this.y = y;
        return this;
    }
    
    public Object x2() {
        return this.x2;
    }
    
    public Timeline x2(final Object x2) {
        this.x2 = x2;
        return this;
    }
    
    public Object y2() {
        return this.y2;
    }
    
    public Timeline y2(final Object y2) {
        this.y2 = y2;
        return this;
    }
    
    public Object width() {
        return this.width;
    }
    
    public Timeline width(final Object width) {
        this.width = width;
        return this;
    }
    
    public Object height() {
        return this.height;
    }
    
    public Timeline height(final Object height) {
        this.height = height;
        return this;
    }
    
    public String backgroundColor() {
        return this.backgroundColor;
    }
    
    public Timeline backgroundColor(final String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    
    public String borderColor() {
        return this.borderColor;
    }
    
    public Timeline borderColor(final String borderColor) {
        this.borderColor = borderColor;
        return this;
    }
    
    public Integer borderWidth() {
        return this.borderWidth;
    }
    
    public Timeline borderWidth(final Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }
    
    public Integer padding() {
        return this.padding;
    }
    
    public Timeline padding(final Integer padding) {
        this.padding = padding;
        return this;
    }
    
    public ControlPosition controlPosition() {
        return this.controlPosition;
    }
    
    public Timeline controlPosition(final ControlPosition controlPosition) {
        this.controlPosition = controlPosition;
        return this;
    }
    
    public Boolean autoPlay() {
        return this.autoPlay;
    }
    
    public Timeline autoPlay(final Boolean autoPlay) {
        this.autoPlay = autoPlay;
        return this;
    }
    
    public Boolean loop() {
        return this.loop;
    }
    
    public Timeline loop(final Boolean loop) {
        this.loop = loop;
        return this;
    }
    
    public Integer playInterval() {
        return this.playInterval;
    }
    
    public Timeline playInterval(final Integer playInterval) {
        this.playInterval = playInterval;
        return this;
    }
    
    public LineStyle lineStyle() {
        if (this.lineStyle == null) {
            this.lineStyle = new LineStyle();
        }
        return this.lineStyle;
    }
    
    public Label label() {
        if (this.label == null) {
            this.label = new Label();
        }
        return this.label;
    }
    
    public CheckpointStyle checkpointStyle() {
        if (this.checkpointStyle == null) {
            this.checkpointStyle = new CheckpointStyle();
        }
        return this.checkpointStyle;
    }
    
    public ControlStyle controlStyle() {
        if (this.controlStyle == null) {
            this.controlStyle = new ControlStyle();
        }
        return this.controlStyle;
    }
    
    public Object symbol() {
        return this.symbol;
    }
    
    public Timeline symbol(final Object symbol) {
        this.symbol = symbol;
        return this;
    }
    
    public Object symbolSize() {
        return this.symbolSize;
    }
    
    public Timeline symbolSize(final Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }
    
    public Integer currentIndex() {
        return this.currentIndex;
    }
    
    public Timeline currentIndex(final Integer currentIndex) {
        this.currentIndex = currentIndex;
        return this;
    }
    
    public Timeline zlevel(final Integer zlevel) {
        this.zlevel = zlevel;
        return this;
    }
    
    public Integer zlevel() {
        return this.zlevel;
    }
    
    public Timeline z(final Integer z) {
        this.z = z;
        return this;
    }
    
    public Integer z() {
        return this.z;
    }
    
    public LineStyle getLineStyle() {
        return this.lineStyle;
    }
    
    public void setLineStyle(final LineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }
    
    public Label getLabel() {
        return this.label;
    }
    
    public void setLabel(final Label label) {
        this.label = label;
    }
    
    public CheckpointStyle getCheckpointStyle() {
        return this.checkpointStyle;
    }
    
    public void setCheckpointStyle(final CheckpointStyle checkpointStyle) {
        this.checkpointStyle = checkpointStyle;
    }
    
    public ControlStyle getControlStyle() {
        return this.controlStyle;
    }
    
    public void setControlStyle(final ControlStyle controlStyle) {
        this.controlStyle = controlStyle;
    }
    
    public Boolean getShow() {
        return this.show;
    }
    
    public void setShow(final Boolean show) {
        this.show = show;
    }
    
    public TimeLineType getType() {
        return this.type;
    }
    
    public void setType(final TimeLineType type) {
        this.type = type;
    }
    
    public Boolean getNotMerge() {
        return this.notMerge;
    }
    
    public void setNotMerge(final Boolean notMerge) {
        this.notMerge = notMerge;
    }
    
    public Boolean getRealtime() {
        return this.realtime;
    }
    
    public void setRealtime(final Boolean realtime) {
        this.realtime = realtime;
    }
    
    public Object getX() {
        return this.x;
    }
    
    public void setX(final Object x) {
        this.x = x;
    }
    
    public Object getY() {
        return this.y;
    }
    
    public void setY(final Object y) {
        this.y = y;
    }
    
    public Object getX2() {
        return this.x2;
    }
    
    public void setX2(final Object x2) {
        this.x2 = x2;
    }
    
    public Object getY2() {
        return this.y2;
    }
    
    public void setY2(final Object y2) {
        this.y2 = y2;
    }
    
    public Object getWidth() {
        return this.width;
    }
    
    public void setWidth(final Object width) {
        this.width = width;
    }
    
    public Object getHeight() {
        return this.height;
    }
    
    public void setHeight(final Object height) {
        this.height = height;
    }
    
    public String getBackgroundColor() {
        return this.backgroundColor;
    }
    
    public void setBackgroundColor(final String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    
    public String getBorderColor() {
        return this.borderColor;
    }
    
    public void setBorderColor(final String borderColor) {
        this.borderColor = borderColor;
    }
    
    public Integer getBorderWidth() {
        return this.borderWidth;
    }
    
    public void setBorderWidth(final Integer borderWidth) {
        this.borderWidth = borderWidth;
    }
    
    public Integer getPadding() {
        return this.padding;
    }
    
    public void setPadding(final Integer padding) {
        this.padding = padding;
    }
    
    public ControlPosition getControlPosition() {
        return this.controlPosition;
    }
    
    public void setControlPosition(final ControlPosition controlPosition) {
        this.controlPosition = controlPosition;
    }
    
    public Boolean getAutoPlay() {
        return this.autoPlay;
    }
    
    public void setAutoPlay(final Boolean autoPlay) {
        this.autoPlay = autoPlay;
    }
    
    public Boolean getLoop() {
        return this.loop;
    }
    
    public void setLoop(final Boolean loop) {
        this.loop = loop;
    }
    
    public Integer getPlayInterval() {
        return this.playInterval;
    }
    
    public void setPlayInterval(final Integer playInterval) {
        this.playInterval = playInterval;
    }
    
    public Object getSymbol() {
        return this.symbol;
    }
    
    public void setSymbol(final Object symbol) {
        this.symbol = symbol;
    }
    
    public Object getSymbolSize() {
        return this.symbolSize;
    }
    
    public void setSymbolSize(final Object symbolSize) {
        this.symbolSize = symbolSize;
    }
    
    public Integer getCurrentIndex() {
        return this.currentIndex;
    }
    
    public void setCurrentIndex(final Integer currentIndex) {
        this.currentIndex = currentIndex;
    }
    
    public Integer getZlevel() {
        return this.zlevel;
    }
    
    public void setZlevel(final Integer zlevel) {
        this.zlevel = zlevel;
    }
    
    public Integer getZ() {
        return this.z;
    }
    
    public void setZ(final Integer z) {
        this.z = z;
    }
}
