package com.cn.MyClass;

import java.util.HashMap;
import java.util.List;



public class PetCount {
	static class PetCounter extends HashMap<String, Integer>{
		public  void count(String type){
			Integer quantity=get(type);
			if (quantity==null) {
				put(type, 1);
			}else {
				put(type, quantity+1);
			}
		}
	}
		public static void countPets(PetCreator petCreator){
			PetCounter counter=new PetCounter();
			for (Pet pet:petCreator.createArray(20)) {
				System.out.println(pet.getClass().getSimpleName());
				if (pet instanceof Pet) {
					counter.count("Pet");
				}
				if (pet instanceof Cat) {
					counter.count("Cat");
				}
				if (pet instanceof Cymric) {
					counter.count("Cymric");
				}
				if (pet instanceof Dog) {
					counter.count("Dog");
				}
				if (pet instanceof EgyptianMau) {
					counter.count("EgyptianMau");
				}
				if (pet instanceof Hamster) {
					counter.count("Hamster");
				}
				if (pet instanceof Manx) {
					counter.count("Manx");
				}
			}
			System.out.println(counter);
			
		}
		
	
	public static void main(String[] args) {
		countPets(new ForNamePetCreator());
	}
}
