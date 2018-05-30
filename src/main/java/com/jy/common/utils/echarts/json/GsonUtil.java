package com.jy.common.utils.echarts.json;

import com.google.gson.*;
import com.jy.common.utils.echarts.*;
import com.jy.common.utils.echarts.series.*;
import java.lang.reflect.*;
import com.jy.common.utils.echarts.axis.*;

public class GsonUtil
{
    public static String format(final Object object) {
        final Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        final JsonParser jp = new JsonParser();
        final JsonElement je = jp.parse(gson.toJson(object));
        final String prettyJsonString = gson.toJson(je);
        String[] lines = prettyJsonString.split("\n");
        lines = replaceFunctionQuote(lines);
        final StringBuilder stringBuilder = new StringBuilder();
        String[] array;
        for (int length = (array = lines).length, i = 0; i < length; ++i) {
            final String line = array[i];
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }
    
    public static String prettyFormat(final Object object) {
        final Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        final JsonParser jp = new JsonParser();
        final JsonElement je = jp.parse(gson.toJson(object));
        final String prettyJsonString = gson.toJson(je);
        String[] lines = prettyJsonString.split("\n");
        lines = replaceFunctionQuote(lines);
        final StringBuilder stringBuilder = new StringBuilder();
        String[] array;
        for (int length = (array = lines).length, i = 0; i < length; ++i) {
            final String line = array[i];
            stringBuilder.append(String.valueOf(line) + "\n");
        }
        return stringBuilder.toString();
    }
    
    public static String[] replaceFunctionQuote(final String[] lines) {
        boolean function = false;
        boolean immediately = false;
        for (int i = 0; i < lines.length; ++i) {
            String line = lines[i].trim();
            if (!function && line.contains("\"function")) {
                function = true;
                line = line.replaceAll("\"function", "function");
            }
            if (function && line.contains("}\"")) {
                function = false;
                line = line.replaceAll("\\}\"", "\\}");
            }
            if (!immediately && line.contains("\"(function")) {
                immediately = true;
                line = line.replaceAll("\"\\(function", "\\(function");
            }
            if (immediately && line.contains("})()\"")) {
                immediately = false;
                line = line.replaceAll("\\}\\)\\(\\)\"", "\\}\\)\\(\\)");
            }
            lines[i] = line;
        }
        return lines;
    }
    
    public static <T extends Option> T fromJSON(final String json, final Class<T> type) {
        final Gson gson = new GsonBuilder().setPrettyPrinting().registerTypeAdapter((Type)Series.class, (Object)new SeriesDeserializer()).registerTypeAdapter((Type)Axis.class, (Object)new AxisDeserializer()).create();
        return (T)gson.fromJson(json, (Class)type);
    }
    
    public static Option fromJSON(final String json) {
        final Gson gson = new GsonBuilder().setPrettyPrinting().registerTypeAdapter((Type)Series.class, (Object)new SeriesDeserializer()).registerTypeAdapter((Type)Axis.class, (Object)new AxisDeserializer()).create();
        final Option option = (Option)gson.fromJson(json, (Class)Option.class);
        return option;
    }
    
    public static void print(final Object object) {
        System.out.println(format(object));
    }
    
    public static void printPretty(final Object object) {
        System.out.println(prettyFormat(object));
    }
}
