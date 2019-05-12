package com.cn.monitor;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.sun.corba.se.impl.encoding.CodeSetComponentInfo.CodeSetContext;

public class MySession implements HttpSessionListener {
	private ServletContext sc=null;
	@Override
	public void sessionCreated(HttpSessionEvent hse) {
		System.out.println("sessionListense对象被创建");
		HttpSession session=hse.getSession();
		sc=session.getServletContext();
		getCount(sc, true);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent hse) {
		// TODO Auto-generated method stub
		System.out.println("sessionListense对象被销毁");
		HttpSession session=hse.getSession();
		sc=session.getServletContext();
		getCount(sc, false);
	}
	
	public void getCount(ServletContext sc,boolean bool){
		int count=(int) sc.getAttribute("count");
		synchronized (sc) {
		if(bool){
			++count;
			sc.setAttribute("count", count);
		}else {
			--count;
			sc.setAttribute("count", count);
		}
	}
		}

}
