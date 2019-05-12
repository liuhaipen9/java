package com.cn.MyClass;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;






public class ForNamePetCreator extends PetCreator {

	
	public static List<Class<? extends Pet>> types=new ArrayList<Class<? extends Pet>>();
		// TODO Auto-generated method stub

		private static String[] typeNames={
				"com.cn.MyClass.Cat","com.cn.MyClass.Cymric","com.cn.MyClass.Dog","com.cn.MyClass.EgyptianMau","com.cn.MyClass.Hamster"
				,"com.cn.MyClass.Manx","com.cn.MyClass.Mouse","com.cn.MyClass.Mutt"};
	@SuppressWarnings("uncheck")
	 private static void loader(){
		ForNamePetCreator forNamePetCreator=new ForNamePetCreator();
		 try {
			for(String name:typeNames){
				forNamePetCreator.types().add((Class<? extends Pet>)Class.forName(name));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	

}
	@Override
	public List<Class<? extends Pet>> types() {
		// TODO Auto-generated method stub
		return types;
	}
	
	static{
		loader();
	}

}