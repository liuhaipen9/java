package com.cn.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myServlet2")
public class MyServlet2 extends HttpServlet{
 @Override
protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	System.out.println("myServlet");
	arg1.getWriter().println("success");
}
}
