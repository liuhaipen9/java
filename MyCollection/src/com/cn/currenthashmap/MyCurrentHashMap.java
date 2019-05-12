package com.cn.currenthashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyCurrentHashMap {
	public static void main(String[] args) {
		Map<String, String> map=new ConcurrentHashMap<String, String>();
		map.put("roc", "dd");
		map.get("roc");
	}
}
