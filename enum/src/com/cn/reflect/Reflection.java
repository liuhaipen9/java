package com.cn.reflect;

import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;



enum Explore{
	HEAD,THERE
}
public class Reflection {
	public static Set<String> analyze(Class<?> enumClass){
		System.out.println("----------------analyze enum-----------------");
		System.out.println("------------------anyinface"+enumClass+"----------------------");
		for (Type t:enumClass.getInterfaces()) {
			System.out.println(t);
		}
		System.out.println("Base:"+enumClass.getSuperclass());
		System.out.println("Method: ");
		Set<String> methods=new TreeSet<String>();
		for (java.lang.reflect.Method m:enumClass.getMethods()) {
			methods.add(m.getName());
		}
		System.out.println(methods);
		return methods;
	}
	
	public static void main(String[] args) {
		Set<String> exploreMethodSet=analyze(Explore.class);
		Set<String> enumMethodSet=analyze(Enum.class);
		System.out.println("exploreMethodSet.containsAll(enumMethodSet):"+exploreMethodSet.containsAll(enumMethodSet));
		System.out.println("exploreMethodSet.removeAll(enumMethodSet):");
		exploreMethodSet.removeAll(enumMethodSet);
		System.out.println(exploreMethodSet);
		
	}
}
