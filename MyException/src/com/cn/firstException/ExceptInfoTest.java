package com.cn.firstException;

import java.util.HashMap;
import java.util.Map;

public class ExceptInfoTest {
	public void f(){
		int i=1;
		try{
		if (i==1) {
				System.out.println("成功进入throw....");
				throw new DefaultException("测试");
			}
		i=i/0;
		} catch (Exception e) {
			System.out.println("成功进入catch......");
		System.out.println(ExceptionUtil.printStackTraceToString(e, 5000));
		}
		}
	
	void n(int i) throws DefaultException{
		if (i==1) {
			throw new DefaultException("测试自定义异常！！！i为1");	
		}
		if (i==2) {
			throw new DefaultException("Fail","测试异常");
		}
		
	}
	
   Map<String, String> d(int i) throws DefaultException{
	   Map<String,String> map=new HashMap<String, String>();
	   try {
		 n(i);
		 return null;
		} catch (DefaultException e) {
			RuntimeException runtimeException=new RuntimeException(e);
			e.printStackTrace();
			map.put("success", e.getCode());
			map.put("msg", e.getMessage());
			return map;
			//System.err.println(ExceptionUtil.printStackTraceToString(e, 50));
		}
			
	}
	public static void main(String[] args) throws DefaultException  {
		ExceptInfoTest test=new ExceptInfoTest();
//		Map<String, String> ss=test.d(2);
//		System.out.println(ss);
		test.n(2);
	}

}
