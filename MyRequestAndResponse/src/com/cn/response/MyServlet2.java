package com.cn.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/myServlet2")
public class MyServlet2 extends HttpServlet {
 @Override
protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	// TODO Auto-generated method stub
System.out.println("======myServlet2=======");
}
}
