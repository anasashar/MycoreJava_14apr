package com.nms.multithreading;

public class ThreadEx2 extends Thread {
	
	private Thread t;
	private String threadName;
	public ThreadEx2(String threadName) {
		this.threadName = threadName;
		
		System.out.println("Thread " + threadName+
				"state : new");
	}
	
	public void run() {
		System.out.println("thread " + threadName+
				"state : running");
		
		for(int i=5;i>0;i--) {
			System.out.println("thread " + threadName+
					", " + i);
		}
		System.out.println("Thread " + threadName+
				"state : Dead");
	}
	
	public void start() {
		System.out.println("thread " + threadName+
				" state : start");
		if(t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
