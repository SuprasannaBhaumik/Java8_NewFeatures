package com.study.threads;

public class Example13_13 extends Thread{
	
	static Object lock1 = new Object();
	static Object lock2 = new Object();
	static volatile int i1, i2, j1, j2, k1, k2;
	private String threadName;
	
	Example13_13(String name) {
		this.threadName = name;
	}
	
	public void run() {
		this.setName(threadName);
		while (true) { 
			doIt(); 
			check(); 
		}
	}
	
	void doIt() {
		//System.out.println(Thread.currentThread().getName());
		synchronized(lock1) { 
			i1++; 
		}
		j1++;
		synchronized(lock2) { 
			k1++; 
			k2++; 
		}
		j2++;
		synchronized(lock1) { 
			i2++; 
		}
	}
	
	void check() {
		if (i1 != i2) System.out.println("i");
		if (j1 != j2) System.out.println("j");
		if (k1 != k2) System.out.println("k");
	}

	public static void main(String[] args) {
		new Example13_13("A").start();
		new Example13_13("B").start();
		System.out.println("Main thread exits");
	}

}
