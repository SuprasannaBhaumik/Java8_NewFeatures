package com.study.feature.forEach;

import java.util.function.Consumer;

//the entire business logic has now moved to this class
public class MyConsumer implements Consumer<Person> {

	//the method accept can now do all the biz logic related changes
	@Override
	public void accept(Person person) {
		System.out.println("Name->" + person.getName());
	}

}
