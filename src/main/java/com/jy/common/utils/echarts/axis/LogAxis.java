package com.jy.common.utils.echarts.axis;

import com.jy.common.utils.echarts.code.*;

public class LogAxis extends Axis<LogAxis>
{
    private Integer logLabelBase;
    private Boolean logPositive;
    
    public LogAxis() {
        this.type(AxisType.log);
    }
    
    public LogAxis logLabelBase(final Integer logLabelBase) {
        this.logLabelBase = logLabelBase;
        return this;
    }
    
    public Integer logLabelBase() {
        return this.logLabelBase;
    }
    
    public LogAxis logPositive(final Boolean logPositive) {
        this.logPositive = logPositive;
        return this;
    }
    
    public Boolean logPositive() {
        return this.logPositive;
    }
    
    public Integer getLogLabelBase() {
        return this.logLabelBase;
    }
    
    public void setLogLabelBase(final Integer logLabelBase) {
        this.logLabelBase = logLabelBase;
    }
    
    public Boolean getLogPositive() {
        return this.logPositive;
    }
    
    public void setLogPositive(final Boolean logPositive) {
        this.logPositive = logPositive;
    }
}
