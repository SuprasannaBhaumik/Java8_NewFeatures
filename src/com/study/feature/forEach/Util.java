package com.study.feature.forEach;

import java.util.ArrayList;
import java.util.List;

public class Util {
	
	public static List<Person> getListOfPersons() {
		Person p1 = new Person("Tom Cruise", 102, 56);
		Person p2 = new Person("Arnold Schwarzeneger", 101, 75);
		Person p3 = new Person("Jason Statham", 100, 46);
		
		List<Person> personList = new ArrayList<Person>();

		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		
		return personList;
	}

}
