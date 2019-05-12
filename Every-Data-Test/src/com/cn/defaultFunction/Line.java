package com.cn.defaultFunction;

public class Line extends Shape {
	private int start,end;

	public Line(int start,int end) {
		super(start);
		this.start=start;
		this.end=end;
		System.out.println(start+" Line construactor "+end);
		// TODO Auto-generated constructor stub
	}
	void disPose(){
		System.out.println("Line disPose");
		super.disPose();
	}

}
