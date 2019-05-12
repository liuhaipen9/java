package com.cn.firstDynamic;

import java.lang.reflect.Proxy;

public class DynamicClass{
	
	public <T> void test(Class<T> c) throws InstantiationException, IllegalAccessException{
		//Animal animal=new Dog();
		T t=c.newInstance();
		MyInvactionHandle myInvactionHandle=new MyInvactionHandle(t);
		//Class<?>[] clazz=new Class[]{t.getClass()};
		// TODO Auto-generated method stub
		Animal dynamicAnimal=(Animal)Proxy.newProxyInstance(DynamicClass.class.getClassLoader(), t.getClass().getInterfaces(), myInvactionHandle);
		dynamicAnimal.eat();
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		DynamicClass dynamicClass=new DynamicClass();
		dynamicClass.test(Big.class);
//		Animal animal=new Dog();
//		MyInvactionHandle myInvactionHandle=new MyInvactionHandle(animal);
//		Class<?>[] clazz=new Class[]{animal.getClass()};
//		// TODO Auto-generated method stub
//		Animal dynamicAnimal=(Animal)Proxy.newProxyInstance(DynamicClass.class.getClassLoader(), animal.getClass().getInterfaces(), myInvactionHandle);
//		dynamicAnimal.eat();
		//两个方法获取的引用是一样的
//		Class<?> class1=Dog.class;
//		Class<?> class2=Class.forName("com.cn.firstDynamic.Dog");
//		System.out.println(class1+"?==="+class2);
	}

}
