package com.cn.dto;

import java.io.Serializable;

public class RocUser implements Serializable{
	private int id;
	private String username;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "RocUser [id=" + id + ", username=" + username + ", age=" + age + "]";
	}
	
	
}
