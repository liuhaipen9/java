package com.cn.firstannotion;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;





public class UserCaseTracker {
	public static void annotionTracker(List<Integer> useCases,Class<?> clazz){
		for (Method m:clazz.getDeclaredMethods()) {
			UserCase uc=m.getAnnotation(UserCase.class);
			if (uc!=null) {
				System.out.println("Found Use Case:"+uc.id());
				System.out.println(uc.description());
			}
			
		}
		for (int i:useCases) {
			System.out.println("Warning:Missing use case-"+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> useCases=new ArrayList<Integer>();
		Collections.addAll(useCases, 47,48,49);
		annotionTracker(useCases, PassWordUtils.class);
	}
	

}
