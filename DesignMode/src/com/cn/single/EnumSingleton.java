package com.cn.single;

public class EnumSingleton {
	private EnumSingleton(){}
	public static EnumSingleton getInstance(){
		return Singleton.INSTANCE.getInstaSingleton();
	}
	
	private static enum Singleton{
		INSTANCE;
		private EnumSingleton singleton;
		//jvm保证此方法只会调用一次，并且防反射
		private Singleton(){
			singleton=new EnumSingleton();
		}
		public EnumSingleton getInstaSingleton(){
			return singleton;
		}
	}
	
	public void test(){
		System.out.println("success");
	}
	public static void main(String[] args) {
		EnumSingleton enumSingleton=EnumSingleton.getInstance();
		EnumSingleton enumSingleton2=EnumSingleton.getInstance();
		System.out.println(enumSingleton);
		System.out.println(enumSingleton2);
		System.out.println(enumSingleton==enumSingleton2);
		
	}

}
