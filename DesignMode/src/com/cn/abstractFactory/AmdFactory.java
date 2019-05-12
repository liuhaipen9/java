package com.cn.abstractFactory;

public class AmdFactory implements AbstractFactory {

	@Override
	public Cpu createCpu() {
		// TODO Auto-generated method stub
		return new AmdCpu(938);
	}

	@Override
	public MainBoards createMainBoards() {
		// TODO Auto-generated method stub
		return new AmdMainBoard(938);
	}

}
