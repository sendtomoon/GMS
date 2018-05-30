package com.jy.common.utils.echarts.axis;

import java.io.*;
import com.jy.common.utils.echarts.style.*;

public class SplitArea implements Serializable
{
    private static final long serialVersionUID = -5528605504445280383L;
    private Boolean show;
    private AreaStyle areaStyle;
    
    public Boolean show() {
        return this.show;
    }
    
    public SplitArea show(final Boolean show) {
        this.show = show;
        return this;
    }
    
    public SplitArea areaStyle(final AreaStyle areaStyle) {
        this.areaStyle = areaStyle;
        return this;
    }
    
    public AreaStyle areaStyle() {
        if (this.areaStyle == null) {
            this.areaStyle = new AreaStyle();
        }
        return this.areaStyle;
    }
    
    public AreaStyle getAreaStyle() {
        return this.areaStyle;
    }
    
    public void setAreaStyle(final AreaStyle areaStyle) {
        this.areaStyle = areaStyle;
    }
    
    public Boolean getShow() {
        return this.show;
    }
    
    public void setShow(final Boolean show) {
        this.show = show;
    }
}
