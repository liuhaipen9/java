package com.cn.response;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/myRequest")
public class MyRequest extends HttpServlet {
@Override
protected void service(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
	String key=request.getAttribute("key").toString();
	System.out.println("myRequest3--->>>"+request);
	System.out.println("key--->>>"+key);
	
	
	String username=request.getParameter("username");
	String method=request.getMethod();
	System.out.println(method);
	StringBuffer url=request.getRequestURL();
	System.out.println(url);
	String uri=request.getRequestURI();
	System.out.println(uri);
	String str=request.getQueryString();
	System.out.println(str);
	
	System.out.println("username---->>>>"+username);
	
	System.out.println("=========================================");
	
	Enumeration<String> headerNames=request.getHeaderNames();
	while (headerNames.hasMoreElements()) {
		String name = (String) headerNames.nextElement();
		System.out.print("name="+name+":");
		String value=request.getHeader(name);
		System.out.println("value="+value);
		
	}

}
}
