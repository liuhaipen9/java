package com.cn.chainofresponsibility;

public class HaveBreakfastFilter extends AbstractPrepareFilter {

	public HaveBreakfastFilter(AbstractPrepareFilter abstractPrepareFilter) {
		super(abstractPrepareFilter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare(PreparationList preparationList) {
		// TODO Auto-generated method stub
		if (preparationList.isHaveBreakfash()) {
			System.out.println("吃早餐");
		}
	}

}
