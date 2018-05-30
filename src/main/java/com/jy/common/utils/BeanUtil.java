package com.jy.common.utils;

public final class BeanUtil
{
    public static boolean isNull(final Object object) {
        return object == null;
    }
    
    public static boolean nonNull(final Object object) {
        return object != null;
    }
    
    public static Object requireNonNull(final Object object, final String errorMessage) {
        if (object == null) {
            throw new NullPointerException(errorMessage);
        }
        return object;
    }
}
