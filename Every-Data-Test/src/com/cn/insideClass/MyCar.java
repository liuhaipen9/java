package com.cn.insideClass;

public class MyCar {
	public MyCar(){
		System.out.println("MyCar");
	}
	public class InsideClass{
		public InsideClass(){
			System.out.println("insideClass");
		}
	}
	public InsideClass getInsideClass(){
		return new InsideClass();
	}
	public static void main(String[] args) {
		MyCar myCar=new MyCar();
		MyCar.InsideClass insideClass=myCar.getInsideClass();
	}
}
