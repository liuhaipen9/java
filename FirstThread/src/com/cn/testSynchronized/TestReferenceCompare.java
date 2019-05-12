package com.cn.testSynchronized;

public class TestReferenceCompare {
 public static void main(String[] args) {
	TestObj testObj=new TestObj();
	TestObj testObj2=new TestObj();
	System.out.println(testObj==testObj2);
	//两个相同类对象equals为什么返回的是false
	System.out.println(testObj.equals(testObj2));
 }
}
