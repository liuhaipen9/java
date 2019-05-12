package com.cn.abstractFactory;

public class IntelCup implements Cpu {
	//cpu的针脚数
	private int pins=0;
	public IntelCup(int pins) {
		this.pins=pins;
	}
	@Override
	public void calculate() {
		System.out.println("intel cpu的针脚数"+pins);
	}

}
