package com.study.feature.functionalInterface;

@FunctionalInterface
public interface CustomFunctionalInterface {
	
	void log(String s);
	
	default void printName(String s) {
		System.out.println(s);
	}

}
