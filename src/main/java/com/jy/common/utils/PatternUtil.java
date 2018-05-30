package com.jy.common.utils;

import java.util.regex.*;

public class PatternUtil
{
    public static boolean isEmail(final String email) {
        final String regex = "\\w+@\\w+\\.[a-z]+(\\.[a-z]+)?";
        return Pattern.matches(regex, email);
    }
    
    public static boolean isIdCard(final String idCard) {
        final String regex = "[1-9]\\d{13,16}[a-zA-Z0-9]{1}";
        return Pattern.matches(regex, idCard);
    }
    
    public static boolean isImage(final String suffix) {
        if (suffix != null && !"".equals(suffix)) {
            final String regex = "(.*?)(?i)(jpg|jpeg|png|gif|bmp|webp)";
            return Pattern.matches(regex, suffix);
        }
        return false;
    }
    
    public static boolean isMobile(final String mobile) {
        final String regex = "(\\+\\d+)?1[3458]\\d{9}$";
        return Pattern.matches(regex, mobile);
    }
    
    public static boolean isPhone(final String phone) {
        final String regex = "(\\+\\d+)?(\\d{3,4}\\-?)?\\d{7,8}$";
        return Pattern.matches(regex, phone);
    }
    
    public static boolean isDigit(final String digit) {
        final String regex = "\\-?[1-9]\\d+";
        return Pattern.matches(regex, digit);
    }
    
    public static boolean isDecimals(final String decimals) {
        final String regex = "\\-?[1-9]\\d+(\\.\\d+)?";
        return Pattern.matches(regex, decimals);
    }
    
    public static boolean isBlankSpace(final String blankSpace) {
        final String regex = "\\s+";
        return Pattern.matches(regex, blankSpace);
    }
    
    public static boolean isChinese(final String chinese) {
        final String regex = "^[\u4e00-\u9fa5]+$";
        return Pattern.matches(regex, chinese);
    }
    
    public static boolean isRealName(final String chinese) {
        final String regex = "^[A-Za-z0-9\\s\u4e00-\u9fa5]+$";
        return Pattern.matches(regex, chinese);
    }
    
    public static boolean isNumber(final String str) {
        final String regex = "^[1-9]\\d*$";
        return Pattern.matches(regex, str);
    }
    
    public static boolean isStudentNum(final String num) {
        final String regex = "^[A-Za-z0-9-_]+$";
        return Pattern.matches(regex, num);
    }
    
    public static boolean isBirthday(final String birthday) {
        final String regex = "^(\\d{4})-(\\d{2})-(\\d{2})$";
        return Pattern.matches(regex, birthday);
    }
    
    public static boolean isURL(final String url) {
        final String regex = "(https?://(w{3}\\.)?)?\\w+\\.\\w+(\\.[a-zA-Z]+)*(:\\d{1,5})?(/\\w*)*(\\??(.+=.*)?(&.+=.*)?)?";
        return Pattern.matches(regex, url);
    }
    
    public static boolean isPostcode(final String postcode) {
        final String regex = "[1-9]\\d{5}";
        return Pattern.matches(regex, postcode);
    }
    
    public static boolean isIpAddress(final String ipAddress) {
        final String regex = "[1-9](\\d{1,2})?\\.(0|([1-9](\\d{1,2})?))\\.(0|([1-9](\\d{1,2})?))\\.(0|([1-9](\\d{1,2})?))";
        return Pattern.matches(regex, ipAddress);
    }
}
