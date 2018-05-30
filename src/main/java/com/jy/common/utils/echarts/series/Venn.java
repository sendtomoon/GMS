package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.code.*;

public class Venn extends Series<Venn>
{
    public Venn() {
        this.type(SeriesType.venn);
    }
    
    public Venn(final String name) {
        super(name);
        this.type(SeriesType.venn);
    }
}
