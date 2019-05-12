package com.cn.abstractFactory;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ComputerEngineer2 computerEngineer2=new ComputerEngineer2();
			
			AbstractFactory abstractFactory=new IntelFactory();
			
		computerEngineer2.makeComputer(abstractFactory);
	}

}
