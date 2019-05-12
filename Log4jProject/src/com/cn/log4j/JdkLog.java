package com.cn.log4j;

import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.log4j.Logger;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class JdkLog {
	private final static java.util.logging.Logger log=java.util.logging.Logger.getLogger("JdkLog");
	private final static Logger logger=Logger.getLogger(JdkLog.class);
	public static void main(String[] args) {
		//log.log("Debug", "debug开始。。。。。");
		log.info("jdk方法执行开始。。。。。。。");
		logger.info("log4j执行的日志。。。。。");
	}

}
