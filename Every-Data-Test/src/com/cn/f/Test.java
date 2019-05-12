package com.cn.f;

public class Test {
	public static void test(){
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i==5) {
					System.out.println("return"+i);
					return;	
				}
				System.out.println(i);
			
			}
		}
		
	}
	public static void test2(int i) {
		for (int j = 0; j < 10; j++) {
			if (i==5) {
				System.out.println("return"+i);
				return;	
			}
			System.out.println(i);
		
		}
	}
	
	public static void test3() {
		System.out.println("start");
		test();
		System.out.println("end");
	}
	
	public static void main(String[] args) {
		test3();
	}
}
