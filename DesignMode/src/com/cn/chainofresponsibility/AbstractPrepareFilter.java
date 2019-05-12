package com.cn.chainofresponsibility;

public abstract class AbstractPrepareFilter {
	private AbstractPrepareFilter nextPrepareFilter;
	
	public AbstractPrepareFilter(AbstractPrepareFilter nextPrepareFilter){
		this.nextPrepareFilter=nextPrepareFilter;
	}
	
	public void doFilter(PreparationList preparationList,Study study){
		prepare(preparationList);
		if (nextPrepareFilter==null) {
			study.study();
		}else {
			nextPrepareFilter.doFilter(preparationList, study);
		}
	}
	
	public abstract void prepare(PreparationList preparationList);
}
