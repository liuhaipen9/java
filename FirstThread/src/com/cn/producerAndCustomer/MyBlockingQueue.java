package com.cn.producerAndCustomer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//BlockingQueue区别synchronized和reentranlock,底层已经做了同步和缓存的效果，性能得到了提升，缓存可以放多个线程
public class MyBlockingQueue {
	public static void main(String[] args) {
		final BlockingQueue<String> bq=new ArrayBlockingQueue<String>(10);
		Runnable producer=new Runnable() {
			int i=0;
			@Override
			
			public void run() {
				try {
				while (true) {
					System.out.println("我生产了:"+(++i));
					
						bq.put(i+" ");
					Thread.sleep(1000);
					
				}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		
		Runnable customeRunnable=new Runnable() {
			
			@Override
			public void run() {
				try {
					while (true) {
						System.out.println("我消费了:"+bq.take());
				
						Thread.sleep(1000);
						
					}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
		};
		Thread t1=new Thread(producer);
		Thread t2=new Thread(customeRunnable);
		t1.start();
		t2.start();
	}
}
