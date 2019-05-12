package com.cn.lock;

public class TestObj {
	public synchronized void print1(){
		System.out.println("print1 out name:"+Thread.currentThread().getName());
		print2();
	}
	
	public synchronized void print2(){
		System.out.println("print2 out");
		print3();
	}
	
	public synchronized void print3(){
		System.out.println("print3 out");
	
	}
	
}
