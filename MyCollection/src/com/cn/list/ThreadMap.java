package com.cn.list;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class A extends Thread{
	Map<Integer, Integer> map=new HashMap<Integer, Integer>();
	private static AtomicInteger ai = new AtomicInteger(0);
	@Override
	public void run() {
		while (true) {
		map.put(ai.get(), ai.get());
		ai.incrementAndGet();
		}
	}
}
public class ThreadMap {
	public static void main(String[] args) {
		A a=new A();
		A a2=new A();
		A a3=new A();
		A a4=new A();
		A a5=new A();
		a.start();
		a2.start();
		a3.start();
		a4.start();
		a5.start();
	}
}
