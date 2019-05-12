package com.cn.lambda;

 
 public class LambdaTest {
	public void test(FirstLambdaInterface firstLambdaInterface){
		firstLambdaInterface.test();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("第一个lambda");
		FirstLambdaInterface firstLambdaInterface=()->System.out.println("第一个lambda");
		LambdaTest lambdaTest=new LambdaTest();
		lambdaTest.test(()->System.out.println("第二个lambda"));
	
	}

}
