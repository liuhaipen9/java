package com.cn.testSynchronized;

public class StaticThreadFunc {

 public synchronized static void printA(){
	 for (int i = 0; i < 10; i++) {
	System.out.println("===========printA()=============");}
 }
 
 public synchronized static void printB(){
	 for (int i = 0; i < 10; i++) {
		System.out.println("===========printB()=============");}
	}
 
 public synchronized void printC(){
	 for (int i = 0; i < 10; i++) {
 
		System.out.println("===========printC()=============");
	}}
}
