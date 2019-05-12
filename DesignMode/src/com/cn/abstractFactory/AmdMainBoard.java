package com.cn.abstractFactory;

public class AmdMainBoard implements MainBoards {
	private int amdHotel=0;
	public AmdMainBoard(int amdHotel) {
		this.amdHotel=amdHotel;
	}
	@Override
	public void installCPU() {
	System.out.println("amd主版上的插槽数:"+amdHotel);

	}

}
