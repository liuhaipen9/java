package com.cn.aop;

import org.aspectj.apache.bcel.classfile.Method;
import org.aspectj.lang.JoinPoint;
import org.springframework.aop.ThrowsAdvice;

public class ExcepersionAop implements ThrowsAdvice{
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex){
		System.out.println("方法名为:"+method.getName()+"报异常了");
		System.out.println("异常通知------>>>>>>>>>>>>>"+ex.getMessage());
	}
	
	
}
