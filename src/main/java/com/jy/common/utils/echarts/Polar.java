package com.jy.common.utils.echarts;

import com.jy.common.utils.echarts.axis.*;
import com.jy.common.utils.echarts.code.*;
import java.util.*;
import com.jy.common.utils.echarts.style.*;

public class Polar extends AbstractData<Polar> implements Component
{
    private Object[] center;
    private Object radius;
    private Integer startAngle;
    private Integer splitNumber;
    private Name name;
    private Object[] boundaryGap;
    private Boolean scale;
    private Integer precision;
    private Integer power;
    private AxisLine axisLine;
    private AxisLabel axisLabel;
    private SplitArea splitArea;
    private SplitLine splitLine;
    private PolarType type;
    private List<Object> indicator;
    private Integer zlevel;
    private Integer z;
    
    public Polar zlevel(final Integer zlevel) {
        this.zlevel = zlevel;
        return this;
    }
    
    public Integer zlevel() {
        return this.zlevel;
    }
    
    public Polar z(final Integer z) {
        this.z = z;
        return this;
    }
    
    public Integer z() {
        return this.z;
    }
    
    public Object[] center() {
        return this.center;
    }
    
    public Polar center(final Object[] center) {
        this.center = center;
        return this;
    }
    
    public Polar indicator(final Object... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.indicator().addAll(Arrays.asList(values));
        return this;
    }
    
    public Object radius() {
        return this.radius;
    }
    
    public Polar name(final Name name) {
        this.name = name;
        return this;
    }
    
    public Object[] boundaryGap() {
        return this.boundaryGap;
    }
    
    public Polar boundaryGap(final Object[] boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }
    
    public Polar axisLine(final AxisLine axisLine) {
        this.axisLine = axisLine;
        return this;
    }
    
    public Polar axisLabel(final AxisLabel axisLabel) {
        this.axisLabel = axisLabel;
        return this;
    }
    
    public Polar splitArea(final SplitArea splitArea) {
        this.splitArea = splitArea;
        return this;
    }
    
    public Polar splitLine(final SplitLine splitLine) {
        this.splitLine = splitLine;
        return this;
    }
    
    public Polar indicator(final List<Object> indicator) {
        this.indicator = indicator;
        return this;
    }
    
    public Polar center(final Object width, final Object height) {
        this.center = new Object[] { width, height };
        return this;
    }
    
    public Polar radius(final Object value) {
        this.radius = value;
        return this;
    }
    
    public Polar radius(final Object width, final Object height) {
        this.radius = new Object[] { width, height };
        return this;
    }
    
    public Integer startAngle() {
        return this.startAngle;
    }
    
    public Polar startAngle(final Integer startAngle) {
        this.startAngle = startAngle;
        return this;
    }
    
    public Integer splitNumber() {
        return this.splitNumber;
    }
    
    public Polar splitNumber(final Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }
    
    public Name name() {
        if (this.name == null) {
            this.name = new Name();
        }
        return this.name;
    }
    
    public Polar boundaryGap(final Object min, final Object max) {
        this.boundaryGap = new Object[] { min, max };
        return this;
    }
    
    public Boolean scale() {
        return this.scale;
    }
    
    public Polar scale(final Boolean scale) {
        this.scale = scale;
        return this;
    }
    
    public Integer precision() {
        return this.precision;
    }
    
    public Polar precision(final Integer precision) {
        this.precision = precision;
        return this;
    }
    
    public Integer power() {
        return this.power;
    }
    
    public Polar power(final Integer power) {
        this.power = power;
        return this;
    }
    
    public AxisLine axisLine() {
        if (this.axisLine == null) {
            this.axisLine = new AxisLine();
        }
        return this.axisLine;
    }
    
    public AxisLabel axisLabel() {
        if (this.axisLabel == null) {
            this.axisLabel = new AxisLabel();
        }
        return this.axisLabel;
    }
    
