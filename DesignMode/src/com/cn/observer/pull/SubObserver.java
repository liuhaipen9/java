package com.cn.observer.pull;

public class SubObserver implements Observer {
	private String observerStatus;
	@Override
	public String update(ConCreteSubject subject) {
		// TODO Auto-generated method stub
		observerStatus=subject.getStatus();
		//System.out.println("观察者SubObserver状态为:"+observerStatus);
		return observerStatus;
	}
	
}
