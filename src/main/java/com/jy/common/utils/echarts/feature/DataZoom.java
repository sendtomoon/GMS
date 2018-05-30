package com.jy.common.utils.echarts.feature;

import java.util.*;

public class DataZoom extends Feature
{
    public DataZoom() {
        this.show(true);
        final Map title = new HashMap();
        title.put("dataZoom", "\u533a\u57df\u7f29\u653e");
        title.put("dataZoomReset", "\u533a\u57df\u7f29\u653e\u540e\u9000");
        this.title(title);
    }
}
