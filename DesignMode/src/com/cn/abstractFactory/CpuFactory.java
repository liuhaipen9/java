package com.cn.abstractFactory;

public class CpuFactory {
	public static Cpu createCpu(int type){
		Cpu cpu=null;
		if(type==1){
			cpu=new IntelCup(755);
		}else if(type==2){
			cpu=new IntelCup(938);
		}
		
		return cpu;
	}
}
