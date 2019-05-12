package com.cn.lock;


public class MyThread17 extends Thread {
	private ThreadDomain17 threadDomain17;
	public MyThread17(ThreadDomain17 threadDomain17) {
		this.threadDomain17=threadDomain17;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		threadDomain17.testMethod();
	}
	public static void main(String[] args) {
		//只要一个线程出现问题，其它的线程就不能获取锁，整个程序就奔了
		ThreadDomain17 threadDomain17=new ThreadDomain17();
		MyThread17 myThread17=new MyThread17(threadDomain17);
		myThread17.start();
		MyThread17 myThread172=new MyThread17(threadDomain17);
		myThread172.start();
	}
}
