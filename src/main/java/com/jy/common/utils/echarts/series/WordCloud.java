package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.code.*;
import java.util.*;
import java.io.*;

public class WordCloud extends Series<WordCloud>
{
    private Object[] center;
    private Object[] size;
    private List<Integer> textRotation;
    private AutoSize autoSize;
    private Integer textPadding;
    
    public WordCloud() {
        this.type(SeriesType.wordCloud);
    }
    
    public WordCloud(final String name) {
        super(name);
        this.type(SeriesType.wordCloud);
    }
    
    public WordCloud textPadding(final Integer textPadding) {
        this.textPadding = textPadding;
        return this;
    }
    
    public Integer textPadding() {
        return this.textPadding;
    }
    
    public WordCloud center(final Object val1, final Object val2) {
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
    
    public WordCloud size(final Object val1, final Object val2) {
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
    
    public WordCloud textRotation(final Integer... textRotation) {
        if (textRotation == null || textRotation.length == 0) {
            return this;
        }
        this.textRotation().addAll(Arrays.asList(textRotation));
        return this;
    }
    
    public List<Integer> textRotation() {
        if (this.textRotation == null) {
            this.textRotation = new LinkedList<Integer>();
        }
        return this.textRotation;
    }
    
    public WordCloud autoSize(final AutoSize autoSize) {
        this.autoSize = autoSize;
        return this;
    }
    
    public AutoSize autoSize() {
        if (this.autoSize == null) {
            this.autoSize = new AutoSize();
        }
        return this.autoSize;
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
    
    public List<Integer> getTextRotation() {
        return this.textRotation;
    }
    
    public void setTextRotation(final List<Integer> textRotation) {
        this.textRotation = textRotation;
    }
    
    public AutoSize getAutoSize() {
        return this.autoSize;
    }
    
    public void setAutoSize(final AutoSize autoSize) {
        this.autoSize = autoSize;
    }
    
    public Integer getTextPadding() {
        return this.textPadding;
    }
    
    public void setTextPadding(final Integer textPadding) {
        this.textPadding = textPadding;
    }
    
    public static class AutoSize implements Serializable
    {
        private static final long serialVersionUID = 1L;
        private Boolean enable;
        private Integer minSize;
        
        public AutoSize() {
        }
        
        public AutoSize(final Boolean enable, final Integer minSize) {
            this.enable = enable;
            this.minSize = minSize;
        }
        
        public AutoSize enable(final Boolean enable) {
            this.enable = enable;
            return this;
        }
        
        public Boolean enable() {
            return this.enable;
        }
        
        public AutoSize minSize(final Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        
        public Integer minSize() {
            return this.minSize;
        }
        
        public Boolean getEnable() {
            return this.enable;
        }
        
        public void setEnable(final Boolean enable) {
            this.enable = enable;
        }
        
        public Integer getMinSize() {
            return this.minSize;
        }
        
        public void setMinSize(final Integer minSize) {
            this.minSize = minSize;
        }
    }
}
