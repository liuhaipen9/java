package com.cn.lambda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sound.sampled.LineListener;

public class LoogListTest {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < 100000; i++) 
			list.add(i);
		Long start=System.currentTimeMillis();
			for (Integer i:list) {
				i.toString();
			}
			Long end=System.currentTimeMillis();
			System.out.println(end-start);

	}

}
