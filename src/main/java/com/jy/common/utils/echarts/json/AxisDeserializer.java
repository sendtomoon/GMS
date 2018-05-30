package com.jy.common.utils.echarts.json;

import java.lang.reflect.*;
import com.jy.common.utils.echarts.code.*;
import com.jy.common.utils.echarts.axis.*;
import com.google.gson.*;

public class AxisDeserializer implements JsonDeserializer<Axis>
{
    public Axis deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context) throws JsonParseException {
        final JsonObject jsonObject = json.getAsJsonObject();
        final String _type = jsonObject.get("type").getAsString();
        final AxisType type = AxisType.valueOf(_type);
        Axis axis = null;
        switch (type) {
            case category: {
                axis = (Axis)context.deserialize((JsonElement)jsonObject, (Type)CategoryAxis.class);
                break;
            }
            case value: {
                axis = (Axis)context.deserialize((JsonElement)jsonObject, (Type)ValueAxis.class);
                break;
            }
            case time: {
                axis = (Axis)context.deserialize((JsonElement)jsonObject, (Type)TimeAxis.class);
                break;
            }
        }
        return axis;
    }
}
