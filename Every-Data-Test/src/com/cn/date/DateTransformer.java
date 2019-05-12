package com.cn.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTransformer  
{  
    public static final String DATE_FORMAT = "MM/dd/yyyy HH:mm:ss";  
         
    public static String dateTransformBetweenTimeZone(Date sourceDate, DateFormat formatter,  
        TimeZone sourceTimeZone, TimeZone targetTimeZone) {  
        Long targetTime = sourceDate.getTime() - sourceTimeZone.getRawOffset() + targetTimeZone.getRawOffset();  
        return DateTransformer.getTime(new Date(targetTime), formatter);  
    }  
         
    public static String getTime(Date date, DateFormat formatter){  
       return formatter.format(date);  
    }  
         
    public static void main(String[] args){  
        DateFormat formatter = new SimpleDateFormat(DATE_FORMAT);  
        Date date = Calendar.getInstance().getTime();  
        TimeZone srcTimeZone = TimeZone.getTimeZone("EST");  
        TimeZone destTimeZone = TimeZone.getTimeZone("GMT+8");  
        System.out.println(DateTransformer.dateTransformBetweenTimeZone(date, formatter, srcTimeZone, destTimeZone));  
    }  
}  
