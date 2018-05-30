package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.code.*;

public class Treemap extends Series<Treemap>
{
    private Object[] center;
    private Object[] size;
    private String root;
    
    public Treemap() {
        this.type(SeriesType.treemap);
    }
    
    public Treemap(final String name) {
        super(name);
        this.type(SeriesType.treemap);
    }
    
    public Treemap center(final Object val1, final Object val2) {
        (this.center = new Object[2])[0] = val1;
        this.center[1] = val2;
        return this;
    }
    
    public Object[] center() {
        if (this.center == null) {
            this.center = new Object[2];
        }
        return this.center;
    }
    
    public Treemap size(final Object val1, final Object val2) {
        (this.size = new Object[2])[0] = val1;
        this.size[1] = val2;
        return this;
    }
    
    public Object[] size() {
        if (this.size == null) {
            this.size = new Object[2];
        }
        return this.size;
    }
    
    public Treemap root(final String root) {
        this.root = root;
        return this;
    }
    
    public String root() {
        return this.root;
    }
    
    public Object[] getCenter() {
        return this.center;
    }
    
    public void setCenter(final Object[] center) {
        this.center = center;
    }
    
    public Object[] getSize() {
        return this.size;
    }
    
    public void setSize(final Object[] size) {
        this.size = size;
    }
    
    public String getRoot() {
        return this.root;
    }
    
    public void setRoot(final String root) {
        this.root = root;
    }
}
