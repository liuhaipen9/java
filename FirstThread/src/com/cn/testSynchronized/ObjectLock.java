package com.cn.testSynchronized;

public class ObjectLock {
 public synchronized void MethodA(){
	 for (int i = 0; i < 10; i++) {
		 System.out.println("=================MethodA================"+(i));
	}
	
 }
 
 public void MethodB(){
	 synchronized (this) {
		 for (int i = 0; i < 10; i++) {
			 System.out.println("==============MethodB==================="+(i));
			}
		}
		
 }
}
