package com.roc.thread;

public class TestException {
	public static void main(String[] args) {
		int[] array=new int[3];
		for (int i = 0; i < 5; i++) {
			try {
				
				System.out.println("当前计时为："+i);
				array[i]=i;
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			
		}
		}
	}
}
