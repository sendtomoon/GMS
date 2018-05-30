package com.jy.common.utils.echarts;

import java.io.*;
import com.jy.common.utils.echarts.axis.*;
import com.jy.common.utils.echarts.series.*;
import com.jy.common.utils.echarts.option.*;
import com.jy.common.utils.echarts.style.*;
import java.util.*;
import com.jy.common.utils.echarts.code.*;

public class Option implements Serializable
{
    private static final long serialVersionUID = 4664955083296866542L;
    private Object backgroundColor;
    private List<Object> color;
    private Object renderAsImage;
    private Boolean calculable;
    private Boolean animation;
    private Timeline timeline;
    private Title title;
    private Toolbox toolbox;
    private Tooltip tooltip;
    private Legend legend;
    private DataRange dataRange;
    private DataZoom dataZoom;
    private RoamController roamController;
    private Grid grid;
    private List<Axis> xAxis;
    private List<Axis> yAxis;
    private List<Series> series;
    private List<Polar> polar;
    private List<Symbol> symbolList;
    private String calculableColor;
    private String calculableHolderColo;
    private String nameConnector;
    private String valueConnector;
    private Boolean addDataAnimation;
    private Integer animationThreshold;
    private Integer animationDuration;
    private Integer animationDurationUpdate;
    private Easing animationEasing;
    private NoDataLoadingOption noDataLoadingOption;
    private List<Option> options;
    private ItemStyle itemStyle;
    
    public List<Symbol> symbolList() {
        return this.symbolList;
    }
    
    public Option symbolList(final List<Symbol> symbolList) {
        if (this.symbolList == null) {
            this.symbolList = new LinkedList<Symbol>();
        }
        this.symbolList = symbolList;
        return this;
    }
    
    public Option symbolList(final Symbol... symbolList) {
        if (symbolList == null || symbolList.length == 0) {
            return this;
        }
        this.symbolList().addAll(Arrays.asList(symbolList));
        return this;
    }
    
    public String calculableColor() {
        return this.calculableColor;
    }
    
    public Option calculableColor(final String calculableColor) {
        this.calculableColor = calculableColor;
        return this;
    }
    
    public String calculableHolderColo() {
        return this.calculableHolderColo;
    }
    
    public Option calculableHolderColo(final String calculableHolderColo) {
        this.calculableHolderColo = calculableHolderColo;
        return this;
    }
    
    public String nameConnector() {
        return this.nameConnector;
    }
    
    public Option nameConnector(final String nameConnector) {
        this.nameConnector = nameConnector;
        return this;
    }
    
    public String valueConnector() {
        return this.valueConnector;
    }
    
    public Option valueConnector(final String valueConnector) {
        this.valueConnector = valueConnector;
        return this;
    }
    
    public Boolean addDataAnimation() {
        return this.addDataAnimation;
    }
    
    public Option addDataAnimation(final Boolean addDataAnimation) {
        this.addDataAnimation = addDataAnimation;
        return this;
    }
    
    public Integer animationThreshold() {
        return this.animationThreshold;
    }
    
    public Option animationThreshold(final Integer animationThreshold) {
        this.animationThreshold = animationThreshold;
        return this;
    }
    
    public Integer animationDuration() {
        return this.animationDuration;
    }
    
    public Option animationDuration(final Integer animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }
    
    public Integer animationDurationUpdate() {
        return this.animationDurationUpdate;
    }
    
    public Option animationDurationUpdate(final Integer animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }
    
    public Easing animationEasing() {
        return this.animationEasing;
    }
    
    public Option animationEasing(final Easing animationEasing) {
        this.animationEasing = animationEasing;
        return this;
    }
    
    public NoDataLoadingOption noDataLoadingOption() {
        if (this.noDataLoadingOption == null) {
            this.noDataLoadingOption = new NoDataLoadingOption();
        }
        return this.noDataLoadingOption;
    }
    
