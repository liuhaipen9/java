package com.cn.testSynchronized;

import java.util.concurrent.atomic.AtomicInteger;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class AtomicityThread {
	public static AtomicInteger aInteger=new AtomicInteger();
	public synchronized void addNum(){
		System.out.println(Thread.currentThread().getName()+"加了100之后的结果:"+aInteger.addAndGet(100));
		aInteger.getAndAdd(1);
	}
}
