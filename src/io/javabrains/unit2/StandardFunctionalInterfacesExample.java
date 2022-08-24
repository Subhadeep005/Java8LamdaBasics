package io.javabrains.unit2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.javabrains.common.Person;

public class StandardFunctionalInterfacesExample {
	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlile", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));
		
		// Step 1: Sort list by last name
		Collections.sort(persons, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
				
		// Step 2: Create a method that prints all elements in the list
		System.out.println("Print All the Person using Lamda");
		printConditionally(persons, p -> true, p -> System.out.println(p));

		// Step 3: Create a method that prints all the people that have last name
		// beginning with C
		
		System.out.println("Print All the Person that have last name beginning with C using passing behaviour using Lamda");
		printConditionally(persons, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
		
		System.out.println("Print All First name of the Person that have first name beginning with C using passing behaviour using Lamda");
		printConditionally(persons, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p.getFirstName()));
	}

	private static void printConditionally(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : persons)
			if (predicate.test(person)) {
				consumer.accept(person);
			}
	}
}
