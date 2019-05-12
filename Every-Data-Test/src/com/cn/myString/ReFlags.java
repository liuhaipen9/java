package com.cn.myString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReFlags {
	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("^java",Pattern.CASE_INSENSITIVE|Pattern.MULTILINE);
		Matcher matcher=pattern.matcher("java my lift\n"
				+ "JAVA has pretty good regular\n"
				+ "expressions Java is expressions");
		while (matcher.find()) {
			System.out.println(matcher.group());
			
		}
	}
}
