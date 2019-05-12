package com.cn.date;

import org.joda.time.DateTime;

public class DateTest {

	public static void main(String[] args) {
		int startDays=1; //多少天前的
        int days=2; //跨度天数 5
        int hours=2; // 跨度小时 0
       
        DateTime startDate = false?(DateTime.now().minusDays(startDays)):DateTime.now().plusDays(1).minusMinutes(60);
        DateTime endDate = DateTime.now().minusDays(startDays).minusHours(hours+1);
        startDate=startDate.minusDays(days).minusHours(hours);
        System.out.println("startDate--->>"+startDays);
        System.out.println("endDate-->>"+endDate);

	}

}
