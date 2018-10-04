package com.study.feature.forEach;

public class Person {
	
	int aadhar;
	String name;
	int age;
	
	public Person(String name, int aadhar, int age) {
		this.aadhar = aadhar;
		this.age = age;
		this.name = name;
	}

	public int getAadhar() {
		return aadhar;
	}

	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Person aadhar is :" + this.aadhar + " and age -> " + this.age;
	}
	
	public static int compare(Person p1, Person p2) {
		return Integer.compare(p1.getAadhar(), p2.getAadhar());
	}
}
