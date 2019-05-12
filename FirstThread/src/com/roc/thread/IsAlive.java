package com.roc.thread;

public class IsAlive extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("当前线程活跃状态:"+Thread.currentThread().isAlive());
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		IsAlive isAlive=new IsAlive();
		System.out.println("begin:"+isAlive.isAlive());
		isAlive.start();
		sleep(10);
		System.out.println("begin:"+isAlive.isAlive());
	}

}
