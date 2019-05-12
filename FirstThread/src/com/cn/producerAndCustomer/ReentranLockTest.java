package com.cn.producerAndCustomer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentranLockTest extends ReentrantLock{
	Condition condition=newCondition();
	public void get(){
		try{
		lock();
		if ("".equals(WareHouse.valueString)) {
			condition.await();
		}
		System.out.println("当前线程消费了,编号为:"+WareHouse.valueString);
		WareHouse.valueString="";
		condition.notify();
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			unlock();
		}
		
	}
	public void set(){
		try{
			lock();
			if (!"".equals(WareHouse.valueString)) {
				condition.await();
			}
			String str=String.valueOf(System.currentTimeMillis());
			WareHouse.valueString=str;
			System.out.println("当前线程生产了,编号为:"+WareHouse.valueString);
			condition.notify();
			}catch (Exception e) {
				// TODO: handle exception
			}finally {
				unlock();
			}
			
	}
	
	public static void main(String[] args) {
		ReentranLockTest reentranLockTest=new ReentranLockTest();
		new Thread(()->{
			while (true) {
			reentranLockTest.set();
				
			}
		}).start();
		new Thread(()->{
			reentranLockTest.get();
		}
				).start();
	}
}
