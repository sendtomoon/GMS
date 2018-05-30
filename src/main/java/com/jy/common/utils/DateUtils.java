package com.jy.common.utils;

import org.apache.commons.lang3.time.*;
import java.util.*;
import java.text.*;

public class DateUtils extends org.apache.commons.lang3.time.DateUtils
{
    public static String[] parsePatterns;
    
    static {
        DateUtils.parsePatterns = new String[] { "yyyyMMdd", "yyyy-MM-dd", "yyyy-MM-dd HH:mm", "yyyy-MM-dd HH:mm:ss", "yyyy/MM/dd", "yyyy/MM/dd HH:mm", "yyyy/MM/dd HH:mm:ss", "HH:mm:ss", "yyyy", "MM", "dd", "E" };
    }
    
    public static String getDate(final String pattern) {
        return DateFormatUtils.format(new Date(), pattern);
    }
    
    public static String formatDate(final Date date, final Object... pattern) {
        String formatDate = null;
        if (pattern != null && pattern.length > 0) {
            formatDate = DateFormatUtils.format(date, pattern[0].toString());
        }
        else {
            formatDate = DateFormatUtils.format(date, DateUtils.parsePatterns[1]);
        }
        return formatDate;
    }
    
    public static Date parseDate(final Object str) {
        if (str == null) {
            return null;
        }
        try {
            return parseDate(str.toString(), DateUtils.parsePatterns);
        }
        catch (ParseException e) {
            return null;
        }
    }
    
    public static long pastDays(final Date date) {
        final long t = new Date().getTime() - date.getTime();
        return t / 86400000L;
    }
    
    public static Date getDateStart(Date date) {
        if (date == null) {
            return null;
        }
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = sdf.parse(String.valueOf(formatDate(date, "yyyy-MM-dd")) + " 00:00:00");
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    
    public static Date getDateEnd(Date date) {
        if (date == null) {
            return null;
        }
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = sdf.parse(String.valueOf(formatDate(date, "yyyy-MM-dd")) + " 23:59:59");
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    
    public static Date addMinutes(final Date recordTime, final int recordPeriodMinute) {
        final Calendar c = Calendar.getInstance();
        c.setTime(recordTime);
        c.add(12, recordPeriodMinute);
        return c.getTime();
    }
    
    public static Date addSeconds(final Date recordTime, final int recordPeriodSecond) {
        final Calendar c = Calendar.getInstance();
        c.setTime(recordTime);
        c.add(13, recordPeriodSecond);
        return c.getTime();
    }
    
    public static boolean isValidDate(final String date) {
        final DateFormat fmt = new SimpleDateFormat(DateUtils.parsePatterns[1]);
        try {
            fmt.parse(date);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    
    public static int getDiffYear(final String startTime, final String endTime) {
        final DateFormat fmt = new SimpleDateFormat(DateUtils.parsePatterns[1]);
        try {
            final int years = (int)((fmt.parse(endTime).getTime() - fmt.parse(startTime).getTime()) / 86400000L / 365L);
            return years;
        }
        catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public static long getDaySub(final String startTime, final String endTime) {
        long day = 0L;
        final SimpleDateFormat format = new SimpleDateFormat(DateUtils.parsePatterns[1]);
        Date beginDate = null;
        Date endDate = null;
        try {
            beginDate = format.parse(startTime);
            endDate = format.parse(endTime);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        day = (endDate.getTime() - beginDate.getTime()) / 86400000L;
        return day;
    }
    
    public static String getAfterDayDate(final String days) {
        final int daysInt = Integer.parseInt(days);
        final Calendar canlendar = Calendar.getInstance();
        canlendar.add(5, daysInt);
        final Date date = canlendar.getTime();
        final SimpleDateFormat sdfd = new SimpleDateFormat(DateUtils.parsePatterns[3]);
        final String dateStr = sdfd.format(date);
        return dateStr;
    }
    
    public static String getAfterDayWeek(final String days) {
        final int daysInt = Integer.parseInt(days);
        final Calendar canlendar = Calendar.getInstance();
        canlendar.add(5, daysInt);
        final Date date = canlendar.getTime();
        final SimpleDateFormat sdf = new SimpleDateFormat(DateUtils.parsePatterns[11]);
        final String dateStr = sdf.format(date);
        return dateStr;
    }
    
    public static String getTimes(final Object str) {
        String resultTimes = "";
        final Date date = parseDate(str);
        final Date now = new Date();
        final long times = now.getTime() - date.getTime();
        final long day = times / 86400000L;
        final long hour = times / 3600000L - day * 24L;
        final long min = times / 60000L - day * 24L * 60L - hour * 60L;
        final long sec = times / 1000L - day * 24L * 60L * 60L - hour * 60L * 60L - min * 60L;
        final StringBuffer sb = new StringBuffer();
        if (day > 0L) {
            sb.append(String.valueOf(day) + "\u65e5\u524d");
        }
        else if (hour > 0L) {
            sb.append(String.valueOf(hour) + "\u5c0f\u65f6\u524d");
        }
        else if (min > 0L) {
            sb.append(String.valueOf(min) + "\u5206\u949f\u524d");
        }
        else if (sec > 0L) {
            sb.append(String.valueOf(sec) + "\u79d2\u524d");
        }
        else if (times >= 0L) {
            sb.append(String.valueOf(times) + "\u6beb\u79d2\u524d");
        }
        else {
            sb.append("\u8d85\u524d\u6beb\u79d2\u6570:" + times);
        }
        resultTimes = sb.toString();
        return resultTimes;
    }
    
    public static Date formatTime(final long createTime) {
        final long msgCreateTime = createTime * 1000L;
        return new Date(msgCreateTime);
    }
    
    public static void main(final String[] args) {
        System.out.println(getTimes("2015-11-11"));
    }
}
