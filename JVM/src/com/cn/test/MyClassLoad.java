package com.cn.test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyClassLoad extends ClassLoader{
	public String name;
	public MyClassLoad(String name) {
	  super();
	  this.name=name;
	}
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return super.findClass(name);
	}
	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		FileInputStream fin=null;
		ByteArrayOutputStream bos=null;
		try {
			fin = new FileInputStream(name);
			byte buf[] = new byte[512];
			int len = 0;
			bos = new ByteArrayOutputStream();
			while (fin.read(buf) != -1) {
				len= fin.read(buf);
				bos.write(buf, 0, len);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// 把缓存中的数据全部刷到baout中
		}
	
		
			
		
		byte b[] = bos.toByteArray();
		// 技术入口，调用父类ClassLoader中的defineClass()方法生成c对象
		Class<?> c = this.defineClass(null, b, 0, b.length);

		return c;
	}
}
