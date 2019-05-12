package com.cn.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class Test {

    public long stringToLongDate(String str) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        return date.getTime();
    }

    public static void main(String[] args) throws Exception {

       TimeZone timeZone =TimeZone.getTimeZone("UTC+8:00");
        System.out.println("tz-->>"+timeZone.getID());

        Date date =new Date(new Test().stringToLongDate("2017-11-14 18:25:10"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        //本地时间转成UTC时间
        Date gmt = new Date(sdf.format(date));
        System.out.println("gmt-->>"+gmt);


        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date1 =new Date(gmt.getTime());
        System.out.println(sdf1.format(date1));


        String time ="2017-11-14 00:00:00";
        System.out.println(new Test().stringToLongDate(time));
//        System.out.println(1510588800000l+10*60*60*1000+25*60*1000+10*1000);
//
//        System.out.println(sdf1.format(new Date(new Test().stringToLongDate(time))));


        //Tue Nov 14 10:25:10 CST 2017





    }

}
