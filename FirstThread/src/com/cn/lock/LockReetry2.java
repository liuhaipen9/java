package com.cn.lock;

public class LockReetry2 extends Thread {
	private TestObj testObj;
	 public LockReetry2(TestObj testObj) {
		this.testObj=testObj;
	}
	@Override
	public void run() {
		testObj.print1();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
