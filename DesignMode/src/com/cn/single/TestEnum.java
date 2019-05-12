package com.cn.single;

public enum TestEnum {
	TSET;
	//枚举中一定会调用构造方法
	private TestEnum(){
		System.out.println("testEnum....");
	}
}
