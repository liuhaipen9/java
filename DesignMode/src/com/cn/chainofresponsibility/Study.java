package com.cn.chainofresponsibility;

public class Study {
	public void study(PreparationList preparationList){
		if (preparationList.isWashFace()) {
			System.out.println("洗脸");
		}
		if (preparationList.isWashHair()) {
			System.out.println("洗头");
		}
		if (preparationList.isHaveBreakfash()) {
			System.out.println("吃早餐");
		}
		System.out.println("我去学习了");
	}
	
	public void study(){
		System.out.println("我去学习了");
	}
}
