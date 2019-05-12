package com.cn.readWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockWriteReadTest extends ReentrantReadWriteLock{
	public void read(){
		try {
		readLock().lock();
		System.out.println(Thread.currentThread().getName()+"  当前时间是:"+System.currentTimeMillis());
		
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			readLock().unlock();
		}
	}
	public void write(){
		try {
		writeLock().lock();
		System.out.println(Thread.currentThread().getName()+" 当前时间是:"+System.currentTimeMillis());
		Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			writeLock().unlock();
		}
	}
	public static void main(String[] args) {
		//ReentranLock的读写锁性能比普通的锁高，读读不互斥，读写互斥，写写不互斥
		LockWriteReadTest lockWriteReadTest=new LockWriteReadTest();
//		new Thread(()->{
//			lockWriteReadTest.read();
//		}).start();
//		new Thread(()->{
//			lockWriteReadTest.read();
//		}).start();
		new Thread(()->{
			lockWriteReadTest.write();
		}).start();
		new Thread(()->{
			lockWriteReadTest.write();
		}).start();
	}
}
