package com.cn.string;

public class StringHandler {
	public static void main(String[] args) {
		String str="刘海鹏";
		System.out.println(str.substring(0, 1));
		System.out.println(str.substring(1));
		System.out.println(str.startsWith("刘"));
		System.out.println(str.endsWith("海鹏"));
		System.out.println(str.indexOf("海"));
	}
}
