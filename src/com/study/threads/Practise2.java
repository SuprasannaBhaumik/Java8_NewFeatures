package com.study.threads;

public class Practise2 implements Runnable{
	

	public static void main(String[] args) {
		new Thread(new Practise2(), "|Practise2|").start();

	}

	@Override
	public void run() {
		new Thread(new Practise1(), "|P1a|").run();
		new Thread(new Practise1(), "|P1b|").start();
		System.out.println(Thread.currentThread().getName());
	}

}
