package com.study.threads;

import com.study.threads.model.Employee;

public class Mutex {
	public static void main(String[] args) {
		final StackImpl stack = new StackImpl(20); // (6) Shared by the threads.
		
		(new Thread("Pusher") { // (7) Thread no. 1
			public void run() {
				for (;;) {
					System.out.println("Pushed: " + stack.push(new Employee()));
				}
			}
		}).start();
		
		(new Thread("Popper") { // (8) Thread no. 2
			public void run() {
				for (;;) {
					System.out.println("Popped: " + stack.pop());
				}
			}
		}).start();
		System.out.println("Exit from main().");
	}
}