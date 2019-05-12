package com.cn.MyClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.xml.internal.ws.wsdl.writer.document.Types;

public abstract class PetCreator {
	public abstract List<Class<? extends Pet>> types();
	private Random random=new Random(47);
	public Pet randomPet(){
		int n=random.nextInt(types().size());
		try {
			System.out.println(types().get(n).newInstance());
			return types().get(n).newInstance();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	public Pet[] createArray(int size){
		Pet[] result=new Pet[size];
		for (int i = 0; i < size; i++) {
			result[i]=randomPet();
		}
		return result;
	}
	
	public ArrayList<Pet> arrayList(int size){
		ArrayList<Pet> result=new ArrayList<Pet>();
		Collections.addAll(result, createArray(size));
		return result;
	}
	public static void main(String[] args) {
		PetCreator petCreator=new PetCreator() {
			
			@Override
			public List<Class<? extends Pet>> types() {
				return null;
			
			}
		};
		
		petCreator.arrayList(2);
	}
}
