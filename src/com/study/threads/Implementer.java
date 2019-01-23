package com.study.threads;

public class Implementer implements Runnable {

	@Override
	public void run() {
		System.out.println("|Implementer| -> " + Thread.currentThread().getName());
	}
	
	public static void main(String args[]) {
		
		//will run from the main thread
		new Extender().run();
		
		//will show the currently running thread i.e.thread-1
		new Extender().start();
		
		//should return implementer->main, but returns extender -> thread2
		new Extender(new Implementer()).start();
		
		//return implementer->thread 3
		new Thread(new Implementer()).start();
		
		/*NOTE : new Implementer().start() is not possible as this implements Runnable,
		not extending Thread */
		
	}
}