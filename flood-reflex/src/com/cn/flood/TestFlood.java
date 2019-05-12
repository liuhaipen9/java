package com.cn.flood;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestFlood {
	//super表示只能引用上级类或者本身，extend可以使用上级类和其子类或者实现类
	public <T> void getApple(List<? extends IFruit> list){
		System.out.println(Arrays.asList(list));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple=new Apple();
		Pear pear=new Pear();
		TestFlood testFlood=new TestFlood();
		List<Apple> apples=new ArrayList<Apple>();
		List<Pear> pears=new ArrayList<Pear>();
		apples.add(apple);
		pears.add(pear);
		testFlood.getApple(apples);
		testFlood.getApple(pears);
	}

}
