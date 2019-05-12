package com.cn.firstSpring;

import org.aspectj.weaver.ast.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apple.eawt.Application;
import com.cn.aop.TestAop;
import com.cn.aop.TestAopI;
import com.cn.dto.User;

public class TestSpring {
	
 
 public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	User user=(User) ac.getBean("user");
	System.out.println(user);
	//用接口实现后置通知，必须把切面注入到ioc容器中，在反射的过程中加载了aop
	TestAopI ts=(TestAopI) ac.getBean("testAop");
	ts.testBeforeAop(1);
	ts.testExcepersionAop(1);
	String str=ts.testAround();
	System.out.println("环绕通知强转返回结果为----->"+str);
}
 
}
