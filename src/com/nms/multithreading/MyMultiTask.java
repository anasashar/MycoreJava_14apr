package com.nms.multithreading;

public class MyMultiTask extends Thread {

	String taskName;

	public MyMultiTask(String taskName) {
		this.taskName = taskName;
	}
	public void run() {
		System.out.println(taskName + "is being done by " +
				Thread.currentThread().getName());
	}
}
