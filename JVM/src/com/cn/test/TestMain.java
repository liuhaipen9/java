package com.cn.test;

public class TestMain {
	public static void main(String[] args) throws Exception {
//		MyClassLoad myClassLoad=new MyClassLoad("load1");
//		Class<?> supper=myClassLoad.loadClass("/Users/liuhaipeng/roc-work/workspace/elipseworkspace/JVM/bin/com/cn/test/SuperClass.class");
//		SuperClass superClass=(SuperClass) supper.newInstance();
		
		new SuperClass();
		System.out.println(new SubClass());
		SuperClass[] scs=new SuperClass[10];
		System.out.println("extension classloader-->>"+System.getProperty("java.ext.dirs"));
	}
}
