package com.jy.common.utils.base;

import java.util.*;

public class UuidUtil
{
    public static String get32UUID() {
        final String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
        return uuid;
    }
    
    public static String uuid() {
        return UUID.randomUUID().toString();
    }
    
    public static void main(final String[] args) {
        System.out.println(get32UUID());
    }
}
