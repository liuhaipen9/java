package com.cn.testenum;

import java.lang.reflect.Method;

public class TestInterface implements Interface1,Interface2{

	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("2222");
	}
	@RocLiu(name="dsaf")
	public void test2(String name){}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Interface2 interface2=new TestInterface();
		Interface1 interface1=new TestInterface();
		interface1.test();
		interface2.test();
		System.out.println(interface1.getClass().getName());
		System.out.println(TestInterface.class.getName());
		System.out.println(TestInterface.class.getMethod("test2",String.class));
		Class<TestInterface> clazz=TestInterface.class;
		Method method=clazz.getMethod("test2", String.class);
		//TestAnnotae testAnnotae=method.getAnnotation((Class<TestInterface>) TestInterface.class)
		System.out.println();
	}

}
