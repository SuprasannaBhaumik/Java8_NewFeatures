package com.study.threads;


class ThreadB extends Thread {
	
	int total = 0;
	
	public void run() {
		for(int i=1;i<=100;i++) {
			total +=i;
		}
	}
	
}


public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		//b.join();
		System.out.println(b.total);
		Thread.sleep(10);
		System.out.println(b.total);

	}

}
