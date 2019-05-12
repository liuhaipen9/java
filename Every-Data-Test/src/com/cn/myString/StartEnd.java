package com.cn.myString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class StartEnd {
	
	public static String input="As long As there is injustice,Whenever a\n Targathian baby cries out,wherever a distress\n signal sounds among the starts... We'll be there.\n";
	
	private static class Display{
		private boolean regexPrinted=false;
		private String regex;
		Display(String regex){this.regex=regex;}
		void display(String message){
			if (!regexPrinted) {
				System.out.println(regex);
				regexPrinted=true;
			}
			System.out.println(message);
		}
	}
	
	static void examine(String s,String regex){
		Display d=new Display(regex);
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(s);
		while (m.find()) {
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
