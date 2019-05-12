package com.cn.firstException;

public class DefaultException extends Exception {

	private String code;
	public DefaultException(String code,String msg){
		super(msg);
		this.code=code;
	}
	
	
	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public DefaultException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DefaultException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public DefaultException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	
	public DefaultException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DefaultException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
