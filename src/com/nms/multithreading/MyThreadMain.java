package com.nms.multithreading;

public class MyThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new MyMultiTask("Create remote repo");
		Thread t2 = new MyMultiTask("Create ER Diagram");
		Thread t3 = new MyMultiTask("Create class Design");
		Thread t4 = new MyMultiTask("Create local folders");
		
		t1.setName("Thread 0 - vc thread");
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
