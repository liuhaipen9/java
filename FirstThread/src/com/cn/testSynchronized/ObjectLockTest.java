package com.cn.testSynchronized;

public class ObjectLockTest extends Thread{
	private ObjectLock objectLock;
	public ObjectLockTest(ObjectLock objectLock) {
	   this.objectLock=objectLock;
	}
	@Override
	public void run() {
	   objectLock.MethodA();
	}
	public static void main(String[] args) {
		ObjectLock objectLock=new ObjectLock();
		ObjectLockTest objectLockTest=new ObjectLockTest(objectLock);
		objectLockTest.start();
		ObjectLockTest2 objectLockTest2=new ObjectLockTest2(objectLock);
		objectLockTest2.start();
	}
}
