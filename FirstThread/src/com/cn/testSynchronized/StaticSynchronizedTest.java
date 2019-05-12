package com.cn.testSynchronized;

//static方法加锁是类锁，非静态的是对象锁。属于两个不同的锁
class StaticSynchronizedTest2 extends Thread{
	
	@Override
	public void run() {
		StaticThreadFunc.printB();
	}
}

class StaticSynchronizedTest3 extends Thread{
	private StaticThreadFunc staticThreadFunc;
	public StaticSynchronizedTest3(StaticThreadFunc staticThreadFunc) {
		this.staticThreadFunc=staticThreadFunc;
	}
	@Override
	public void run() {
		staticThreadFunc.printC();
	}
}
public class StaticSynchronizedTest extends Thread {

	@Override
	public void run() {
		StaticThreadFunc.printA();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticThreadFunc staticThreadFunc=new StaticThreadFunc();
		
		
		StaticSynchronizedTest staticSynchronizedTest=new StaticSynchronizedTest();
		StaticSynchronizedTest2 staticSynchronizedTest2=new StaticSynchronizedTest2();
		StaticSynchronizedTest3 staticSynchronizedTest3=new StaticSynchronizedTest3(staticThreadFunc);
		
		staticSynchronizedTest.start();
		staticSynchronizedTest2.start();
		staticSynchronizedTest3.start();
		
	}

}
