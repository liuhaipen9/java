package com.cn.list;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(5);
		set.add(3);
	  set.forEach(key->{System.out.println(key);});
		System.out.println();
	}
}
