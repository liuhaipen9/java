package com.cn.waitAndNotify;

import com.sun.org.apache.bcel.internal.generic.NEW;

class MyWait extends Thread{
	private Object lock;
	private int num;
	public MyWait(Object lock,int num) {
		this.lock = lock;
		this.num=num;
	}

	@Override
	public void run() {
		try {
			synchronized (lock) {
			System.out.println("===========wait时间开始======="+num);
			lock.wait();
			System.out.println("============wait时间结束=============="+num);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class MyNotify extends Thread{
	private Object lock;
	
	public MyNotify(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
		System.out.println("===========notif时间开始=======");
		//notify只能随机唤醒一个线程去等待获取锁，而notifyAll是唤醒所有的线程
		lock.notify();
		//lock.notifyAll();
		System.out.println("===========notify时间结束==============");
		}
	}
}
public class FirstWaitAndNotify {
	public static void main(String[] args) throws InterruptedException {
		Object lock=new Object();
		MyWait myWait=new MyWait(lock,1);
		myWait.start();
		MyWait myWait2=new MyWait(lock, 2);
		myWait2.start();
		Thread.sleep(3000);
		MyNotify myNotify=new MyNotify(lock);
		myNotify.start();
	}
}
