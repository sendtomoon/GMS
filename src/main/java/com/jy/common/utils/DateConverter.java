package com.jy.common.utils;

import org.apache.commons.beanutils.*;
import org.apache.log4j.*;
import java.util.*;
import org.apache.commons.lang3.time.*;
import org.apache.commons.lang3.*;
import java.text.*;

public class DateConverter implements Converter
{
    private static final Logger logger;
    private static final String DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    private static final String DATETIME_PATTERN_NO_SECOND = "yyyy-MM-dd HH:mm";
    private static final String DATE_PATTERN = "yyyy-MM-dd";
    private static final String MONTH_PATTERN = "yyyy-MM";
    
    static {
        logger = Logger.getLogger((Class)DateConverter.class);
    }
    
    public Object convert(final Class type, final Object value) {
        Object result = null;
        if (type == Date.class) {
            try {
                result = this.doConvertToDate(value);
            }
            catch (ParseException e) {
                e.printStackTrace();
            }
        }
        else if (type == String.class) {
            result = this.doConvertToString(value);
        }
        return result;
    }
    
    private Date doConvertToDate(Object value) throws ParseException {
        Date result = null;
        if (value instanceof String) {
            result = DateUtils.parseDate((String)value, new String[] { "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM" });
            if (result == null && StringUtils.isNotEmpty((CharSequence)value)) {
                try {
                    result = new Date(new Long((String)value));
                }
                catch (Exception e) {
                    DateConverter.logger.error((Object)"Converting from milliseconds to Date fails!");
                    e.printStackTrace();
                }
            }
        }
        else if (value instanceof Object[]) {
            final Object[] array = (Object[])value;
            if (array.length >= 1) {
                value = array[0];
                result = this.doConvertToDate(value);
            }
        }
        else if (Date.class.isAssignableFrom(value.getClass())) {
            result = (Date)value;
        }
        return result;
    }
    
    private String doConvertToString(final Object value) {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String result = null;
        if (value instanceof Date) {
            result = simpleDateFormat.format(value);
        }
        return result;
    }
}
