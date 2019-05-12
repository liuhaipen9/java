package com.cn.chainofresponsibility;

public class Test {
	public static void main(String[] args) {
		PreparationList preparationList=new PreparationList();
		preparationList.setWashFace(true);
		preparationList.setWashHair(true);
		preparationList.setHaveBreakfash(true);
		
		Study study=new Study();
		
		AbstractPrepareFilter haveBreakfastFilter=new HaveBreakfastFilter(null);
		AbstractPrepareFilter washFaceFilter=new WashFaceFilter(haveBreakfastFilter);
		AbstractPrepareFilter washHairFilter=new WashHairFilter(washFaceFilter);
		
		washHairFilter.doFilter(preparationList, study);
	}
}
