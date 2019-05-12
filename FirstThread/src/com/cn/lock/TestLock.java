package com.cn.lock;

//不要设置全局变量，两个不同的线程内部不是同步的，而是分段执行
class Thread2{
private int num=0;
//方法上面加synchronized锁保证每个线程把方法执行才给另外的线程执行，synchronized是对象锁，两个不同的线程调用这个方法，
//但创建两个Thread2对象时，就有两把锁，所有不存在谁等待谁，但执行的num结果是正确的，结果只是交替了
public synchronized void testName(String name){
	
	if ("a".equals(name)) {
		System.out.println("a arrived test!!!");
		num=100;
	}else {
		System.out.println("b arrived test!!!");
		num=200;
	}
	System.out.println(name+":"+num);
}
}
public class TestLock extends Thread {
	private Thread2 thread2;

	public TestLock(Thread2 thread2){
		this.thread2=thread2;
	}
	
	public void run() {
		thread2.testName("a");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 thread2=new Thread2();
		TestLock2 testLock2=new TestLock2(thread2);
		testLock2.start();
		TestLock testLock=new TestLock(thread2);
		testLock.start();
		
	}

}
