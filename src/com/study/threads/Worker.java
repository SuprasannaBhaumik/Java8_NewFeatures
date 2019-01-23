package com.study.threads;

public class Worker extends Thread {
	public void run() {
		System.out.println("|work|" + "   " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Worker worker = new Worker();
		worker.start();
		worker.run();
		
		//in case we again try to run the thread on the same object, 
		//IllegalThreadException occurs 
		worker.start();
	}
}