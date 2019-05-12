package com.cn.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;


public class AfterAop implements AfterReturningAdvice{
	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("===========aop后置通知=============");
		
	}

}
