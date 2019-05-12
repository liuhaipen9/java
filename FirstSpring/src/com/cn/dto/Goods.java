package com.cn.dto;

public class Goods {
 private int id;
 private int num;
 private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+","+name+","+num;
	}
 
}
