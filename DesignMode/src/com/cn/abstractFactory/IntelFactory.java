package com.cn.abstractFactory;

public class IntelFactory implements AbstractFactory {

	@Override
	public Cpu createCpu() {
		// TODO Auto-generated method stub
		return new IntelCup(755);
	}

	@Override
	public MainBoards createMainBoards() {
		// TODO Auto-generated method stub
		return new IntelMainBoard(755);
	}

}
