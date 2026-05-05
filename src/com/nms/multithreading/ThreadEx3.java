package com.nms.multithreading;

public class ThreadEx3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread "
		+ Thread.currentThread().getName() +", " + "state running");
		for(int i=10;i>0;i--) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("thread "
				+ Thread.currentThread().getName() + ", " +
				"state Dead");
	}

}
