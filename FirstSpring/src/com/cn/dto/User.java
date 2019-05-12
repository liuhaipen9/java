package com.cn.dto;

import java.util.Arrays;
import java.util.List;

import javax.sound.sampled.LineListener;

public class User {
	private int id;
	private String name;
	private int age;
	private Goods goods;
	private List<String> list;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setName-->"+name);
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+","+name+","+age+","+Arrays.asList(list)+","+goods.toString();
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	
	
}
	
