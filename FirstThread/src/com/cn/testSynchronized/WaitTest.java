package com.cn.testSynchronized;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class WaitTest extends Thread{
	private List<String> lock;
	private BlockingQueue<String> blockingQueue;
	private String key;
	public WaitTest(List<String> lock,BlockingQueue<String> blockingQueue,String key) {
	    this.lock=lock;
	    this.blockingQueue=blockingQueue;
	    this.key=key;
	}
	@Override
	public void run() {
		synchronized (lock) {
			try {
				
				System.out.println("线程"+Thread.currentThread().getId()+"开始等待");
				if (!key.equals("end")){
					
					blockingQueue.offer(key);
				     lock.wait();
				}
				
			if (key.equals("end")) {
				
				blockingQueue.offer(key);
				lock.notifyAll();
			}
				System.out.println("线程"+Thread.currentThread().getId()+"等待完成");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lock=new ArrayList<String>();
		BlockingQueue<String> blockingQueue=new LinkedBlockingQueue<String>();
		lock.add("start");
		WaitTest waitTest=new WaitTest(lock,blockingQueue,"start");
		
		lock.add("2");
		WaitTest waitTest2=new WaitTest(lock,blockingQueue,"2");
		
		lock.add("3");
		WaitTest waitTest3=new WaitTest(lock,blockingQueue,"3");
		
		
		lock.add("end");
		WaitTest waitTest4=new WaitTest(lock,blockingQueue,"end");
		
		//NotifyAllTest notifyAllTest=new NotifyAllTest(lock);
		waitTest.start();
		waitTest2.start();
		waitTest3.start();
		waitTest4.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String str:blockingQueue) {
			System.out.println("队列里的值为:"+blockingQueue.poll());
		}
		
        
		
		
		//notifyAllTest.start();
	}
}
