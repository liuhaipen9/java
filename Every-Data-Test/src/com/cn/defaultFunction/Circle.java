package com.cn.defaultFunction;

public class Circle extends Shape {
	private int i;
	public Circle(int i) {
		super(i);
		this.i=i;
		System.out.println("Circle constructor");
	}
	void disPost(){
		System.out.println("Circle disPost");
		super.disPose();
	}

}
