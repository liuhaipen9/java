package com.cn.aop;

public class TestAop implements TestAopI{
	@Override
	public void testBeforeAop(int i){
		 System.out.println("执行testBeforeAop方法");
	 }

	
	public void testExcepersionAop(int i) {
		// TODO Auto-generated method stub
	//int[] is=new int[2];
	//is[3]=5;
	System.out.println("执行aoptestExcepersionAop方法");
	}


	@Override
	public String testAround() {
		// TODO Auto-generated method stub
		System.out.println("执行了环绕通知");
		return "liuhp";
	}

	

	
}
