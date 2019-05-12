package com.cn.log4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {
	public static void main(String[] args) {
		FileOutputStream fileOutputStream;
		try {
			User user=new User(1, "roc", 21);
			fileOutputStream = new FileOutputStream("a.txt");
			ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
			outputStream.writeObject(user);
			
			FileInputStream fileInputStream=new FileInputStream("a.txt");
			ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
			User obj=(User)inputStream.readObject();
			System.out.println(obj.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
