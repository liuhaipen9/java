package com.cn.producerAndCustomer;

public class Customer extends Thread{
	private Object lock;

	public Customer(Object lock) {
		this.lock = lock;
	}
	public void customerTest(){
		synchronized (lock) {
			try {
			if ("".equals(WareHouse.valueString)) {
				lock.wait();
			}
			System.out.println("消费者消费了，编号为:"+WareHouse.valueString);
			WareHouse.valueString="";
			lock.notify();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			}
	}
	
	
	
}
