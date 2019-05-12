package com.cn.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import com.sun.java_cup.internal.runtime.virtual_parse_stack;

public class FirstMap {
	public static void test(){
		Map<String, String> map=new HashMap<String, String>();
		map.put(null, null);
		map.put("key", "value");
		map.forEach((k,v)->{System.out.println("key:"+k+":"+"value:"+v);});
	
	}
	public static void test2(){
		long startTime=System.currentTimeMillis();
		Map<Integer, String> map=new HashMap<Integer, String>();
		for (int i = 0; i < 20000000; i++) {
			map.put(i, "test");
		}
		map.forEach((k,v)->{});
		System.out.println("lambda遍历耗时:"+(System.currentTimeMillis()-startTime));
	}
	
	public static void test3(){
		long startTime=System.currentTimeMillis();
		Map<Integer, String> map=new HashMap<Integer, String>();
		for (int i = 0; i < 20000000; i++) {
			map.put(i, "test");
		}
		for (Map.Entry<Integer, String> e:map.entrySet()) {
			//System.out.println("key:"+e.getKey()+":"+"value:"+e.getValue());
		}
		System.out.println("普通遍历耗时:"+(System.currentTimeMillis()-startTime));
	}
	
	public static void test4(){
		long startTime=System.currentTimeMillis();
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < 20000; i++) {
			list.add(i);
		}
		list.forEach(v->{});
		System.out.println("lambda遍历耗时:"+(System.currentTimeMillis()-startTime));
	}
	
	public static void test5(){
		long startTime=System.currentTimeMillis();
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < 20000; i++) {
			list.add(i);
		}
		for (Integer ii:list) {
			
		}
		System.out.println("普通遍历耗时:"+(System.currentTimeMillis()-startTime));
	}
	
	public static void test6(){
		Map<String, String> map=new Hashtable<String, String>();
		//map.put(null, "sadf");//Hashtable不能为空
		map.put("RocLiu", "Value");
		map.forEach((k,v)->{System.out.println(k+":"+v);});
	}
	public static void main(String[] args) {
		//结论maplambda表达式的遍历速度远小于普通的遍历,list 也是一样，list数据大点还好
		//test();
		//test2();
		//test3();
		//test4();
		//test5();
		test6();
	}
}
