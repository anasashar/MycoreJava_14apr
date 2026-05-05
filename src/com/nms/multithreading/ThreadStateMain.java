package com.nms.multithreading;

public class ThreadStateMain {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ThreadEx2 t1= new ThreadEx2("Thread-1");
		ThreadEx2 t2= new ThreadEx2("Thread-1");
		
		t1.start();
		t1.join(10000);
		t2.start();

	}

}
