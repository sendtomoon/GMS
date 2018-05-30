package com.jy.common.utils.echarts.series.event;

import java.io.*;

public class Detail implements Serializable
{
    private static final long serialVersionUID = 680903438457621422L;
    private String link;
    private String text;
    private String img;
    
    public Detail() {
    }
    
    public Detail(final String link, final String text) {
        this.link = link;
        this.text = text;
    }
    
    public Detail(final String link, final String text, final String img) {
        this.link = link;
        this.text = text;
        this.img = img;
    }
    
    public String link() {
        return this.link;
    }
    
    public Detail link(final String link) {
        this.link = link;
        return this;
    }
    
    public String text() {
        return this.text;
    }
    
    public Detail text(final String text) {
        this.text = text;
        return this;
    }
    
    public String img() {
        return this.img;
    }
    
    public Detail img(final String img) {
        this.img = img;
        return this;
    }
    
    public String getLink() {
        return this.link;
    }
    
    public void setLink(final String link) {
        this.link = link;
    }
    
    public String getText() {
        return this.text;
    }
    
    public void setText(final String text) {
        this.text = text;
    }
    
    public String getImg() {
        return this.img;
    }
    
    public void setImg(final String img) {
        this.img = img;
    }
}
