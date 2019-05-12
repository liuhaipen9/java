package com.cn.firstEnum;

import static com.cn.firstEnum.Spiciness.MEDIUM;

public enum OzWitch {
	
	WEST("WEST"),
	NORTH("NORTH"),
	EAST("EAST"),
	SOUTH("SOUTH");
	private String description;
	private OzWitch(String description){
		this.description=description;
	}
	public String getDescription() {
		return description;
	}
	public static void main(String[] args) {
		for (OzWitch ozWitch:OzWitch.values()) {
		System.out.println("description:"+ozWitch.getDescription());	
		}
	}
	
	
}
