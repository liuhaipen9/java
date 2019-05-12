package com.cn.testReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.sun.org.apache.bcel.internal.generic.NEW;

class ReentrantLockTest{
	private Lock lock=new ReentrantLock();
	public void test(){
		try {
		
		lock.lock();
		for (int i = 0; i < 10; i++) {
			System.out.println("当前线程为:"+Thread.currentThread().getName());
		}
		
		}
		finally{
			lock.unlock();
		}
	}
	
}
class MyThread extends Thread{
	private ReentrantLockTest reentrantLockTest;
	
	public MyThread(ReentrantLockTest reentrantLockTest) {
		this.reentrantLockTest = reentrantLockTest;
	}

	public void run() {
		reentrantLockTest.test();
	};
}
public class MyReentrantLock {

	public static void main(String[] args) {
		ReentrantLockTest reentrantLockTest=new ReentrantLockTest();
		MyThread myThread=new MyThread(reentrantLockTest);
		MyThread myThread2=new MyThread(reentrantLockTest);
		myThread.start();
		myThread2.start();

	}

}
