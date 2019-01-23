package com.study.threads;

public class MyRunnableThread implements Runnable {

	private int counter;

	MyRunnableThread() {
		counter = 0;
	}

	public int getValue() {
		return counter;
	}
	
	public void run() {
		try {
			while (counter < 5) {
				System.out.println(Thread.currentThread().getName() + " :: " + counter++);
				Thread.sleep(250);
			}
		} catch (InterruptedException e) {
			System.out.println("error in the thread ->" + Thread.currentThread().getName());
		}
		System.out.println("Exit from thread -> " + Thread.currentThread().getName());
	}

}
