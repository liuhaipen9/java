package com.cn.lock;

public class TestLock2 extends Thread {
	private Thread2 thread2;
	public TestLock2(Thread2 thread2) {
		this.thread2=thread2;
	}
	@Override
	public void run() {
	thread2.testName("b");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
