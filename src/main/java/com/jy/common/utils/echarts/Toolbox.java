package com.jy.common.utils.echarts;

import com.jy.common.utils.echarts.feature.*;
import java.util.*;
import com.jy.common.utils.echarts.code.*;

public class Toolbox extends Basic<Toolbox> implements Component
{
    private Map<String, Feature> feature;
    private Orient orient;
    private List<Object> color;
    private String disableColor;
    private String effectiveColor;
    private Integer itemSize;
    private Boolean showTitle;
    
    public Toolbox color(final List<Object> color) {
        this.color = color;
        return this;
    }
    
    public Orient orient() {
        return this.orient;
    }
    
    public Toolbox orient(final Orient orient) {
        this.orient = orient;
        return this;
    }
    
    public List<Object> color() {
        if (this.color == null) {
            this.color = new ArrayList<Object>();
        }
        return this.color;
    }
    
    public String disableColor() {
        return this.disableColor;
    }
    
    public Toolbox disableColor(final String disableColor) {
        this.disableColor = disableColor;
        return this;
    }
    
    public String effectiveColor() {
        return this.effectiveColor;
    }
    
    public Toolbox effectiveColor(final String effectiveColor) {
        this.effectiveColor = effectiveColor;
        return this;
    }
    
    public Integer itemSize() {
        return this.itemSize;
    }
    
    public Toolbox itemSize(final Integer itemSize) {
        this.itemSize = itemSize;
        return this;
    }
    
    public Boolean showTitle() {
        return this.showTitle;
    }
    
    public Toolbox showTitle(final Boolean showTitle) {
        this.showTitle = showTitle;
        return this;
    }
    
    public Map<String, Feature> feature() {
        if (this.feature == null) {
            this.feature = new LinkedHashMap<String, Feature>();
        }
        return this.feature;
    }
    
    private Toolbox _addFeature(final Feature value) {
        if (value == null) {
            return this;
        }
        String name = value.getClass().getSimpleName();
        name = String.valueOf(name.substring(0, 1).toLowerCase()) + name.substring(1);
        this._addFeatureOnce(name, value);
        return this;
    }
    
    public Toolbox feature(final Object... values) {
        if (values == null && values.length == 0) {
            return this;
        }
        if (this.feature == null) {
            this.feature = new LinkedHashMap<String, Feature>();
        }
        for (final Object t : values) {
            if (t instanceof Feature) {
                this._addFeature((Feature)t);
            }
            else if (t instanceof Tool) {
                switch ((Tool)t) {
                    case dataView: {
                        this._addFeatureOnce(t, Feature.dataView);
                        break;
                    }
                    case dataZoom: {
                        this._addFeatureOnce(t, Feature.dataZoom);
                        break;
                    }
                    case magicType: {
                        this._addFeatureOnce(t, Feature.magicType);
                        break;
                    }
                    case mark: {
                        this._addFeatureOnce(t, Feature.mark);
                        break;
                    }
                    case restore: {
                        this._addFeatureOnce(t, Feature.restore);
                        break;
                    }
                    case saveAsImage: {
                        this._addFeatureOnce(t, Feature.saveAsImage);
                        break;
                    }
                }
            }
        }
        return this;
    }
    
    private void _addFeatureOnce(final Object name, final Feature feature) {
        final String _name = String.valueOf(name);
        if (!this.feature().containsKey(_name)) {
            this.feature().put(_name, feature);
        }
    }
    
    public List<Object> getColor() {
        return this.color;
    }
    
    public void setColor(final List<Object> color) {
        this.color = color;
    }
    
    public Map<String, Feature> getFeature() {
        return this.feature;
    }
    
    public void setFeature(final Map<String, Feature> feature) {
        this.feature = feature;
    }
    
    public Orient getOrient() {
        return this.orient;
    }
    
    public void setOrient(final Orient orient) {
        this.orient = orient;
    }
    
    public String getDisableColor() {
        return this.disableColor;
    }
    
    public void setDisableColor(final String disableColor) {
        this.disableColor = disableColor;
    }
    
    public String getEffectiveColor() {
        return this.effectiveColor;
    }
    
    public void setEffectiveColor(final String effectiveColor) {
        this.effectiveColor = effectiveColor;
    }
    
    public Integer getItemSize() {
        return this.itemSize;
    }
    
    public void setItemSize(final Integer itemSize) {
        this.itemSize = itemSize;
    }
    
    public Boolean getShowTitle() {
        return this.showTitle;
    }
    
    public void setShowTitle(final Boolean showTitle) {
        this.showTitle = showTitle;
    }
}
