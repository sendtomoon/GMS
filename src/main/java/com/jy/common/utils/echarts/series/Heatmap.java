package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.code.*;
import java.util.*;

public class Heatmap extends Series<Heatmap>
{
    private Integer blurSize;
    private List<Object> gradientColors;
    private Double minAlpha;
    private Double valueScale;
    private Double opacity;
    
    public Heatmap() {
        this.type(SeriesType.heatmap);
    }
    
    public Heatmap(final String name) {
        super(name);
        this.type(SeriesType.heatmap);
    }
    
    public Integer blurSize() {
        return this.blurSize;
    }
    
    public Heatmap blurSize(final Integer blurSize) {
        this.blurSize = blurSize;
        return this;
    }
    
    public List<Object> gradientColors() {
        if (this.gradientColors == null) {
            this.gradientColors = new LinkedList<Object>();
        }
        return this.gradientColors;
    }
    
    public Heatmap gradientColors(final List<Object> gradientColors) {
        this.gradientColors = gradientColors;
        return this;
    }
    
    public Heatmap gradientColors(final Object... gradientColors) {
        if (gradientColors == null || gradientColors.length == 0) {
            return this;
        }
        this.gradientColors().addAll(Arrays.asList(gradientColors));
        return this;
    }
    
    public Double minAlpha() {
        return this.minAlpha;
    }
    
    public Heatmap minAlpha(final Double minAlpha) {
        this.minAlpha = minAlpha;
        return this;
    }
    
    public Double valueScale() {
        return this.valueScale;
    }
    
    public Heatmap valueScale(final Double valueScale) {
        this.valueScale = valueScale;
        return this;
    }
    
    public Double opacity() {
        return this.opacity;
    }
    
    public Heatmap opacity(final Double opacity) {
        this.opacity = opacity;
        return this;
    }
    
    public Integer getBlurSize() {
        return this.blurSize;
    }
    
    public void setBlurSize(final Integer blurSize) {
        this.blurSize = blurSize;
    }
    
    public List<Object> getGradientColors() {
        return this.gradientColors;
    }
    
    public void setGradientColors(final List<Object> gradientColors) {
        this.gradientColors = gradientColors;
    }
    
    public Double getMinAlpha() {
        return this.minAlpha;
    }
    
    public void setMinAlpha(final Double minAlpha) {
        this.minAlpha = minAlpha;
    }
    
    public Double getValueScale() {
        return this.valueScale;
    }
    
    public void setValueScale(final Double valueScale) {
        this.valueScale = valueScale;
    }
    
    public Double getOpacity() {
        return this.opacity;
    }
    
    public void setOpacity(final Double opacity) {
        this.opacity = opacity;
    }
}
