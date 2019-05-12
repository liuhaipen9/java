package com.cn.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/myRequest3")
public class MyRequest3 extends HttpServlet{
 @Override
protected void service(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
	String key=request.getAttribute("key").toString();
	System.out.println("myRequest3--->>>"+request);
	System.out.println("key--->>>"+key);
	
}
}
