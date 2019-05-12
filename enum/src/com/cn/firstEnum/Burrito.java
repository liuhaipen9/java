package com.cn.firstEnum;

import static com.cn.firstEnum.Spiciness.*;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Burrito {
	Spiciness spiciness;
	public Burrito(Spiciness spiciness){
		this.spiciness=spiciness;
	}
	public String toString(){
		return "Burrito is "+spiciness;
	}
	public static void main(String[] args) {
		System.out.println(new Burrito(NOT));
		System.out.println(new Burrito(MEDIUM));
		System.out.println(new Burrito(HOT));
	}
}