    public Option noDataLoadingOption(final NoDataLoadingOption noDataLoadingOption) {
        this.noDataLoadingOption = noDataLoadingOption;
        return this;
    }
    
    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }
    
    public Option itemStyle(final ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }
    
    public List<Polar> polar() {
        if (this.polar == null) {
            this.polar = new ArrayList<Polar>();
        }
        return this.polar;
    }
    
    public Option polar(final List<Polar> polar) {
        this.polar = polar;
        return this;
    }
    
    public Option polar(final Polar... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.polar().addAll(Arrays.asList(values));
        return this;
    }
    
    public Option timeline(final Timeline timeline) {
        this.timeline = timeline;
        return this;
    }
    
    public Option title(final Title title) {
        this.title = title;
        return this;
    }
    
    public Option title(final String text) {
        this.title().text(text);
        return this;
    }
    
    public Option title(final String text, final String subtext) {
        this.title().text(text).subtext(subtext);
        return this;
    }
    
    public Option toolbox(final Toolbox toolbox) {
        this.toolbox = toolbox;
        return this;
    }
    
    public Option tooltip(final Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }
    
    public Option tooltip(final Trigger trigger) {
        this.tooltip().trigger(trigger);
        return this;
    }
    
    public Option legend(final Legend legend) {
        this.legend = legend;
        return this;
    }
    
    public Option dataRange(final DataRange dataRange) {
        this.dataRange = dataRange;
        return this;
    }
    
    public Option dataZoom(final DataZoom dataZoom) {
        this.dataZoom = dataZoom;
        return this;
    }
    
    public Option grid(final Grid grid) {
        this.grid = grid;
        return this;
    }
    
    public Option xAxis(final List<Axis> xAxis) {
        this.xAxis = xAxis;
        return this;
    }
    
    public Option yAxis(final List<Axis> yAxis) {
        this.yAxis = yAxis;
        return this;
    }
    
    public Option series(final List<Series> series) {
        this.series = series;
        return this;
    }
    
    public Option options(final List<Option> options) {
        this.options = options;
        return this;
    }
    
    public Object backgroundColor() {
        return this.backgroundColor;
    }
    
    public Option backgroundColor(final Object backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    
    public List<Object> color() {
        if (this.color == null) {
            this.color = new ArrayList<Object>();
        }
        return this.color;
    }
    
    public Option color(final Object... colors) {
        if (colors == null || colors.length == 0) {
            return this;
        }
        this.color().addAll(Arrays.asList(colors));
        return this;
    }
    
    public Object renderAsImage() {
        return this.renderAsImage;
    }
    
    public Option renderAsImage(final Object renderAsImage) {
        this.renderAsImage = renderAsImage;
        return this;
    }
    
    public Boolean calculable() {
        return this.calculable;
    }
    
    public Option calculable(final Boolean calculable) {
        this.calculable = calculable;
        return this;
    }
    
    public Boolean animation() {
        return this.animation;
    }
    
    public Option animation(final Boolean animation) {
        this.animation = animation;
        return this;
    }
    
    public Timeline timeline() {
        if (this.timeline == null) {
            this.timeline = new Timeline();
        }
        return this.timeline;
    }
    
    public Title title() {
        if (this.title == null) {
            this.title = new Title();
        }
        return this.title;
    }
    
    public Toolbox toolbox() {
        if (this.toolbox == null) {
            this.toolbox = new Toolbox();
        }
        return this.toolbox;
    }
    
    public Tooltip tooltip() {
        if (this.tooltip == null) {
            this.tooltip = new Tooltip();
        }
        return this.tooltip;
    }
    
    public Legend legend() {
        if (this.legend == null) {
            this.legend = new Legend();
        }
        return this.legend;
    }
    
    public Option legend(final Object... values) {
        this.legend().data(values);
        return this;
    }
    
    public DataRange dataRange() {
        if (this.dataRange == null) {
            this.dataRange = new DataRange();
        }
        return this.dataRange;
    }
    
    public DataZoom dataZoom() {
        if (this.dataZoom == null) {
            this.dataZoom = new DataZoom();
        }
        return this.dataZoom;
    }
    
    public RoamController roamController() {
        if (this.roamController == null) {
            this.roamController = new RoamController();
        }
        return this.roamController;
    }
    
    public Grid grid() {
        if (this.grid == null) {
            this.grid = new Grid();
        }
        return this.grid;
    }
    
    public List<Axis> xAxis() {
        if (this.xAxis == null) {
            this.xAxis = new ArrayList<Axis>();
        }
        return this.xAxis;
    }
    
    public Option xAxis(final Axis... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        if (this.xAxis().size() == 2) {
            throw new RuntimeException("xAxis\u5df2\u7ecf\u5b58\u57282\u4e2a\uff0c\u65e0\u6cd5\u7ee7\u7eed\u6dfb\u52a0!");
        }
        if (this.xAxis().size() + values.length > 2) {
            throw new RuntimeException("\u6dfb\u52a0\u7684xAxis\u8d85\u51fa\u4e86\u6700\u5927\u5141\u8bb8\u7684\u8303\u56f4:2!");
        }
        this.xAxis().addAll(Arrays.asList((Axis[])values));
        return this;
    }
    
    public List<Axis> yAxis() {
        if (this.yAxis == null) {
            this.yAxis = new ArrayList<Axis>();
        }
        return this.yAxis;
    }
    
    public Option yAxis(final Axis... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        if (this.yAxis().size() == 2) {
            throw new RuntimeException("yAxis\u5df2\u7ecf\u5b58\u57282\u4e2a\uff0c\u65e0\u6cd5\u7ee7\u7eed\u6dfb\u52a0!");
        }
        if (this.yAxis().size() + values.length > 2) {
            throw new RuntimeException("\u6dfb\u52a0\u7684yAxis\u8d85\u51fa\u4e86\u6700\u5927\u5141\u8bb8\u7684\u8303\u56f4:2!");
        }
        this.yAxis().addAll(Arrays.asList((Axis[])values));
        return this;
    }
    
    public List<Series> series() {
        if (this.series == null) {
            this.series = new ArrayList<Series>();
        }
        return this.series;
    }
    
    public Option series(final Series... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.series().addAll(Arrays.asList((Series[])values));
        return this;
    }
    
    public List<Option> options() {
        if (this.options == null) {
            this.options = new ArrayList<Option>();
        }
        return this.options;
    }
    
    public Option options(final Option... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.options().addAll(Arrays.asList(values));
        return this;
    }
    
    public Timeline getTimeline() {
        return this.timeline;
    }
    
    public void setTimeline(final Timeline timeline) {
        this.timeline = timeline;
    }
    
    public Title getTitle() {
        return this.title;
    }
    
    public void setTitle(final Title title) {
        this.title = title;
    }
    
    public Toolbox getToolbox() {
        return this.toolbox;
    }
    
    public void setToolbox(final Toolbox toolbox) {
        this.toolbox = toolbox;
    }
    
    public Tooltip getTooltip() {
        return this.tooltip;
    }
    
    public void setTooltip(final Tooltip tooltip) {
        this.tooltip = tooltip;
    }
    
    public Legend getLegend() {
        return this.legend;
    }
    
    public void setLegend(final Legend legend) {
        this.legend = legend;
    }
    
    public DataRange getDataRange() {
        return this.dataRange;
    }
    
    public void setDataRange(final DataRange dataRange) {
        this.dataRange = dataRange;
    }
    
    public DataZoom getDataZoom() {
        return this.dataZoom;
    }
    
    public void setDataZoom(final DataZoom dataZoom) {
        this.dataZoom = dataZoom;
    }
    
    public RoamController getRoamController() {
        return this.roamController;
    }
    
    public void setRoamController(final RoamController roamController) {
        this.roamController = roamController;
    }
    
    public Grid getGrid() {
        return this.grid;
    }
    
    public void setGrid(final Grid grid) {
        this.grid = grid;
    }
    
    public List<Axis> getxAxis() {
        return this.xAxis;
    }
    
    public void setxAxis(final List<Axis> xAxis) {
        this.xAxis = xAxis;
    }
    
    public List<Axis> getyAxis() {
        return this.yAxis;
    }
    
    public void setyAxis(final List<Axis> yAxis) {
        this.yAxis = yAxis;
    }
    
    public Object getBackgroundColor() {
        return this.backgroundColor;
    }
    
    public void setBackgroundColor(final Object backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    
    public List<Object> getColor() {
        return this.color;
    }
    
    public void setColor(final List<Object> color) {
        this.color = color;
    }
    
    public Object getRenderAsImage() {
        return this.renderAsImage;
    }
    
    public void setRenderAsImage(final Object renderAsImage) {
        this.renderAsImage = renderAsImage;
    }
    
    public Boolean getCalculable() {
        return this.calculable;
    }
    
    public void setCalculable(final Boolean calculable) {
        this.calculable = calculable;
    }
    
    public Boolean getAnimation() {
        return this.animation;
    }
    
    public void setAnimation(final Boolean animation) {
        this.animation = animation;
    }
    
    public List<Series> getSeries() {
        return this.series;
    }
    
    public void setSeries(final List<Series> series) {
        this.series = series;
    }
    
    public List<Option> getOptions() {
        return this.options;
    }
    
    public void setOptions(final List<Option> options) {
        this.options = options;
    }
    
    public List<Polar> getPolar() {
        return this.polar;
    }
    
    public void setPolar(final List<Polar> polar) {
        this.polar = polar;
    }
    
    public ItemStyle getItemStyle() {
        return this.itemStyle;
    }
    
    public void setItemStyle(final ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }
    
    public List<Symbol> getSymbolList() {
        return this.symbolList;
    }
    
    public void setSymbolList(final List<Symbol> symbolList) {
        this.symbolList = symbolList;
    }
    
    public String getCalculableColor() {
        return this.calculableColor;
    }
    
    public void setCalculableColor(final String calculableColor) {
        this.calculableColor = calculableColor;
    }
    
    public String getCalculableHolderColo() {
        return this.calculableHolderColo;
    }
    
    public void setCalculableHolderColo(final String calculableHolderColo) {
        this.calculableHolderColo = calculableHolderColo;
    }
    
    public String getNameConnector() {
        return this.nameConnector;
    }
    
    public void setNameConnector(final String nameConnector) {
        this.nameConnector = nameConnector;
    }
    
    public String getValueConnector() {
        return this.valueConnector;
    }
    
    public void setValueConnector(final String valueConnector) {
        this.valueConnector = valueConnector;
    }
    
    public Boolean getAddDataAnimation() {
        return this.addDataAnimation;
    }
    
    public void setAddDataAnimation(final Boolean addDataAnimation) {
        this.addDataAnimation = addDataAnimation;
    }
    
    public Integer getAnimationThreshold() {
        return this.animationThreshold;
    }
    
    public void setAnimationThreshold(final Integer animationThreshold) {
        this.animationThreshold = animationThreshold;
    }
    
    public Integer getAnimationDuration() {
        return this.animationDuration;
    }
    
    public void setAnimationDuration(final Integer animationDuration) {
        this.animationDuration = animationDuration;
    }
    
    public Integer getAnimationDurationUpdate() {
        return this.animationDurationUpdate;
    }
    
    public void setAnimationDurationUpdate(final Integer animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
    }
    
    public Easing getAnimationEasing() {
        return this.animationEasing;
    }
    
    public void setAnimationEasing(final Easing animationEasing) {
        this.animationEasing = animationEasing;
    }
    
    public NoDataLoadingOption getNoDataLoadingOption() {
        return this.noDataLoadingOption;
    }
    
    public void setNoDataLoadingOption(final NoDataLoadingOption noDataLoadingOption) {
        this.noDataLoadingOption = noDataLoadingOption;
    }
}
