package com.cn.other;

public class TestInterrupt extends Thread{
	int i=0;
	@Override
	public void run() {
		while (true) {
		if (Thread.currentThread().isInterrupted()) {
			System.out.println("当前线程中断了!!! "+(i++));
			return;
		}else {
			System.out.println("当前线程没有中断！！！"+(i++));
		}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		TestInterrupt t=new TestInterrupt();
		t.start();
		t.sleep(5000);
		t.interrupt();
		System.out.println("线程中断了，程序到这里了！！");
	}
}
