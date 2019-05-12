package com.cn.abstractFactory;

public interface AbstractFactory {
	//创建cpu对象
	public Cpu createCpu();
	
	//创建主版对象
	public MainBoards createMainBoards();
}
