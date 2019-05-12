package com.cn.defaultFunction;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class CADSystem extends Shape {
	private Circle circle;
	private Triangle triangle;
	private Line[] line=new Line[3];

	public CADSystem(int i) {
		super(i);
		for (int j = 0; j < line.length; j++) {
			line[j]=new Line(j, j+1);
		}
		circle=new Circle(1);
		triangle=new Triangle(23);
		// TODO Auto-generated constructor stub
	}
	@Override
	void disPose() {
		for (int i = 0; i < line.length; i++) {
			line[i].disPose();
		}
		circle.disPose();
		triangle.disPose();
		super.disPose();
	}
	public static void main(String[] args) {
		CADSystem cadSystem=new CADSystem(47);
		try {
			
		} finally {
			cadSystem.disPose();
		}
	}

}
