package com.study.threads;

public class Extender extends Thread {
	
	public Extender() {}
	
	public Extender(Runnable r) {
		super(r);
	}
	
	public void run() {
		System.out.println("|Extender| -> " + Thread.currentThread().getName());
	}

}
