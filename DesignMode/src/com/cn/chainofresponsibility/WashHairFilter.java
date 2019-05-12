package com.cn.chainofresponsibility;

public class WashHairFilter extends AbstractPrepareFilter {

	public WashHairFilter(AbstractPrepareFilter abstractPrepareFilter) {
		super(abstractPrepareFilter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare(PreparationList preparationList) {
		// TODO Auto-generated method stub
		if (preparationList.isWashHair()) {
			System.out.println("洗头");
		}
	}

}
