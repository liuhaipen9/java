package com.cn.observer.push;

public class SubObserver2 implements Observer {

	@Override
	public void update(String status) {
		// TODO Auto-generated method stub
		System.out.println("观察者SubObserver2状态为:"+status);
	}

}
