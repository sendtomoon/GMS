package com.jy.common.utils.echarts.series.event;

import java.io.*;
import java.util.*;

public class Event implements Serializable
{
    private static final long serialVersionUID = 2936961594659788171L;
    private String name;
    private Integer weight;
    private List<Evolution> evolution;
    
    public Event() {
    }
    
    public Event(final String name) {
        this.name = name;
    }
    
    public Event(final String name, final Integer weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String name() {
        return this.name;
    }
    
    public Event name(final String name) {
        this.name = name;
        return this;
    }
    
    public Integer weight() {
        return this.weight;
    }
    
    public Event weight(final Integer weight) {
        this.weight = weight;
        return this;
    }
    
    public List<Evolution> evolution() {
        if (this.evolution == null) {
            this.evolution = new ArrayList<Evolution>();
        }
        return this.evolution;
    }
    
    public Event evolution(final List<Evolution> evolution) {
        this.evolution = evolution;
        return this;
    }
    
    public Event evolution(final Evolution... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.evolution().addAll(Arrays.asList(values));
        return this;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public Integer getWeight() {
        return this.weight;
    }
    
    public void setWeight(final Integer weight) {
        this.weight = weight;
    }
    
    public List<Evolution> getEvolution() {
        return this.evolution;
    }
    
    public void setEvolution(final List<Evolution> evolution) {
        this.evolution = evolution;
    }
}
