package com.cn.testSynchronized;

public class TestVolatile extends Thread{
	//volatile可以保证线程工作内存和主内存数据一致，保证了线程的可见性，不能保证原子性
 private volatile boolean isRuning=true;
 public boolean isRuning(){
	 return isRuning;
 }
 
public  void setRuning(boolean isRuning) {
	this.isRuning = isRuning;
}

@Override
public void run() {
	System.out.println("进入了run方法");
	while(isRuning==true){}
		System.out.println("runing方法停止了");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		TestVolatile testVolatile=new TestVolatile();
		testVolatile.start();
		testVolatile.setRuning(false);
		sleep(1000);
		System.out.println("runing被赋值false了");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
