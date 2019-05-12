package com.cn.observer.push;

public class MainTest {

	public static void main(String[] args) {
		// 观察者被动的获取被观察者的信息
		//定义一个观察者
		Observer observer=new SubObserver();
		Observer observer2=new SubObserver2();
		//定义一个被观察者,不能用Subject去接，不然只能用Subject里面的方法
		ConCreteSubject subject=new ConCreteSubject();
		subject.attach(observer);
		subject.attach(observer2);
		
		subject.change("1001");
		
		
		
	}

}
