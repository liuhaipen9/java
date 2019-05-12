package com.cn.file;

import java.io.File;
import java.io.IOException;

import javafx.stage.DirectoryChooser;

public class ProcessFiles {
	public interface Strategy{
		void process(File file);
	}
	private Strategy strategy;
	private String ext;
	public ProcessFiles(Strategy strategy,String ext){
		this.strategy=strategy;
		this.ext=ext;
	}
	public void start(String[] args){
		try {
			if (args.length==0) {
			
			}else {
				for (String arg:args) {
					File fileArg=new File(arg);
					if (fileArg.isDirectory()) {
						//proc
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void processDirectoryTree(File root) throws IOException{
		//不编译了，版本不样
//		for (File file:Directory) {
//			
//		}
	}
	
}
