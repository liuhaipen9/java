package com.cn.observer.pull;

import java.util.ArrayList;
import java.util.List;



public abstract class Subject {
	//用来保存注册的观察者对象
	private List<Observer> list=new ArrayList<Observer>();
	
	//注册观察者对象
	
	public void attach(Observer observer){
		list.add(observer);
	}
	//删除一个观察者对象
	public void removeOb(Observer observer){
		list.remove(observer);
	}
	
	//通知所有注册的观察者对象
	public void nodifyObservers(){
		for (Observer observer:list) {
			observer.update((ConCreteSubject)this);
		}
	}

}
