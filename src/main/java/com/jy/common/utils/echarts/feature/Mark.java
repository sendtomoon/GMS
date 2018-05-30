package com.jy.common.utils.echarts.feature;

import com.jy.common.utils.echarts.style.*;
import com.jy.common.utils.echarts.code.*;
import java.util.*;

public class Mark extends Feature
{
    public Mark() {
        this.show(true);
        final Map title = new HashMap();
        title.put("mark", "\u8f85\u52a9\u7ebf\u5f00\u5173");
        title.put("markUndo", "\u5220\u9664\u8f85\u52a9\u7ebf");
        title.put("markClear", "\u6e05\u7a7a\u8f85\u52a9\u7ebf");
        this.title(title);
        this.lineStyle(new LineStyle());
        this.lineStyle().width(2);
        this.lineStyle().color("#1e90ff");
        this.lineStyle().type(LineType.dashed);
    }
}
