package com.jy.common.utils.echarts.style;

import java.io.*;
import com.jy.common.utils.echarts.code.*;

public class LinkStyle implements Serializable
{
    private static final long serialVersionUID = -547421614869188616L;
    private LinkType type;
    private String borderColor;
    private Integer borderWidth;
    
    public LinkType type() {
        return this.type;
    }
    
    public LinkStyle type(final LinkType type) {
        this.type = type;
        return this;
    }
    
    public String borderColor() {
        return this.borderColor;
    }
    
    public LinkStyle borderColor(final String borderColor) {
        this.borderColor = borderColor;
        return this;
    }
    
    public Integer borderWidth() {
        return this.borderWidth;
    }
    
    public LinkStyle borderWidth(final Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }
    
    public LinkType getType() {
        return this.type;
    }
    
    public void setType(final LinkType type) {
        this.type = type;
    }
    
    public String getBorderColor() {
        return this.borderColor;
    }
    
    public void setBorderColor(final String borderColor) {
        this.borderColor = borderColor;
    }
    
    public Integer getBorderWidth() {
        return this.borderWidth;
    }
    
    public void setBorderWidth(final Integer borderWidth) {
        this.borderWidth = borderWidth;
    }
}
