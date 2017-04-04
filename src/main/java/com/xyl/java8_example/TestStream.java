package com.xyl.java8_example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xyl.java8_example.modle.Person;

public class TestStream {
	
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("张三",15));
		persons.add(new Person("李四",19));
		persons.add(new Person("王五",28));
		
		Stream<Person> stream = persons.stream().filter(p -> p.getAge() > 18);
		System.out.println("Adult");
		stream.forEach(p -> System.out.println(p.getUsername()));
		
		List<Person> resultList = persons.stream().map(p -> new Person(p.getUsername()+p.getAge(),p.getAge())).collect(Collectors.toList());
		System.out.println("New Person");
		resultList.forEach(p -> System.out.println(p.getUsername()));
		
	}
	
}
