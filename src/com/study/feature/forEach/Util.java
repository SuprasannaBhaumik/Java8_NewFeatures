package com.study.feature.forEach;

import java.util.ArrayList;
import java.util.List;

public class Util {
	
	public static List<Person> getListOfPersons() {
		Person p1 = new Person("name1", 12423434, 132);
		Person p2 = new Person("name2", 1232344, 12352);
		Person p3 = new Person("name3", 1234234, 152);
		
		List<Person> personList = new ArrayList<Person>();

		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		
		return personList;
	}

}
