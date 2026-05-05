package com.nms.multithreading;

public class ThreadSyncEx4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSyncEx4 myCounter = new ThreadSyncEx4();
		
		Thread t1 = new Thread( () -> {
			for(int i =0; i<1000;i++) {
				myCounter.increment();
			}
		});
		
		Thread t2 = new Thread( () -> {
			for(int i =0; i<1000;i++) {
				myCounter.increment();
			}
		});
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("counter value :" + myCounter.getC());
		
	}

}
