package com.cn.exception;

import sun.security.ec.ECDHKeyAgreement;

class RocException extends Exception{
	private int value;
	public RocException(){
		super();
	}
	public RocException(String msg,int value){
		super(msg);
		this.value=value;
	}
	public int getValue(){
		return value;
	}
}
public class DefaultException {
	public void testDefaultException(int a) throws RocException{
		if (a<0) {
			throw new RocException("a不能小于0",a);
		}
	}
	public static void main(String[] args) {
		DefaultException defaultException=new DefaultException();
		
		try {
			defaultException.testDefaultException(-1);
		} catch (RocException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//如果是j2ee工程，可以在这里返回错误的json数据
			/*System.out.println("e.getMessage:"+e.getMessage());
			System.out.println("e.toString:"+e.toString());
			System.out.println("e.getVaule:"+e.getValue());*/
		}
	}
}
