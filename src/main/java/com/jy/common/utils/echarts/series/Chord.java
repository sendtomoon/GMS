package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.series.force.*;
import com.jy.common.utils.echarts.code.*;
import java.util.*;

public class Chord extends Series<Chord>
{
    private List<Category> categories;
    private List<Node> nodes;
    private List<Link> links;
    private Boolean ribbonType;
    private Integer padding;
    private Object radius;
    private Integer startAngle;
    private Sort sort;
    private Sort sortSub;
    private Boolean showScale;
    private Boolean showScaleText;
    private Boolean clockWise;
    private Integer minRadius;
    private Integer maxRadius;
    private Object[][] matrix;
    
    public Chord() {
        this.type(SeriesType.chord);
    }
    
    public Chord(final String name) {
        super(name);
        this.type(SeriesType.chord);
    }
    
    public Chord categories(final List<Category> categories) {
        this.categories = categories;
        return this;
    }
    
    public Chord nodes(final List<Node> nodes) {
        this.nodes = nodes;
        return this;
    }
    
    public Chord links(final List<Link> links) {
        this.links = links;
        return this;
    }
    
    public List<Category> categories() {
        if (this.categories == null) {
            this.categories = new ArrayList<Category>();
        }
        return this.categories;
    }
    
    public Chord categories(final Category... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.categories().addAll(Arrays.asList(values));
        return this;
    }
    
    public Chord categories(final String... names) {
        if (names == null || names.length == 0) {
            return this;
        }
        for (final String name : names) {
            this.categories().add(new Category(name));
        }
        return this;
    }
    
    public Chord categories(final Object... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        for (final Object value : values) {
            if (value instanceof String) {
                this.categories().add(new Category((String)value));
            }
            else if (value instanceof Category) {
                this.categories().add((Category)value);
            }
        }
        return this;
    }
    
    public List<Node> nodes() {
        if (this.nodes == null) {
            this.nodes = new ArrayList<Node>();
        }
        return this.nodes;
    }
    
    public Chord nodes(final Node... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.nodes().addAll(Arrays.asList(values));
        return this;
    }
    
    public List<Link> links() {
        if (this.links == null) {
            this.links = new ArrayList<Link>();
        }
        return this.links;
    }
    
    public Chord links(final Link... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.links().addAll(Arrays.asList(values));
        return this;
    }
    
    public Boolean ribbonType() {
        return this.ribbonType;
    }
    
    public Chord ribbonType(final Boolean ribbonType) {
        this.ribbonType = ribbonType;
        return this;
    }
    
    public Integer padding() {
        return this.padding;
    }
    
    public Chord padding(final Integer padding) {
        this.padding = padding;
        return this;
    }
    
    public Object radius() {
        return this.radius;
    }
    
    public Chord radius(final Object value) {
        this.radius = value;
        return this;
    }
    
    public Chord radius(final Object width, final Object height) {
        this.radius = new Object[] { width, height };
        return this;
    }
    
    public Integer startAngle() {
        return this.startAngle;
    }
    
    public Chord startAngle(final Integer startAngle) {
        this.startAngle = startAngle;
        return this;
    }
    
    public Sort sort() {
        return this.sort;
    }
    
    public Chord sort(final Sort sort) {
        this.sort = sort;
        return this;
    }
    
    public Sort sortSub() {
        return this.sortSub;
    }
    
    public Chord sortSub(final Sort sortSub) {
        this.sortSub = sortSub;
        return this;
    }
    
    public Boolean showScale() {
        return this.showScale;
    }
    
    public Chord showScale(final Boolean showScale) {
        this.showScale = showScale;
        return this;
    }
    
    public Boolean showScaleText() {
        return this.showScaleText;
    }
    
    public Chord showScaleText(final Boolean showScaleText) {
        this.showScaleText = showScaleText;
        return this;
    }
    
    public Boolean clockWise() {
        return this.clockWise;
    }
    
    public Chord clockWise(final Boolean clockWise) {
        this.clockWise = clockWise;
        return this;
    }
    
    public Integer minRadius() {
        return this.minRadius;
    }
    
    public Chord minRadius(final Integer minRadius) {
        this.minRadius = minRadius;
        return this;
    }
    
    public Integer maxRadius() {
        return this.maxRadius;
    }
    
    public Chord maxRadius(final Integer maxRadius) {
        this.maxRadius = maxRadius;
        return this;
    }
    
    public Object[][] matrix() {
        return this.matrix;
    }
    
    public Chord matrix(final Object[][] matrix) {
        this.matrix = matrix;
        return this;
    }
    
    public List<Category> getCategories() {
        return this.categories;
    }
    
    public void setCategories(final List<Category> categories) {
        this.categories = categories;
    }
    
    public List<Node> getNodes() {
        return this.nodes;
    }
    
    public void setNodes(final List<Node> nodes) {
        this.nodes = nodes;
    }
    
    public List<Link> getLinks() {
        return this.links;
    }
    
    public void setLinks(final List<Link> links) {
        this.links = links;
    }
    
    public Boolean getRibbonType() {
        return this.ribbonType;
    }
    
    public void setRibbonType(final Boolean ribbonType) {
        this.ribbonType = ribbonType;
    }
    
    public Integer getPadding() {
        return this.padding;
    }
    
    public void setPadding(final Integer padding) {
        this.padding = padding;
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
    
    public Sort getSort() {
        return this.sort;
    }
    
    public void setSort(final Sort sort) {
        this.sort = sort;
    }
    
    public Sort getSortSub() {
        return this.sortSub;
    }
    
    public void setSortSub(final Sort sortSub) {
        this.sortSub = sortSub;
    }
    
    public Boolean getShowScale() {
        return this.showScale;
    }
    
    public void setShowScale(final Boolean showScale) {
        this.showScale = showScale;
    }
    
    public Boolean getShowScaleText() {
        return this.showScaleText;
    }
    
    public void setShowScaleText(final Boolean showScaleText) {
        this.showScaleText = showScaleText;
    }
    
    public Boolean getClockWise() {
        return this.clockWise;
    }
    
    public void setClockWise(final Boolean clockWise) {
        this.clockWise = clockWise;
    }
    
    public Object[][] getMatrix() {
        return this.matrix;
    }
    
    public void setMatrix(final Object[][] matrix) {
        this.matrix = matrix;
    }
    
    public Integer getMinRadius() {
        return this.minRadius;
    }
    
    public void setMinRadius(final Integer minRadius) {
        this.minRadius = minRadius;
    }
    
    public Integer getMaxRadius() {
        return this.maxRadius;
    }
    
    public void setMaxRadius(final Integer maxRadius) {
        this.maxRadius = maxRadius;
    }
}
