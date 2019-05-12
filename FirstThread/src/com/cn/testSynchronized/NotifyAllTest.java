package com.cn.testSynchronized;

import java.util.ArrayList;
import java.util.List;

public class NotifyAllTest extends Thread{
	public Object lock;
	public NotifyAllTest(Object lock) {
		this.lock=lock;
	}
	
	@Override
	public void run() {
		synchronized (lock) {
			lock.notifyAll();
		}
	}
	

}
