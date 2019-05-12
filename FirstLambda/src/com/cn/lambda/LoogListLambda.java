package com.cn.lambda;

import java.util.ArrayList;
import java.util.List;

public class LoogListLambda {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < 1000000; i++) 
			list.add(i);
		Long start=System.currentTimeMillis();
			list.forEach(i->i.toString());
			Long end=System.currentTimeMillis();
			System.out.println(end-start);
	}
}
