package com.cn.threadpoolexecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPool {
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		final List<Integer> list=new ArrayList<Integer>();
		final Random random=new Random();
		ThreadPoolExecutor tp=new ThreadPoolExecutor(10, 10, 60,TimeUnit.MICROSECONDS, new LinkedBlockingQueue<Runnable>(20000));
		for (int i = 0; i < 2000; i++) {
			tp.execute(new Runnable() {
				
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName());
					list.add(random.nextInt());
					
				}
			});
		}
		
		tp.shutdown();
		try {
			tp.awaitTermination(1, TimeUnit.DAYS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("线程池耗时:"+(System.currentTimeMillis()-startTime));
		System.out.println(list.size());
	}
}
