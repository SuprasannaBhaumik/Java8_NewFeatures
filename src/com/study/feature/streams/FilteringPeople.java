package com.study.feature.streams;

import java.util.List;
import java.util.function.Predicate;

import com.study.feature.forEach.Person;
import com.study.feature.forEach.Util;

public class FilteringPeople {
	
	public static void main(String s[]) {
		
		List<Person> personList = Util.getListOfPersons();
		
		//take the list of people above 50
		Predicate<Person> p1 = (p) -> {
			return p.getAge() > 50;
		};
		
		personList.stream().filter(p1).forEach( System.out::println);
		
		
		
	}

}
