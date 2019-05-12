package com.roc.thread;

public class Testinterrupt extends Thread{
	
@Override
public void run() {
	for (int i = 0; i < 5000; i++) {
		System.out.println(i);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testinterrupt testinterrupt=new Testinterrupt();
		testinterrupt.start();
		System.out.println("运行完interupt方法了");
		testinterrupt.interrupt();
		
	}

}
