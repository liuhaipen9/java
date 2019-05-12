package com.cn.list;

import java.util.ArrayList;
import java.util.List;

public class FirstList {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add(null);
		list.add("first");
		System.out.println(list.size());
		System.out.println(list.get(0));
		
	}
}
