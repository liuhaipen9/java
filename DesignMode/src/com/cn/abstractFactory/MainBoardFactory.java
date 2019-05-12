package com.cn.abstractFactory;

public class MainBoardFactory {
	public static MainBoards createMainboard(int type){
		MainBoards mainBoards=null;
		if (type==1) {
			mainBoards=new IntelMainBoard(755);
		}else if (type==2) {
			mainBoards=new AmdMainBoard(938);
		}
		return mainBoards;
	}
}
