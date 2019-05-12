package com.cn.abstractFactory;

public class IntelMainBoard implements MainBoards {
	private int cpuHoles=0;
	public IntelMainBoard(int cpuHoles) {
		this.cpuHoles=cpuHoles;
	}
	@Override
	public void installCPU() {
		System.out.println("intel主版的插槽数:"+cpuHoles);

	}

}
