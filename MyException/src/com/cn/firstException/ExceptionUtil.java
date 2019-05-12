package com.cn.firstException;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionUtil {
	public static String printStackTraceToString(Throwable t,Integer length) {
        StringWriter sw = new StringWriter();
        t.printStackTrace(new PrintWriter(sw, true));
        String result=sw.getBuffer().toString();
        if(length!=null && length>0){
            if(result.length()>length){
                result=result.substring(0,length);
            }
        }
        return result;
    }
}
