package com.cn.chainofresponsibility;

public class PreparationList {
	/**
	 * 是否洗脸
	 */
	private boolean washFace;
	/**
	 * 是否洗头
	 */
	private boolean washHair;
	/**
	 * 是否吃早餐
	 */
	private boolean haveBreakfash;
	public boolean isWashFace() {
		return washFace;
	}
	public void setWashFace(boolean washFace) {
		this.washFace = washFace;
	}
	public boolean isWashHair() {
		return washHair;
	}
	public void setWashHair(boolean washHair) {
		this.washHair = washHair;
	}
	public boolean isHaveBreakfash() {
		return haveBreakfash;
	}
	public void setHaveBreakfash(boolean haveBreakfash) {
		this.haveBreakfash = haveBreakfash;
	}
	
}
