package com.cn.MyClass;

import java.util.HashSet;
import java.util.Set;

public class Category {
	
	static{
		System.out.println("static");
	}
	public Category() {
		System.out.println("this is category");
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		//反射也是可以调用类的构造器的,要newInstance才会初始化
		//Class<?> clazz=Class.forName("com.cn.MyClass.Category");
		//Category category=(Category) clazz.newInstance();
		
		
		Class<?>clazz2=Category.class;
		Category category2=(Category) clazz2.newInstance();
		Set set=new HashSet();
		
	}

}
