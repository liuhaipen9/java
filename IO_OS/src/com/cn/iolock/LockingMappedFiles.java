package com.cn.iolock;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

import com.sun.corba.se.impl.ior.ByteBuffer;

public class LockingMappedFiles {
	static final int LENGTH=0x8FFFFFF;
	static FileChannel fc;
	public static void main(String[] args) throws IOException {
		fc=new RandomAccessFile("test.bat", "rw").getChannel();
		MappedByteBuffer outBuffer=fc.map(FileChannel.MapMode.READ_WRITE, 0, LENGTH);
		for (int i = 0; i < LENGTH; i++) {
			outBuffer.put((byte)'x');
		}
		
	}
	
	private static class LockAndModify extends Thread{
		private ByteBuffer buffer;
		private int start,end;
		public LockAndModify(ByteBuffer mbb,int start,int end) {
			this.start=start;
			this.end=end;
			start();
		}
		@Override
		public void run() {
			
		}
	}
}

