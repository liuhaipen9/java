package com.cn.single;

public class Test {
	public static void main(String[] args) {
		Test test=new Test();
		Test test2=new Test();
		System.out.println(test==test2);
		System.out.println(TestEnum.TSET.name());
	}
}
