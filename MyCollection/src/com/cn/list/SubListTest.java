package com.cn.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SubListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		List list2=list.subList(0, 3);
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		//subList转成list2，list2表示list的引用本身或者list的子集
		System.out.println(list.equals(list2));
		System.out.println(Arrays.asList(list2));
		List<String> list3=new ArrayList<String>();
		Collections.addAll(list3, "hello world !".split(" "));
		for (String str:list3) {
			System.out.println("测试collections--->>"+str);
			
		}
		
		for (Map.Entry entry:System.getenv().entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}

}
