package com.cn.lock;

public class LockReetry extends Thread {
	private TestObj testObj;
 public LockReetry(TestObj testObj) {
	this.testObj=testObj;
}
	@Override
	public void run() {
	testObj.print1();
		
	}
	public static void main(String[] args) {
		TestObj testObj=new TestObj();
		LockReetry lockReetry=new LockReetry(testObj);
		lockReetry.start();
		LockReetry2 lockReetry2=new LockReetry2(testObj);
		lockReetry2.start();
	}
}
