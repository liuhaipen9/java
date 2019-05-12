package com.cn.firstDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvactionHandle implements InvocationHandler{
	private Object taget;
	

	public MyInvactionHandle(Object taget) {
		this.taget = taget;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("被代理之前！！！");
		method.invoke(taget, args);
		System.out.println("被代理之后！！！");
		return null;
	}

}
