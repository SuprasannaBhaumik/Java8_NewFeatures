package com.study.threads;

import com.study.threads.model.Employee;

public class StackImpl {
	
	
	private Employee[] employeeArray;
	private int topOfStack;
	
	public StackImpl(int capacity) {
		employeeArray = new Employee[capacity];
		topOfStack = -1;
	}
	
	//public boolean push(Employee emp) {
    public synchronized boolean push(Employee emp) {
		
		if (isFull() ) {
			return false;
		}
		System.out.println("topOfStack before ::"+topOfStack);
		++topOfStack;
		System.out.println("topOfStack after::"+topOfStack);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
			//nothing to do here
		}
		employeeArray[topOfStack] = emp;
		return true;
	}
	
	//public Employee pop() {
    public synchronized Object pop() {
		if (isEmpty()) {
			return null;
		}
		Employee emp = employeeArray[topOfStack];
		employeeArray[topOfStack] = null;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		topOfStack--;
		return emp;
	}

	public boolean isFull() {
		return topOfStack >= employeeArray.length;
	}
	
	public boolean isEmpty() {
		return topOfStack < 0;
	}
	

}
