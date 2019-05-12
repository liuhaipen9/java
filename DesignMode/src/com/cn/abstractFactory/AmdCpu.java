package com.cn.abstractFactory;

public class AmdCpu implements Cpu {

	private int pains=0;
	public AmdCpu(int pains) {
		this.pains=pains;
	}
	@Override
	public void calculate() {
		System.out.println("amdcpu的针脚数:"+pains);

	}

}
