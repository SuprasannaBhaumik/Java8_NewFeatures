package com.study.feature.functionalInterface;

import java.util.Comparator;
import java.util.List;

import com.study.feature.forEach.Person;
import com.study.feature.forEach.Util;

public class DemoFunctionalInterface {
	
	public static void main(String s[]) {
		
		List<Person> personList = Util.getListOfPersons();
		
		//lambda way to use comparator
		Comparator<Person> c1 = (person1,person2) -> {
			return Integer.compare(person1.getAge(), person2.getAge());
		};
		
		personList.sort(c1);
		System.out.println(personList);
		
		//this is the new way to compare - method reference
		//declare the static method compare in Person class
		//Comparator is functional interface as it has only one abstract method
		Comparator<Person> c2 = Person::compare;
		personList.sort(c2);
		System.out.println(personList);
		
	}

}
