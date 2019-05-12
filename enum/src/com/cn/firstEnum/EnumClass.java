package com.cn.firstEnum;

public class EnumClass {
	public static void main(String[] args) {
		for (Shrubbery s:Shrubbery.values()) {
			System.out.println(s+"ordinal: "+s.ordinal());
			System.out.println(s.compareTo(Shrubbery.CRAWLINE));
			System.out.println(s.equals(Shrubbery.CRAWLINE));
			System.out.println(s==Shrubbery.CRAWLINE);
			System.out.println(s.getDeclaringClass());
			System.out.println(s.name());
			System.out.println("------------------------------------------------");
		}
		for (String s:"GROUND CRAWLINE HANGING".split(" ")) {
			Shrubbery shrubbery=Enum.valueOf(Shrubbery.class, s);
			System.out.println(shrubbery);
		}
	}
}
