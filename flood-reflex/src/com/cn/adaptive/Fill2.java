package com.cn.adaptive;

import java.util.Collection;

interface Addable<T>{void add(T t);}
public class Fill2 {
	public static <T> void Fill2(Addable<T> addable,Class<? extends T> classToken,int size){
		for (int i = 0; i < size; i++) {
			try {
			addable.add(classToken.newInstance());	
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	public static<T> void Fill2(Addable<T> addable,Generator<T> generator,int size){
		for (int i = 0; i < size; i++) {
			addable.add(generator.next);
		}
	}
	
}

//class
class AddableCollectionAdapter<T> implements Addable<T>{
	private Collection<T> c;
	public AddableCollectionAdapter(Collection<T> c) {
		this.c=c;
	}
	
	@Override
	public void add(T t) {
		// TODO Auto-generated method stub
		
	}
}

//class
	class Adapter{
		public static <T> Addable<T> b(Collection<T> c){
			return new AddableCollectionAdapter<T>(c);
		}
	}
	
	
	
//class	
	
	class AddableSimpleQueue<T> extends SimpleQueue<T> implements Addable<T>{
		
	}

