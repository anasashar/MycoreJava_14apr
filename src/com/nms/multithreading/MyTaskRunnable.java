package com.nms.multithreading;

public class MyTaskRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1= new Thread(
				new MyTask("create data table"));
		Thread t2= new Thread(
				new MyTask("create a folder 2"));
		Thread t3= new Thread(
				new MyTask("create a new Thread"));
		Thread t4= new Thread(
				new MyTask("implement multithreading"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
