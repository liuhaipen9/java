package com.cn.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;

import com.sun.jmx.snmp.Timestamp;

public class DateTimeTest {
	public static void main(String[] args) throws ParseException {
		System.out.println(new DateTime("2017-10-10"));
	
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr="2019-10-11 10:11:12";
		Date date2=sdf.parse(dateStr);
		System.out.println("date2-->>"+date2);
		
		
	   SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSS'Z'");//设置日期格式  
	    System.out.println("gf-->>"+df.format(date2));// new Date()为获取当前系统时间 

		
	    SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置解析日期格式 
		String date = df.format(new Date()).replace("Z", "UTC"); 
		Date d = df2.parse(date);
		System.out.println("date-->>"+date);
		
		date = date.replace("Z", " UTC");//注意是空格+UTC
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");//注意格式化的表达式
		//String d = format.format(date);
		System.out.println(d);
	}
}
