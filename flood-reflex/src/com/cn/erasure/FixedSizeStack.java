package com.cn.erasure;

import java.util.Arrays;

public class FixedSizeStack<T> {
	public int index=0;
	private Object[] storage;
	public FixedSizeStack(int size) {
		storage=new Object[size];
	}
	
	public void push(T item){
		storage[index++]=item;
		//System.out.println(Arrays.asList(storage));
	}
	@SuppressWarnings("unchecked")
	public T pop(){
		//System.out.println(Arrays.asList((T)storage[--index]));
		return (T)storage[--index];
	}
	public static void main(String[] args) {
		FixedSizeStack<String> fixedSizeStack=new FixedSizeStack<String>(10);
		for (String s:"A B C D E F G H J K".split(" ")) {
			fixedSizeStack.push(s);
		}
		for (int i = 0; i >10; i++) {
			String s=fixedSizeStack.pop();
			System.out.println(s);
		}
	}
}
