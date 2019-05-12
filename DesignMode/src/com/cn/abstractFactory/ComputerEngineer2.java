package com.cn.abstractFactory;

public class ComputerEngineer2 {
	
	private Cpu cpu=null;
	private MainBoards mainBoards=null;
	
	
	public void makeComputer(AbstractFactory abstractFactory){
		prepareHardwares(abstractFactory);
	}
	
	private void prepareHardwares(AbstractFactory abstractFactory){

		this.cpu=abstractFactory.createCpu();
		this.mainBoards=abstractFactory.createMainBoards();
		
		this.cpu.calculate();
		this.mainBoards.installCPU();
	}

}
