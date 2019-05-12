package com.cn.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myServlet3")
public class MyServlet3 extends HttpServlet {
 @Override
protected void service(HttpServletRequest arg0, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	 response.setCharacterEncoding("utf-8");
	 //response.setContentType("text/html;charset=utf-8");
	 response.setHeader("Content-Type", "text/html;charset=utf-8");
	response.addHeader("name", "safda");
	response.getWriter().println("<h1>大鹏<h1>");
}
}
