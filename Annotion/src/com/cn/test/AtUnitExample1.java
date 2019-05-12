package com.cn.test;

import com.cn.firstannotion.Test;

public class AtUnitExample1 {
	public String methodOne(){
		return "This is methodOne";
	}
	public int methodTwo(){
		System.out.println("This is methodTwo");
		return 2;
	}
	@Test boolean methodOneTest(){
		return methodOne().equals("This is methodOne");
	}
	@Test boolean m2(){
		return methodTwo()==2;
	}
	@Test private boolean m3(){
		return true;
	}
	public static void main(String[] args){
		
	}
}
