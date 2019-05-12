package com.cn.testReentrantLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ReentrantLockTest4{
	private Lock lock=new ReentrantLock();
	private Condition condition=lock.newCondition();
	public void test(){
		try {
		lock.lock();
			System.out.println("ThreadName:"+Thread.currentThread().getName());
				condition.await();
				System.out.println(Thread.currentThread().getName()+" 执行完毕!!!");
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	public void test2(){
		try {
			lock.lock();
			System.out.println("ThreadName:"+Thread.currentThread().getName());
			condition.signal();
		}finally {
			lock.unlock();
		}
	}
}

class MyInvokeClass2 extends Thread{
	private ReentrantLockTest4 reentrantLockTest4;
	
	
	public MyInvokeClass2(ReentrantLockTest4 reentrantLockTest4) {
		super();
		this.reentrantLockTest4 = reentrantLockTest4;
	}


	@Override
	public void run() {
		reentrantLockTest4.test();
	}}

class MyInvokeClass3 extends Thread{
private ReentrantLockTest4 reentrantLockTest4;
	
	
	public MyInvokeClass3(ReentrantLockTest4 reentrantLockTest4) {
	super();
	this.reentrantLockTest4 = reentrantLockTest4;
}


	@Override
	public void run() {
		reentrantLockTest4.test2();
	}
}
//不管是sysnchronized还是lock（ReentranLock可以指定唤醒谁） wait，signal,wait,notify都要在锁里面执行
public class MyAwaitAndSignal {
	public static void main(String[] args) {
		ReentrantLockTest4 reentrantLockTest4=new ReentrantLockTest4();
		MyInvokeClass2 myInvokeClass2=new MyInvokeClass2(reentrantLockTest4);
		myInvokeClass2.start();
		MyInvokeClass3 myInvokeClass3=new MyInvokeClass3(reentrantLockTest4);
		myInvokeClass3.start();
		
		
	}
}
