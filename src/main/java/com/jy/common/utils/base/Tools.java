package com.jy.common.utils.base;

import java.util.*;
import java.text.*;
import java.util.regex.*;
import java.io.*;

public class Tools
{
    public static int getRandomNum() {
        final Random r = new Random();
        return r.nextInt(900000) + 100000;
    }
    
    public static boolean notEmpty(final String s) {
        return s != null && !"".equals(s) && !"null".equals(s);
    }
    
    public static boolean isEmpty(final String s) {
        return s == null || "".equals(s) || "null".equals(s);
    }
    
    public static String[] str2StrArray(final String str, final String splitRegex) {
        if (isEmpty(str)) {
            return null;
        }
        return str.split(splitRegex);
    }
    
    public static String[] str2StrArray(final String str) {
        return str2StrArray(str, ",\\s*");
    }
    
    public static String date2Str(final Date date) {
        return date2Str(date, "yyyy-MM-dd HH:mm:ss");
    }
    
    public static Date str2Date(final String date) {
        if (notEmpty(date)) {
            final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                return sdf.parse(date);
            }
            catch (ParseException e) {
                e.printStackTrace();
                return new Date();
            }
        }
        return null;
    }
    
    public static String date2Str(final Date date, final String format) {
        if (date != null) {
            final SimpleDateFormat sdf = new SimpleDateFormat(format);
            return sdf.format(date);
        }
        return "";
    }
    
    public static void writeFile(final String fileP, final String content) {
        String filePath = String.valueOf(String.valueOf(Thread.currentThread().getContextClassLoader().getResource(""))) + "../../";
        filePath = (String.valueOf(filePath.trim()) + fileP.trim()).substring(6).trim();
        if (filePath.indexOf(":") != 1) {
            filePath = String.valueOf(File.separator) + filePath;
        }
        try {
            final OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(filePath), "utf-8");
            final BufferedWriter writer = new BufferedWriter(write);
            writer.write(content);
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static boolean checkEmail(final String email) {
        boolean flag = false;
        try {
            final String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
            final Pattern regex = Pattern.compile(check);
            final Matcher matcher = regex.matcher(email);
            flag = matcher.matches();
        }
        catch (Exception e) {
            flag = false;
        }
        return flag;
    }
    
    public static boolean checkMobileNumber(final String mobileNumber) {
        boolean flag = false;
        try {
            final Pattern regex = Pattern.compile("^(((13[0-9])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8})|(0\\d{2}-\\d{8})|(0\\d{3}-\\d{7})$");
            final Matcher matcher = regex.matcher(mobileNumber);
            flag = matcher.matches();
        }
        catch (Exception e) {
            flag = false;
        }
        return flag;
    }
    
    public static String readTxtFile(final String fileP) {
        try {
            String filePath = String.valueOf(String.valueOf(Thread.currentThread().getContextClassLoader().getResource(""))) + "../../";
            filePath = filePath.replaceAll("file:/", "");
            filePath = filePath.replaceAll("%20", " ");
            filePath = String.valueOf(filePath.trim()) + fileP.trim();
            if (filePath.indexOf(":") != 1) {
                filePath = String.valueOf(File.separator) + filePath;
            }
            final String encoding = "utf-8";
            final File file = new File(filePath);
            if (file.isFile() && file.exists()) {
                final InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
                final BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                if ((lineTxt = bufferedReader.readLine()) != null) {
                    return lineTxt;
                }
                read.close();
            }
            else {
                System.out.println("\u627e\u4e0d\u5230\u6307\u5b9a\u7684\u6587\u4ef6,\u67e5\u770b\u6b64\u8def\u5f84\u662f\u5426\u6b63\u786e:" + filePath);
            }
        }
        catch (Exception e) {
            System.out.println("\u8bfb\u53d6\u6587\u4ef6\u5185\u5bb9\u51fa\u9519");
        }
        return "";
    }
}
