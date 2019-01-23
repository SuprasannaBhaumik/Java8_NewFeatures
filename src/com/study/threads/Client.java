package com.study.threads;

public class Client {
	
	public static void main(String s[]) {
		
		MyRunnableThread runnableObj = new MyRunnableThread();
		
		Thread customThread = new Thread(runnableObj, "Suprasanna");
		
		//shows name, priority and parent thread
		System.out.println(customThread);
		
		customThread.start();
		
		try {
			int val;
			do {
				val = runnableObj.getValue();
				System.out.println("Counter value read by -> "
						+ Thread.currentThread().getName() + " : " + val);
				Thread.sleep(1000);
			} while (val < 5);
			
		} catch (InterruptedException e) {
			System.out.println("the main thread is interrupted");
		}
		System.out.println("exit from main method");
	}
}
