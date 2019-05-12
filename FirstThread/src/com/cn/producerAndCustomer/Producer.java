package com.cn.producerAndCustomer;

public class Producer {
	private Object lock;

	public Producer(Object lock) {
		this.lock = lock;
	}
	public void produceTest(){
		try {
		synchronized (lock) {
			if (!"".equals(WareHouse.valueString)) {
					lock.wait();
			}
			String str=Thread.currentThread().getName()+"_"+String.valueOf(System.currentTimeMillis());
			WareHouse.valueString=str;
			System.out.println("生产完毕,编号为:"+WareHouse.valueString);
			lock.notify();
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
	
	
}
