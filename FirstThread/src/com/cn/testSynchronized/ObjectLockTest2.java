package com.cn.testSynchronized;

public class ObjectLockTest2 extends Thread {
	private ObjectLock objectLock;
	public ObjectLockTest2(ObjectLock objectLock) {
	   this.objectLock=objectLock;
	}
	@Override
	public void run() {
	   objectLock.MethodB();
	}
}
