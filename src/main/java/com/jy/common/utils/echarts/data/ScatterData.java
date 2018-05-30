package com.jy.common.utils.echarts.data;

import java.io.*;
import java.util.*;

public class ScatterData implements Serializable
{
    private static final long serialVersionUID = 658151140767993468L;
    private List<Object> value;
    
    public ScatterData(final Object width, final Object height) {
        this.value(width, height);
    }
    
    public ScatterData(final Object width, final Object height, final Object size) {
        this.value(width, height, size);
    }
    
    public List<Object> value() {
        if (this.value == null) {
            this.value = new ArrayList<Object>();
        }
        return this.value;
    }
    
    private ScatterData value(final Object... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.value().addAll(Arrays.asList(values));
        return this;
    }
    
    public List<Object> getValue() {
        return this.value;
    }
    
    public void setValue(final List<Object> value) {
        this.value = value;
    }
}
