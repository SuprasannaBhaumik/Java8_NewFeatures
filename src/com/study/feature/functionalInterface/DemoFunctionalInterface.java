package com.study.feature.functionalInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.study.feature.forEach.Person;

public class DemoFunctionalInterface {
	
	public static void main(String s[]) {
		
		Person p1 = new Person("name1", 12423434, 132);
		Person p2 = new Person("name2", 1232344, 12352);
		Person p3 = new Person("name3", 1234234, 152);
		
		List<Person> personList = new ArrayList<Person>();

		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		
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
