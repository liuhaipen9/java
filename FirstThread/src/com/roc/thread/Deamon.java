package com.roc.thread;

public class Deamon extends Thread{
	private int i=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		while (true) {
			System.out.println("i= "+(i++));
			Thread.sleep(1000);
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Deamon deamon=new Deamon();
		deamon.setDaemon(true);
		deamon.start();
		Thread.sleep(5000);
		System.out.println("我是守护线程，主线程运行完了，就打印完了！！！");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
