package com.cn.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.core.Ordered;

public class AroundAop implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object result=null;
		System.out.println("环绕通知-前置");
		try {
		result=invocation.proceed();
		System.out.println("方法名称-->"+invocation.getMethod()+"通知类:"+invocation.getThis());
		System.out.println("环绕通知-后置");
		} catch (Exception e) {
			System.out.println("环绕通知-异常");
			// TODO: handle exception
		}finally {
			System.out.println("环绕通知-最终");
		}
		return "roc";
	}

	
}
