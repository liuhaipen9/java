package com.cn.testReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ReentrantLockTest2{
	private Lock lock=new ReentrantLock();
	public void test(){
		try {
		lock.lock();
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadName:"+Thread.currentThread().getName());
		}
		
		}finally {
			lock.unlock();
		}
	}
	public void test2(){
		synchronized (this) {
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadName:"+Thread.currentThread().getName());
		}
		}
	}
}

class MyInvokeClass extends Thread{
	private ReentrantLockTest2 reentrantLockTest2;
	
	public MyInvokeClass(com.cn.testReentrantLock.ReentrantLockTest2 reentrantLockTest2) {
		this.reentrantLockTest2 = reentrantLockTest2;
	}

	@Override
	public void run() {
		reentrantLockTest2.test();
	}}

class MyInvoke2Class extends Thread{
private ReentrantLockTest2 reentrantLockTest2;
	
	public MyInvoke2Class(com.cn.testReentrantLock.ReentrantLockTest2 reentrantLockTest2) {
		this.reentrantLockTest2 = reentrantLockTest2;
	}
	@Override
	public void run() {
		reentrantLockTest2.test2();
	}
}
public class ProveReentrantLock {
	public static void main(String[] args) {
		ReentrantLockTest2 reentrantLockTest2=new ReentrantLockTest2();
		MyInvoke2Class myInvoke2Class=new MyInvoke2Class(reentrantLockTest2);
		myInvoke2Class.start();
		MyInvokeClass myInvokeClass=new MyInvokeClass(reentrantLockTest2);
		myInvokeClass.start();
		
		
	}
}
