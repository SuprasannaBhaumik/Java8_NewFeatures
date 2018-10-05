package com.study.feature.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.study.feature.forEach.Person;
import com.study.feature.forEach.Util;

public class ChainingConsumers {
	
	public static void main(String args[]) {
		
		List<Person> personList = Util.getListOfPersons();
		List<String> result = new ArrayList<String>();
		
		Consumer<Person> c1 = (p) -> {
			result.add(p.getName());
		};
		
		Consumer<Person> c2 = System.out::println;
		
		//chaining of the consumers
		personList.stream().forEach(c1.andThen(c2));
		
		System.out.println(result.toString());
	}
}
