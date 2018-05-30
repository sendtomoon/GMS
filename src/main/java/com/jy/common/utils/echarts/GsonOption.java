package com.jy.common.utils.echarts;

import com.jy.common.utils.echarts.json.*;

public class GsonOption extends Option
{
    @Override
    public String toString() {
        return GsonUtil.format(this);
    }
}
