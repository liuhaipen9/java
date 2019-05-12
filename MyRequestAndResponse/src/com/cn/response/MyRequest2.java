package com.cn.response;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/myRequest2")
public class MyRequest2 extends HttpServlet{
 @Override
protected void service(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
	request.setAttribute("key", "liuhp");
	System.out.println("myRequest2---->>>"+request);
	RequestDispatcher rdp=request.getRequestDispatcher("/myRequest");
	rdp.forward(request, arg1);
	
}
}
