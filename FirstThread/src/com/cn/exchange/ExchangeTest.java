package com.cn.exchange;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExchangeTest {
	//Exchange用于两个线程交换数据使用，场景:遗传算法里需要选出两个人作为交配对象,银行流水对账使用
	private static final Exchanger<String> exgr=new Exchanger<String>();
	private static ExecutorService executorService=Executors.newFixedThreadPool(2);
	public static void main(String[] args) {
		executorService.execute(new Runnable(){
			
			@Override
			public void run() {
				try {
					String A="银行流水A";
					String B=exgr.exchange(A);
					System.out.println("线程A获取B的数据为:"+B);
				} catch (InterruptedException e) {
				
				}	
			}
		}) ;
		
		executorService.execute(new Runnable() {
			
			@Override
			public void run() {
				try {
				String B="银行流水B";
				String A=exgr.exchange("B");
				System.out.println("A和B的数据是否一致:"+A.equals(B)+" A:"+A+" B:"+B);
				} catch (InterruptedException e) {
					
				}	
				
			}
		});
		executorService.shutdown();
	}
}
