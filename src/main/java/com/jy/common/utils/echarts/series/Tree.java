package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.series.other.*;
import com.jy.common.utils.echarts.code.*;

public class Tree extends Series<Tree>
{
    private RootLocation rootLocation;
    private Integer layerPadding;
    private Integer nodePadding;
    private Orient orient;
    private Object roam;
    private Direction direction;
    
    public Tree() {
        this.type(SeriesType.tree);
    }
    
    public Tree(final String name) {
        super(name);
        this.type(SeriesType.tree);
    }
    
    public Direction direction() {
        return this.direction;
    }
    
    public Tree direction(final Direction direction) {
        this.direction = direction;
        return this;
    }
    
    public Tree rootLocation(final RootLocation rootLocation) {
        this.rootLocation = rootLocation;
        return this;
    }
    
    public RootLocation rootLocation() {
        if (this.rootLocation == null) {
            this.rootLocation = new RootLocation();
        }
        return this.rootLocation;
    }
    
    public Tree layerPadding(final Integer layerPadding) {
        this.layerPadding = layerPadding;
        return this;
    }
    
    public Integer layerPadding() {
        return this.layerPadding;
    }
    
    public Tree nodePadding(final Integer nodePadding) {
        this.nodePadding = nodePadding;
        return this;
    }
    
    public Integer nodePadding() {
        return this.nodePadding;
    }
    
    public Tree orient(final Orient orient) {
        this.orient = orient;
        return this;
    }
    
    public Orient orient() {
        return this.orient;
    }
    
    public Tree roam(final Boolean roam) {
        this.roam = roam;
        return this;
    }
    
    public Tree roam(final Roam roam) {
        this.roam = roam;
        return this;
    }
    
    public Object roam() {
        return this.roam;
    }
    
    public Integer getLayerPadding() {
        return this.layerPadding;
    }
    
    public void setLayerPadding(final Integer layerPadding) {
        this.layerPadding = layerPadding;
    }
    
    public Integer getNodePadding() {
        return this.nodePadding;
    }
    
    public void setNodePadding(final Integer nodePadding) {
        this.nodePadding = nodePadding;
    }
    
    public Orient getOrient() {
        return this.orient;
    }
    
    public void setOrient(final Orient orient) {
        this.orient = orient;
    }
    
    public Object getRoam() {
        return this.roam;
    }
    
    public void setRoam(final Object roam) {
        this.roam = roam;
    }
    
    public RootLocation getRootLocation() {
        return this.rootLocation;
    }
    
    public void setRootLocation(final RootLocation rootLocation) {
        this.rootLocation = rootLocation;
    }
    
    public Direction getDirection() {
        return this.direction;
    }
    
    public void setDirection(final Direction direction) {
        this.direction = direction;
    }
}
