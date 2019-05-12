package com.cn.testenum;

public enum Color2 {
	RED("红色",1),GREED("蓝色",2),BLANK("黑色",3);
	//成员变量
	private String name;
	private int index;
	private Color2(String name, int index) {
		this.name = name;
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public static String getName(int index){
		for (Color2 c:Color2.values()) {
			if (c.getIndex()==index) {
				return c.name;
			}
		}
		return null;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.index+":"+this.name;
	}
	
}
