package com.cn.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnyMatch {
	public static void main(String args[]) {
		String ids="1,2,3,4,5";
		List<Object> listIds = Arrays.asList(ids.split(",")).stream().collect(Collectors.toList());
		//判断listIds里面是否有这个值
		boolean result = listIds.stream().anyMatch(p->p.equals("5"));
		System.out.println(Arrays.toString(listIds .toArray()));//[1,2,3,3,4,5,6]  
		System.out.println(result);
	}
	
}
