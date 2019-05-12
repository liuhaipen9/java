package com.cn.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/myServlet")
public class MyServlet extends HttpServlet{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie=new Cookie("1k", "roc-liu");
		cookie.setPath("/MyCookieAndRequest/myServlet2");
		response.addCookie(cookie);
	}

}
