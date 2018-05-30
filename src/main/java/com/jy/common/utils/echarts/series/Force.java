package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.series.force.*;
import java.util.*;
import com.jy.common.utils.echarts.code.*;

public class Force extends Series<Force>
{
    private List<Category> categories;
    private List<Node> nodes;
    private List<Link> links;
    private Object center;
    private Object size;
    private Boolean preventOverlap;
    private Object coolDown;
    private Boolean ratioScaling;
    private Integer minRadius;
    private Integer maxRadius;
    private Object linkSymbol;
    private Integer linkSymbolSize;
    private Double scaling;
    private Double gravity;
    private Boolean draggable;
    private Boolean large;
    private Boolean useWorker;
    private Integer steps;
    private Object roam;
    
    public Force() {
        this.type(SeriesType.force);
    }
    
    public Force(final String name) {
        super(name);
        this.type(SeriesType.force);
    }
    
    public Object coolDown() {
        return this.coolDown;
    }
    
    public Force coolDown(final Object coolDown) {
        this.coolDown = coolDown;
        return this;
    }
    
    public Boolean ratioScaling() {
        return this.ratioScaling;
    }
    
    public Force ratioScaling(final Boolean ratioScaling) {
        this.ratioScaling = ratioScaling;
        return this;
    }
    
    public Boolean preventOverlap() {
        return this.preventOverlap;
    }
    
    public Force preventOverlap(final Boolean preventOverlap) {
        this.preventOverlap = preventOverlap;
        return this;
    }
    
    public Force categories(final List<Category> categories) {
        this.categories = categories;
        return this;
    }
    
    public Force nodes(final List<Node> nodes) {
        this.nodes = nodes;
        return this;
    }
    
    public Force links(final List<Link> links) {
        this.links = links;
        return this;
    }
    
    public List<Category> categories() {
        if (this.categories == null) {
            this.categories = new ArrayList<Category>();
        }
        return this.categories;
    }
    
    public Force categories(final Category... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.categories().addAll(Arrays.asList(values));
        return this;
    }
    
    public Force categories(final String... names) {
        if (names == null || names.length == 0) {
            return this;
        }
        for (final String name : names) {
            this.categories().add(new Category(name));
        }
        return this;
    }
    
    public Force categories(final Object... values) {
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
    
    public Force nodes(final Node... values) {
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
    
    public Force links(final Link... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.links().addAll(Arrays.asList(values));
        return this;
    }
    
    public Object center() {
        return this.center;
    }
    
    public Force center(final Object center) {
        this.center = center;
        return this;
    }
    
    public Object size() {
        return this.size;
    }
    
    public Force size(final Object size) {
        this.size = size;
        return this;
    }
    
    public Integer minRadius() {
        return this.minRadius;
    }
    
    public Force minRadius(final Integer minRadius) {
        this.minRadius = minRadius;
        return this;
    }
    
    public Integer maxRadius() {
        return this.maxRadius;
    }
    
    public Force maxRadius(final Integer maxRadius) {
        this.maxRadius = maxRadius;
        return this;
    }
    
    public Object linkSymbol() {
        return this.linkSymbol;
    }
    
    public Force linkSymbol(final Symbol linkSymbol) {
        this.linkSymbol = linkSymbol;
        return this;
    }
    
    public Force linkSymbol(final String linkSymbol) {
        this.linkSymbol = linkSymbol;
        return this;
    }
    
    public Integer linkSymbolSize() {
        return this.linkSymbolSize;
    }
    
    public Force linkSymbolSize(final Integer linkSymbolSize) {
        this.linkSymbolSize = linkSymbolSize;
        return this;
    }
    
    public Double scaling() {
        return this.scaling;
    }
    
    public Force scaling(final Double scaling) {
        this.scaling = scaling;
        return this;
    }
    
    public Double gravity() {
        return this.gravity;
    }
    
    public Force gravity(final Double gravity) {
        this.gravity = gravity;
        return this;
    }
    
    public Boolean draggable() {
        return this.draggable;
    }
    
    public Force draggable(final Boolean draggable) {
        this.draggable = draggable;
        return this;
    }
    
    public Boolean large() {
        return this.large;
    }
    
    public Force large(final Boolean large) {
        this.large = large;
        return this;
    }
    
    public Boolean useWorker() {
        return this.useWorker;
    }
    
    public Force useWorker(final Boolean useWorker) {
        this.useWorker = useWorker;
        return this;
    }
    
    public Integer steps() {
        return this.steps;
    }
    
    public Force steps(final Integer steps) {
        this.steps = steps;
        return this;
    }
    
    public Object roam() {
        return this.roam;
    }
    
    public Force roam(final Boolean roam) {
        this.roam = roam;
        return this;
    }
    
    public Force roam(final Roam roam) {
        this.roam = roam;
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
    
    public Object getCenter() {
        return this.center;
    }
    
    public void setCenter(final Object center) {
        this.center = center;
    }
    
    public Object getSize() {
        return this.size;
    }
    
    public void setSize(final Object size) {
        this.size = size;
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
    
    public Object getLinkSymbol() {
        return this.linkSymbol;
    }
    
    public void setLinkSymbol(final Object linkSymbol) {
        this.linkSymbol = linkSymbol;
    }
    
    public Integer getLinkSymbolSize() {
        return this.linkSymbolSize;
    }
    
    public void setLinkSymbolSize(final Integer linkSymbolSize) {
        this.linkSymbolSize = linkSymbolSize;
    }
    
    public Double getScaling() {
        return this.scaling;
    }
    
    public void setScaling(final Double scaling) {
        this.scaling = scaling;
    }
    
    public Double getGravity() {
        return this.gravity;
    }
    
    public void setGravity(final Double gravity) {
        this.gravity = gravity;
    }
    
    public Boolean getDraggable() {
        return this.draggable;
    }
    
    public void setDraggable(final Boolean draggable) {
        this.draggable = draggable;
    }
    
    public Boolean getLarge() {
        return this.large;
    }
    
    public void setLarge(final Boolean large) {
        this.large = large;
    }
    
    public Boolean getUseWorker() {
        return this.useWorker;
    }
    
    public void setUseWorker(final Boolean useWorker) {
        this.useWorker = useWorker;
    }
    
    public Integer getSteps() {
        return this.steps;
    }
    
    public void setSteps(final Integer steps) {
        this.steps = steps;
    }
    
    public Object getCoolDown() {
        return this.coolDown;
    }
    
    public void setCoolDown(final Object coolDown) {
        this.coolDown = coolDown;
    }
    
    public Boolean getRatioScaling() {
        return this.ratioScaling;
    }
    
    public void setRatioScaling(final Boolean ratioScaling) {
        this.ratioScaling = ratioScaling;
    }
    
    public Boolean getPreventOverlap() {
        return this.preventOverlap;
    }
    
    public void setPreventOverlap(final Boolean preventOverlap) {
        this.preventOverlap = preventOverlap;
    }
    
    public Object getRoam() {
        return this.roam;
    }
    
    public void setRoam(final Object roam) {
        this.roam = roam;
    }
}
