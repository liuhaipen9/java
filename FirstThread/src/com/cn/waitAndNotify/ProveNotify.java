package com.cn.waitAndNotify;


class MyThread extends Thread{
	private Object lock;
	
	public MyThread(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			try {
			System.out.println("===========wait start==========");
				lock.wait();
			System.out.println("=============wait end================");
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
class MyThread2 extends Thread{
	private Object lock;
	
	public MyThread2(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			try {
			System.out.println("===========wait start==========");
			lock.notify();
			Thread.sleep(50000);
		   System.out.println("=============wait end================");
		} catch (Exception e) {
			// TODO: handle exception
		}}
	}
}
public class ProveNotify {
	
	public static void main(String[] args) {
		Object lock=new Object();
		MyThread myThread=new MyThread(lock);
		myThread.start();
		MyNotify myNotify=new MyNotify(lock);
		myNotify.start();
	}
	
}
