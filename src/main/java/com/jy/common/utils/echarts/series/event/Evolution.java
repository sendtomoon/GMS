package com.jy.common.utils.echarts.series.event;

import java.io.*;
import java.text.*;
import java.util.*;

public class Evolution implements Serializable
{
    private static final long serialVersionUID = -3014023133802074740L;
    private static final SimpleDateFormat FORMAT;
    private String time;
    private Integer value;
    private Detail detail;
    
    static {
        FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    }
    
    public Evolution() {
    }
    
    public Evolution(final String time, final Integer value) {
        this.time = time;
        this.value = value;
    }
    
    public String time() {
        return this.time;
    }
    
    public Evolution time(final String time) {
        this.time = time;
        return this;
    }
    
    public Evolution time(final Date time) {
        this.time = Evolution.FORMAT.format(time);
        return this;
    }
    
    public Integer value() {
        return this.value;
    }
    
    public Evolution value(final Integer value) {
        this.value = value;
        return this;
    }
    
    public Detail detail() {
        return this.detail;
    }
    
    public Evolution detail(final Detail detail) {
        this.detail = detail;
        return this;
    }
    
    public Evolution detail(final String link, final String text) {
        this.detail = new Detail(link, text);
        return this;
    }
    
    public Evolution detail(final String link, final String text, final String img) {
        this.detail = new Detail(link, text, img);
        return this;
    }
    
    public String getTime() {
        return this.time;
    }
    
    public void setTime(final String time) {
        this.time = time;
    }
    
    public Integer getValue() {
        return this.value;
    }
    
    public void setValue(final Integer value) {
        this.value = value;
    }
    
    public Detail getDetail() {
        return this.detail;
    }
    
    public void setDetail(final Detail detail) {
        this.detail = detail;
    }
}
