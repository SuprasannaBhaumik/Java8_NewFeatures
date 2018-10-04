package com.study.feature.forEach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		
		List<Person> personList = new ArrayList<Person>();
		for(int i = 0; i < 10; i++) {
			personList.add(new Person("Name " + (i+1), 30 + i, i));
		}
		
		//implementing via different class
		MyConsumer iterator = new MyConsumer();
		personList.forEach(iterator);
		
		//using the lambda
		Consumer<Person> personConsumer = (person) -> {
			System.out.println(person);
		};
		personList.forEach(personConsumer);
		
		//using functional way
		Consumer<Person> personConsumerFunctional = System.out::println;
		personList.forEach(personConsumerFunctional);
	}

}
