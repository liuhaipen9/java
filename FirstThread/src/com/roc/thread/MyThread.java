package com.roc.thread;


class FirstT extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
	}
}
public class MyThread {

public static void main(String[] args) {
	FirstT firstT=new FirstT();
	
//	Thread t1=new Thread(firstT);
//	Thread t2=new Thread(firstT);
//	t1.start();
//	t2.start();
	new Thread(()->{System.out.println("sdaf");}).start();
	new Thread(()->{System.out.println("abc");}).start();
}
}
