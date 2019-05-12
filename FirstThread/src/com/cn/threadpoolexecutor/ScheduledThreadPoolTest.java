package com.cn.threadpoolexecutor;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest {

	public static void main(String[] args) throws InterruptedException {
		//创建大小为5的线程池
		ScheduledExecutorService scheduledExecutorService=Executors.newScheduledThreadPool(5);
		for (int i = 0; i <3; i++) {
			Task work=new Task("task-"+i);
			scheduledExecutorService.scheduleAtFixedRate(work, 0, 5, TimeUnit.SECONDS);
			
		}
		Thread.sleep(10000);
		System.out.println("shutting down executor....");
		scheduledExecutorService.shutdown();
		boolean isDone;
		do {
			isDone=scheduledExecutorService.awaitTermination(1, TimeUnit.DAYS);
			System.out.println("awaitTermination...");
		} while (!isDone);
			System.out.println("Finished all threads");
		

	}

}
class Task implements Runnable{
	private String name;
	public Task(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		System.out.println("name:"+name+"   "+"startTime:"+new Date());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("name:"+name+" "+"endTime:"+new Date());
		
	}
	
}