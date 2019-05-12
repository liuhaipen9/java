package com.cn.threadpoolexecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyThread {
	public static void main(String[] args) {
		long starttime=System.currentTimeMillis();
		final Random random=new Random();
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < 2000; i++) {
			new Thread(()->{
				System.out.println(Thread.currentThread().getName());
				list.add(random.nextInt());
			}).start();
		}
		
		System.out.println("普通线程耗时:"+(System.currentTimeMillis()-starttime));
		System.out.println(list.size());
	}
}
