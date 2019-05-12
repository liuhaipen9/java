package com.cn.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class MyServlet4 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
		HttpSession session=request.getSession();
		
	}
}
