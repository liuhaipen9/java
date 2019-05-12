package com.cn.testSynchronized;

public class AtomicityThreadTest extends Thread {
	
	private AtomicityThread atomicityThread;
	private AtomicityThreadTest(AtomicityThread atomicityThread){
	this.atomicityThread=atomicityThread;	
	}
	@Override
	public void run() {
		atomicityThread.addNum();
	}
	public static void main(String[] args) {
		try {
			
		
		AtomicityThread atomicityThread=new AtomicityThread();
		AtomicityThreadTest[] atomicityThreadTest=new AtomicityThreadTest[5];
		for (int i = 0; i < atomicityThreadTest.length; i++) {
			atomicityThreadTest[i]=new AtomicityThreadTest(atomicityThread);
		}
		for (int i = 0; i < atomicityThreadTest.length; i++) {
			atomicityThreadTest[i].start();
		}
		Thread.sleep(1000);
		System.out.println(AtomicityThread.aInteger.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
