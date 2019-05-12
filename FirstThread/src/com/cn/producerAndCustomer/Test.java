package com.cn.producerAndCustomer;



public class Test {
	public static void main(String[] args) throws InterruptedException {
		Object lock=new Object();
		Producer producer=new Producer(lock);
		Customer customer=new Customer(lock);
		
			Thread thread=new Thread(()->{while(true){producer.produceTest();}});
			Thread thread2=new Thread(()->{while(true){customer.customerTest();}});
			thread.start();
			thread2.start();
		
	}
}
