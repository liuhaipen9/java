package com.cn.observer.pull;

public class ConCreteSubject extends Subject {
	public String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void change(String status){
		System.out.println("主题状态为:"+status);
		setStatus(status);
		nodifyObservers();
	}
}
