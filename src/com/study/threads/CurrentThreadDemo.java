package com.study.threads;

public class CurrentThreadDemo {

	public static void main(String[] args) {
		
		CustomThread t = new CustomThread();
		t.start();
		for(int i=0; i<100; i++) {
			System.out.println(i + "->" + Thread.currentThread().getName());
		}

	}

}
