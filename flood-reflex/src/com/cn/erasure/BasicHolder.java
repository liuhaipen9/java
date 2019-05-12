package com.cn.erasure;

public class BasicHolder<T> {
	T element;
	void set(T args){element=args;}
	T get(){
		return element;
	}
	void f(){
		System.out.println(element.getClass().getSimpleName());
	}
}
