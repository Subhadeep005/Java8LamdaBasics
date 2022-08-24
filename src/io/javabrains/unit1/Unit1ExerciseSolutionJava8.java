package io.javabrains.unit1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import io.javabrains.common.Person;

public class Unit1ExerciseSolutionJava8 {
	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlile", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		// Step 1: Sort list by last name
		Collections.sort(persons, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		//Collections.sort(persons, (p1,p2) -> Integer.compare(p1.getAge(), p2.getAge()));
		//Collections.reverse(persons); // After sort you need to reverse.
				
		// Step 2: Create a method that prints all elements in the list
		System.out.println("Print All the Person using Lamda");
		printAll(persons);
		printConditionally(persons, p -> true);

		// Step 3: Create a method that prints all the people that have last name
		// beginning with C
		
		System.out.println("Print All the Person that have last name beginning with C using passing behaviour using Lamda");
		printConditionally(persons, p -> p.getLastName().startsWith("C"));
		
		System.out.println("Print All the Person that have first name beginning with C using passing behaviour using Lamda");
		printConditionally(persons, p -> p.getFirstName().startsWith("C"));
	}

	private static void printConditionally(List<Person> persons, Condition condition) {
		for (Person person : persons)
			if (condition.test(person)) {
				System.out.println(person);
			}
	}

	private static void printAll(List<Person> persons) {
		for (Person people : persons)
			System.out.println(people);
	}
}
