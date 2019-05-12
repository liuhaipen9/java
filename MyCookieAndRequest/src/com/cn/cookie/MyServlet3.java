package com.cn.cookie;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.LifecycleListener;
import org.apache.el.parser.AstListData;

@WebServlet("/myServlet3")
public class MyServlet3 extends HttpServlet {
 @Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 response.setCharacterEncoding("utf-8");
	 response.setHeader("Content-Type","text/html;charset=utf-8");
	Date date=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
	String dateStr=sdf.format(date);
   System.out.println(dateStr);
	Cookie cookie=new Cookie("date",dateStr);
	response.addCookie(cookie);
	Cookie[] cookies=request.getCookies();
	String dStr="";
	if (cookies!=null) {
	for (Cookie c:cookies) {
		if (c.getName().equals("date")) {
			dStr=c.getValue();
		}
	}
	}
	if (!dStr.equals("")&&dStr!=null) {
		response.getWriter().println("您上次登录的时间是:"+dStr);
	}else {
		response.getWriter().println("你是第一次登录");
	}
}
}
