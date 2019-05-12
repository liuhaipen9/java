package com.cn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cn.dto.User;
import com.cn.service.UserServiceI;

public class AnnotionServlet extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
    	ServletContext sc=config.getServletContext();
    	sc.setAttribute("ac", ac);
		super.init(config);
	}
   
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res )throws ServletException, IOException {
   	ServletContext sc=req.getServletContext();
   	ApplicationContext ac=(ApplicationContext) sc.getAttribute("ac");
  	UserServiceI userServiceI=(UserServiceI) ac.getBean("userServiceI");
 	User user=userServiceI.findUser();
    	
    	res.getWriter().println(user.toString());
    }
	

}
