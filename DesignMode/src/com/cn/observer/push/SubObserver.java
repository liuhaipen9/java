package com.cn.observer.push;

public class SubObserver implements Observer {

	@Override
	public void update(String status) {
		// TODO Auto-generated method stub
		System.out.println("观察者SubObserver状态为:"+status);
	}

}
