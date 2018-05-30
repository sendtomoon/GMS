package com.jy.common.utils.echarts.json;

import java.lang.reflect.*;
import com.jy.common.utils.echarts.code.*;
import com.jy.common.utils.echarts.series.*;
import com.google.gson.*;

public class SeriesDeserializer implements JsonDeserializer<Series>
{
    public Series deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context) throws JsonParseException {
        final JsonObject jsonObject = json.getAsJsonObject();
        final String _type = jsonObject.get("type").getAsString();
        final SeriesType type = SeriesType.valueOf(_type);
        Series series = null;
        switch (type) {
            case line: {
                series = (Series)context.deserialize((JsonElement)jsonObject, (Type)Line.class);
                break;
            }
            case bar: {
                series = (Series)context.deserialize((JsonElement)jsonObject, (Type)Bar.class);
                break;
            }
            case scatter: {
                series = (Series)context.deserialize((JsonElement)jsonObject, (Type)Scatter.class);
                break;
            }
            case funnel: {
                series = (Series)context.deserialize((JsonElement)jsonObject, (Type)Funnel.class);
                break;
            }
            case pie: {
                series = (Series)context.deserialize((JsonElement)jsonObject, (Type)Pie.class);
                break;
            }
            case force: {
                series = (Series)context.deserialize((JsonElement)jsonObject, (Type)Force.class);
                break;
            }
            case gauge: {
                series = (Series)context.deserialize((JsonElement)jsonObject, (Type)Gauge.class);
                break;
            }
            case map: {
                series = (Series)context.deserialize((JsonElement)jsonObject, (Type)Map.class);
                break;
            }
            case island: {
                series = (Series)context.deserialize((JsonElement)jsonObject, (Type)Island.class);
                break;
            }
            case k: {
                series = (Series)context.deserialize((JsonElement)jsonObject, (Type)K.class);
                break;
            }
            case radar: {
                series = (Series)context.deserialize((JsonElement)jsonObject, (Type)Radar.class);
                break;
            }
            case chord: {
                series = (Series)context.deserialize((JsonElement)jsonObject, (Type)Chord.class);
                break;
            }
        }
        return series;
    }
}
