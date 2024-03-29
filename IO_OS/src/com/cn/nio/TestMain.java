package com.cn.nio;

import java.nio.CharBuffer;

public class TestMain {
	//待显示的字符串
	private static String[] strs=
		{
				"A random string value",
				         "The product of an infinite number of monkeys",
			         "Hey hey we're the monkees",
				        "Opening act for the Monkees:Jimi Hendrix",
				        "Scuse me while I kiss this fly",
			        "Help Me! Help Me!"
		};
	//标识strs的下标索引
	private static int index=0;
	
	//向buffer内放置数据
	
	private static boolean fillBuffer(CharBuffer buffer){
		if (index>=strs.length) {
			return false;
		}
		String str=strs[index++];
		for (int i = 0; i < str.length(); i++) {
			buffer.put(str.charAt(i));
		}
		return true;
	}
	
	//从buufer内把数据拿出来
	private static void drainBuffer(CharBuffer buffer){
		while (buffer.hasRemaining()) {
			System.out.println(buffer.get());
		}
	}
	
	public static void main(String[] args) {
		CharBuffer cb=CharBuffer.allocate(100);
		while (fillBuffer(cb)) {
			cb.flip();
			drainBuffer(cb);
			cb.clear();
			
		}

	}

}
