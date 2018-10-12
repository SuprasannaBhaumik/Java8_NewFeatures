package com.study.feature.functionalInterface;

//this annotation makes sure that there is at most one abstract method
@FunctionalInterface
public interface CustomFunctionalInterface {
	
	void log(String s);//abstract method
	
	//we can provide default methods too
	default void printName(String s) {
		System.out.println(s);
	}
	
	//we can provide static methods too
	static void console(String s) {
		System.out.println(s);
	}

}
