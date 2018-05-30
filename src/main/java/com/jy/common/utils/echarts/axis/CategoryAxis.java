package com.jy.common.utils.echarts.axis;

import com.jy.common.utils.echarts.code.*;

public class CategoryAxis extends Axis<CategoryAxis>
{
    private Boolean boundaryGap;
    
    public CategoryAxis() {
        this.type(AxisType.category);
    }
    
    public Boolean boundaryGap() {
        return this.boundaryGap;
    }
    
    public CategoryAxis boundaryGap(final Boolean boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }
    
    public Boolean getBoundaryGap() {
        return this.boundaryGap;
    }
    
    public void setBoundaryGap(final Boolean boundaryGap) {
        this.boundaryGap = boundaryGap;
    }
}
