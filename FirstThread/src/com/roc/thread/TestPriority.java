package com.roc.thread;

class Thread1 extends Thread{
	@Override
	public void run() {
		System.out.println("Thread1: "+this.getPriority());
		System.out.println("Thread1========"+this.getName());
	}
}
class Thread2 extends Thread{
	@Override
	public void run() {
		System.out.println("Thread2: "+this.getPriority());
		/*Thread1 thread1=new Thread1();
		thread1.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("test run:"+i);
		}*/
	}
	
}
/*
 * 两个不同的资源组成得线程，只有多个线程请求一个资源的时候才是无序的
 */
public class TestPriority{
	/**
	 * 现场设置优先级为什么没有用
	 */
	public static void main(String[] args) {
		
		TestPriority t= new TestPriority();
		System.out.println("main run "+Thread.currentThread().getPriority());
		Thread1 thread1=new Thread1();
		thread1.setPriority(1);
		thread1.start();
		/*Thread1 thread3=new Thread1();
		thread3.start();*/
		
		Thread2 thread2=new Thread2();
		thread2.setPriority(6);
		thread2.start();
		
		
	}
}
