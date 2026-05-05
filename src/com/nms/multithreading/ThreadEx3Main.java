package com.nms.multithreading;

public class ThreadEx3Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new ThreadEx3(), "Thread-1");
		Thread t2 = new Thread(new ThreadEx3(), "Thread-2");
		Thread t3 = new Thread(new ThreadEx3(), "Thread-3");
		
		t1.start();
		t1.join(2000);
		
		t2.start();
		t2.join(3000);
		
		t3.start();

	}

}
