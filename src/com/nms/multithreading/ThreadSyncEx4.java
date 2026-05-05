package com.nms.multithreading;

public class ThreadSyncEx4 {

	
	private int counter = 0;
	public synchronized void increment() {
		counter++;
	}
	
	public synchronized int getC() {
		return counter;
	}
}
