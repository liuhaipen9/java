package com.cn.response;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/myResponse")
public class MyResponse extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setStatus(302);
		
		response.addHeader("name", "roc");
		response.addDateHeader("时间", new Date().getTime());
		response.addIntHeader("年龄", 20);
		
		//response.setHeader("name", "刘海鹏");
		//response.setHeader("localtion", "/MyRequestAndResponse/myServlet2");
		//response.sendRedirect("/MyRequestAndResponse/myServlet2");
		response.setHeader("Referer", "3;/MyRequestAndResponse/myServlet2");
	}
}
