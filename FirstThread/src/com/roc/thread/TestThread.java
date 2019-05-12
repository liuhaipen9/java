package com.roc.thread;

public class TestThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		for (int i = 0; i < 5; i++) {
				Thread.sleep(50);
				System.out.println("run= "+Thread.currentThread().getName());
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread testThread=new TestThread();
		testThread.start();
		TestThread testThread2=new TestThread();
		testThread2.start();
		TestThread testThread3=new TestThread();
		testThread3.start();
		
//			try {
//				for (int i = 0; i < 5; i++) {
//				Thread.sleep(50);
//				System.out.println("run= "+Thread.currentThread().getName());
//				}
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
	}

}
