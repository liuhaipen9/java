package com.cn.waitAndNotify;


class MyThread3 extends Thread{
	private Object lock;
	
	public MyThread3(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		try {
		synchronized (lock) {
			
			System.out.println("===========wait start==========");
				lock.wait();
			System.out.println("=============wait end================");
		
		}} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("wait()被interrupt()打断了!!!!");
			e.printStackTrace();
		}
	}
}

public class TestInterrupt {
	
	public static void main(String[] args) throws InterruptedException {
		Object lock=new Object();
		MyThread3 myThread=new MyThread3(lock);
		myThread.start();
		Thread.sleep(5000);
		myThread.interrupt();
	}
	
}
