package com.cn.adaptive;


public class TestF {
	public <T> T GetInstance(T t){
		return t;
	}
	public static void main(String[] args) {
		TestF testF=new TestF();
		String s=testF.GetInstance("a");
		System.out.println(s);
	}
}
