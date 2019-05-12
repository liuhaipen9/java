package com.roc.thread;

public class Join extends Thread{
	@Override
		public void run() {
		try {
		int secondValue=(int)(Math.random()*10000);
		System.out.println(secondValue);
		Thread.sleep(secondValue);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Join j=new Join();
		j.start();
		j.join();
		System.out.println("子线程执行完我在执行！！！");
	}
}
