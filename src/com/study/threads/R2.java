package com.study.threads;

public class R2 implements Runnable {

	@Override
	public void run() {
		new Thread(new R1(), "|R1a|").run();//run always takes the thread from which it is called
		new Thread(new R1(), "|R1b|").start();
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		new Thread(new R2(), "|R2|").start();

	}

}