    public SplitArea splitArea() {
        if (this.splitArea == null) {
            this.splitArea = new SplitArea();
        }
        return this.splitArea;
    }
    
    public SplitLine splitLine() {
        if (this.splitLine == null) {
            this.splitLine = new SplitLine();
        }
        return this.splitLine;
    }
    
    public PolarType type() {
        return this.type;
    }
    
    public Polar type(final PolarType type) {
        this.type = type;
        return this;
    }
    
    public List<Object> indicator() {
        if (this.indicator == null) {
            this.indicator = new ArrayList<Object>();
        }
        return this.indicator;
    }
    
    public Name getName() {
        return this.name;
    }
    
    public void setName(final Name name) {
        this.name = name;
    }
    
    public Object[] getBoundaryGap() {
        return this.boundaryGap;
    }
    
    public void setBoundaryGap(final Object[] boundaryGap) {
        this.boundaryGap = boundaryGap;
    }
    
    public AxisLine getAxisLine() {
        return this.axisLine;
    }
    
    public void setAxisLine(final AxisLine axisLine) {
        this.axisLine = axisLine;
    }
    
    public AxisLabel getAxisLabel() {
        return this.axisLabel;
    }
    
    public void setAxisLabel(final AxisLabel axisLabel) {
        this.axisLabel = axisLabel;
    }
    
    public SplitArea getSplitArea() {
        return this.splitArea;
    }
    
    public void setSplitArea(final SplitArea splitArea) {
        this.splitArea = splitArea;
    }
    
    public SplitLine getSplitLine() {
        return this.splitLine;
    }
    
    public void setSplitLine(final SplitLine splitLine) {
        this.splitLine = splitLine;
    }
    
    public List<Object> getIndicator() {
        return this.indicator;
    }
    
    public void setIndicator(final List<Object> indicator) {
        this.indicator = indicator;
    }
    
    public Object[] getCenter() {
        return this.center;
    }
    
    public void setCenter(final Object[] center) {
        this.center = center;
    }
    
    public Object getRadius() {
        return this.radius;
    }
    
    public void setRadius(final Object radius) {
        this.radius = radius;
    }
    
    public Integer getStartAngle() {
        return this.startAngle;
    }
    
    public void setStartAngle(final Integer startAngle) {
        this.startAngle = startAngle;
    }
    
    public Integer getSplitNumber() {
        return this.splitNumber;
    }
    
    public void setSplitNumber(final Integer splitNumber) {
        this.splitNumber = splitNumber;
    }
    
    public Boolean getScale() {
        return this.scale;
    }
    
    public void setScale(final Boolean scale) {
        this.scale = scale;
    }
    
    public Integer getPrecision() {
        return this.precision;
    }
    
    public void setPrecision(final Integer precision) {
        this.precision = precision;
    }
    
    public Integer getPower() {
        return this.power;
    }
    
    public void setPower(final Integer power) {
        this.power = power;
    }
    
    public PolarType getType() {
        return this.type;
    }
    
    public void setType(final PolarType type) {
        this.type = type;
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
    
    public static class Name
    {
        private Boolean show;
        private TextStyle textStyle;
        
        public Name() {
            this.show(true);
            this.textStyle(new TextStyle());
            this.textStyle.color("#333");
        }
        
        public Boolean show() {
            return this.show;
        }
        
        public Name show(final Boolean show) {
            this.show = show;
            return this;
        }
        
        public TextStyle textStyle() {
            if (this.textStyle == null) {
                this.textStyle = new TextStyle();
            }
            return this.textStyle;
        }
        
        public Name textStyle(final TextStyle textStyle) {
            this.textStyle = textStyle;
            return this;
        }
        
        public Boolean getShow() {
            return this.show;
        }
        
        public void setShow(final Boolean show) {
            this.show = show;
        }
        
        public TextStyle getTextStyle() {
            return this.textStyle;
        }
        
        public void setTextStyle(final TextStyle textStyle) {
            this.textStyle = textStyle;
        }
    }
}
