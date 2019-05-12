package com.roc.thread;

public class TestYield extends Thread {
	
	
	public void run() {
		long startTime=System.currentTimeMillis();
		int count=0;
		
			
		for (int i = 0; i < 50000; i++) {
			Thread.yield();
			  count=count+i;
		}
	
		long endTime=System.currentTimeMillis();
		System.out.println("用时："+(endTime-startTime));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestYield testYield=new TestYield();
		testYield.start();
	}

}
