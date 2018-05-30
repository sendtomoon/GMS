package com.jy.common.utils;

import com.google.gson.*;
import java.lang.reflect.*;

public class JsonUtil
{
    private static Gson gson;
    
    static {
        JsonUtil.gson = new Gson();
    }
    
    public static Gson getGsonInstance() {
        if (JsonUtil.gson == null) {
            JsonUtil.gson = new Gson();
        }
        return JsonUtil.gson;
    }
    
    public static String toJson(final Object obj) {
        return getGsonInstance().toJson(obj);
    }
    
    public static <T> T fromJson(final String str, final Type type) {
        return (T)getGsonInstance().fromJson(str, type);
    }
    
    public static <T> T fromJson(final String str, final Class<T> type) {
        return (T)getGsonInstance().fromJson(str, (Class)type);
    }
}
