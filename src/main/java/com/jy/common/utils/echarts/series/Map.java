package com.jy.common.utils.echarts.series;

import com.jy.common.utils.echarts.code.*;

public class Map extends Series<Map>
{
    private Object selectedMode;
    private String mapType;
    private MapLocation mapLocation;
    private Calculation mapValueCalculation;
    private Integer mapValuePrecision;
    private Boolean showLegendSymbol;
    private Boolean dataRangeHoverLink;
    private Boolean roam;
    private ScaleLimit scaleLimit;
    private Object nameMap;
    private Object textFixed;
    private GeoCoord geoCoord;
    
    public Map() {
        this.type(SeriesType.map);
    }
    
    public Map(final String name) {
        super(name);
        this.type(SeriesType.map);
    }
    
    public Map mapLocation(final MapLocation mapLocation) {
        this.mapLocation = mapLocation;
        return this;
    }
    
    public Object selectedMode() {
        return this.selectedMode;
    }
    
    public Map selectedMode(final Object selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }
    
    public Map selectedMode(final SelectedMode selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }
    
    public String mapType() {
        return this.mapType;
    }
    
    public Map mapType(final String mapType) {
        this.mapType = mapType;
        return this;
    }
    
    public MapLocation mapLocation() {
        if (this.mapLocation == null) {
            this.mapLocation = new MapLocation();
        }
        return this.mapLocation;
    }
    
    public Calculation mapValueCalculation() {
        return this.mapValueCalculation;
    }
    
    public Map mapValueCalculation(final Calculation mapValueCalculation) {
        this.mapValueCalculation = mapValueCalculation;
        return this;
    }
    
    public Integer mapValuePrecision() {
        return this.mapValuePrecision;
    }
    
    public Map mapValuePrecision(final Integer mapValuePrecision) {
        this.mapValuePrecision = mapValuePrecision;
        return this;
    }
    
    public Boolean showLegendSymbol() {
        return this.showLegendSymbol;
    }
    
    public Map showLegendSymbol(final Boolean showLegendSymbol) {
        this.showLegendSymbol = showLegendSymbol;
        return this;
    }
    
    public Boolean dataRangeHoverLink() {
        return this.dataRangeHoverLink;
    }
    
    public Map dataRangeHoverLink(final Boolean dataRangeHoverLink) {
        this.dataRangeHoverLink = dataRangeHoverLink;
        return this;
    }
    
    public Boolean roam() {
        return this.roam;
    }
    
    public Map roam(final Boolean roam) {
        this.roam = roam;
        return this;
    }
    
    public ScaleLimit scaleLimit() {
        if (this.scaleLimit == null) {
            this.scaleLimit = new ScaleLimit();
        }
        return this.scaleLimit;
    }
    
    public Map scaleLimit(final ScaleLimit scaleLimit) {
        this.scaleLimit = scaleLimit;
        return this;
    }
    
    public Object nameMap() {
        return this.nameMap;
    }
    
    public Map nameMap(final Object nameMap) {
        this.nameMap = nameMap;
        return this;
    }
    
    public Object textFixed() {
        return this.textFixed;
    }
    
    public Map textFixed(final Object textFixed) {
        this.textFixed = textFixed;
        return this;
    }
    
    public GeoCoord geoCoord() {
        if (this.geoCoord == null) {
            this.geoCoord = new GeoCoord();
        }
        return this.geoCoord;
    }
    
    public Map geoCoord(final String name, final String x, final String y) {
        this.geoCoord().put(name, x, y);
        return this;
    }
    
    public Object getSelectedMode() {
        return this.selectedMode;
    }
    
    public void setSelectedMode(final Object selectedMode) {
        this.selectedMode = selectedMode;
    }
    
    public String getMapType() {
        return this.mapType;
    }
    
    public void setMapType(final String mapType) {
        this.mapType = mapType;
    }
    
    public MapLocation getMapLocation() {
        return this.mapLocation;
    }
    
    public void setMapLocation(final MapLocation mapLocation) {
        this.mapLocation = mapLocation;
    }
    
    public Calculation getMapValueCalculation() {
        return this.mapValueCalculation;
    }
    
    public void setMapValueCalculation(final Calculation mapValueCalculation) {
        this.mapValueCalculation = mapValueCalculation;
    }
    
    public Integer getMapValuePrecision() {
        return this.mapValuePrecision;
    }
    
    public void setMapValuePrecision(final Integer mapValuePrecision) {
        this.mapValuePrecision = mapValuePrecision;
    }
    
    public Boolean getShowLegendSymbol() {
        return this.showLegendSymbol;
    }
    
    public void setShowLegendSymbol(final Boolean showLegendSymbol) {
        this.showLegendSymbol = showLegendSymbol;
    }
    
    public Boolean getDataRangeHoverLink() {
        return this.dataRangeHoverLink;
    }
    
    public void setDataRangeHoverLink(final Boolean dataRangeHoverLink) {
        this.dataRangeHoverLink = dataRangeHoverLink;
    }
    
    public Boolean getRoam() {
        return this.roam;
    }
    
    public void setRoam(final Boolean roam) {
        this.roam = roam;
    }
    
    public ScaleLimit getScaleLimit() {
        return this.scaleLimit;
    }
    
    public void setScaleLimit(final ScaleLimit scaleLimit) {
        this.scaleLimit = scaleLimit;
    }
    
    public Object getNameMap() {
        return this.nameMap;
    }
    
    public void setNameMap(final Object nameMap) {
        this.nameMap = nameMap;
    }
    
    public Object getTextFixed() {
        return this.textFixed;
    }
    
    public void setTextFixed(final Object textFixed) {
        this.textFixed = textFixed;
    }
    
    public GeoCoord getGeoCoord() {
        return this.geoCoord;
    }
    
    public void setGeoCoord(final GeoCoord geoCoord) {
        this.geoCoord = geoCoord;
    }
}
