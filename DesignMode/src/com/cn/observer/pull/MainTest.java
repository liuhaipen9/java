package com.cn.observer.pull;

public class MainTest {

	public static void main(String[] args) {
		//定义拉模型更灵活，观察者想拉就拉，这种和jdk提供的观察者模型差不多，被观察者继承抽象类Observable，观察者实现接口Observer，不同的是jdk加了锁保证线程安全
		//定义一个观察者
		Observer observer=new SubObserver();
		Observer observer2=new SubObserver2();
		//定义一个被观察者,不能用Subject去接，不然只能用Subject里面的方法
		ConCreteSubject subject=new ConCreteSubject();
		subject.attach(observer);
		subject.attach(observer2);
		
		subject.change("1001");
		
		String status=observer.update(subject);
		System.out.println("观察者SubObserver状态为:"+status);
		
		String status2=observer2.update(subject);
		System.out.println("观察者SubObserve2r状态为:"+status2);
		
		
	}

}
