package com.cn.chainofresponsibility;

public class WashFaceFilter extends AbstractPrepareFilter {

	public WashFaceFilter(AbstractPrepareFilter abstractPrepareFilter) {
		super(abstractPrepareFilter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare(PreparationList preparationList) {
		// TODO Auto-generated method stub
		if (preparationList.isWashFace()) {
			System.out.println("洗脸");
		}
	}

}
