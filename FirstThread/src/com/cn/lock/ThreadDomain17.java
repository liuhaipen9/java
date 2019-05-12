package com.cn.lock;

public class ThreadDomain17 {
	public synchronized void testMethod(){
		try
        {
            System.out.println("Enter ThreadDomain17.testMethod, currentThread = " + 
                    Thread.currentThread().getName());
            long l = Integer.MAX_VALUE;
            while (true)
            {
                long lo = 2 / l;
                l--;
            }
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
	}
}
