package io.javabrains.unit3;

import java.util.Arrays;
import java.util.List;

import io.javabrains.common.Person;

public class StreamExample {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlile", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		persons.stream().forEach(p -> System.out.println(p.getFirstName()));
		persons.stream() //Source which provides the elements
				.filter(p -> p.getFirstName().startsWith("C")) //All the operation needs to be perform
				.forEach(p -> System.out.println(p.getFirstName()));  //Terminal operation 
		
		long count = persons.stream().filter(p -> p.getFirstName().startsWith("D")).count();
		System.out.println(count);
		
		long count1 = persons.parallelStream().filter(p -> p.getFirstName().startsWith("D")).count(); //parallelStream is more potential then stream. Its execute paralally
		System.out.println(count1);
	}

}
