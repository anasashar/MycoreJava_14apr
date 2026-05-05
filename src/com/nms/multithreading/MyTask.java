package com.nms.multithreading;

public class MyTask implements Runnable {
	
	private String taskname;
	public MyTask(String taskname) {
		this.taskname = taskname;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(taskname + "is being done by "
				+ Thread.currentThread().getName());

	}

}
