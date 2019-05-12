package com.cn.dataoutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StoringAndRecoveringData {
	
	public static void main(String[] args) throws IOException {
		
			DataOutputStream out=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Data.txt")));
			out.writeUTF("utf-8");
			out.writeDouble(1.2);
			out.close();
			DataInputStream inputStream=new DataInputStream(new BufferedInputStream(new FileInputStream("Data.txt")));
			System.out.println(inputStream.readDouble());
			//System.out.println(inputStream.readUTF());
		
		
	}

}
