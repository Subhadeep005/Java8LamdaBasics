package io.javabrains.unit3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import io.javabrains.common.Person;

public class CollectionIterationExample1 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlile", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));
		
		System.out.println("Using For loop");
		for(int i=0; i < persons.size() ; i++) {
			System.out.println(persons.get(i));
		}
		System.out.println("Using Enhanced For loop");
		for(Person p : persons) {
			System.out.println(p);
		}
		System.out.println("Using ForEach Method with Inner class");
		persons.forEach(new Consumer<Person>() {

			@Override
			public void accept(Person t) {
				System.out.println(t);
			}
		});
		System.out.println("Using ForEach Method with Lamda");
		persons.forEach(p -> System.out.println(p));
		
		System.out.println("Using ForEach Method Reference");
		persons.forEach(System.out::println);
		
		System.out.println("Using Stream");
		persons.stream().forEach(System.out::println);
	}

}
