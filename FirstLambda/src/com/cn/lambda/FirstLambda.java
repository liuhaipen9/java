package com.cn.lambda;


import java.util.ArrayList;
import java.util.Arrays;

import org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID;

public class FirstLambda {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("roc");
			}
		}).start();
		
		new Thread(()->{System.out.println("roc");}).start();
		ArrayInterface arrayInterface=Arrays::sort;
		int[] is={2,4,1,3,7,5};
		arrayInterface.getArray(is);
		
		System.out.println(Arrays.toString(is));
	}
}
