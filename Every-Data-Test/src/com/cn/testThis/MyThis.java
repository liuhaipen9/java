package com.cn.testThis;

public class MyThis {
	public void test2(){
		System.out.println("==============");
	}
	public void test(){
		System.out.println(this);
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		MyThis myThis=new MyThis();
		myThis.test();
		MyThis.class.newInstance().test2();
		System.out.println(MyThis.class.newInstance());
	}
}
