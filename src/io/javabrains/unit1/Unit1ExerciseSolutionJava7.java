package io.javabrains.unit1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import io.javabrains.common.Person;

public class Unit1ExerciseSolutionJava7 {
	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlile", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		// Step 1: Sort list by last name
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		/*
		 * Collections.sort(persons, new Comparator<Person>() {
		 * 
		 * @Override public int compare(Person o1, Person o2) { return
		 * Integer.compare(o1.getAge(), o2.getAge()); } });
		 */
		
		// Step 2: Create a method that prints all elements in the list
		System.out.println("Print All the Person");
		printAll(persons);

		// Step 3: Create a method that prints all the people that have last name
		// beginning with C
		System.out.println("Print All the Person that have last name beginning with C");
		printLastnameBeginningWithC(persons);
		
		System.out.println("Print All the Person that have last name beginning with C using passing behaviour");
		printConditionally(persons, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
		
		System.out.println("Print All the Person that have first name beginning with C using passing behaviour");
		printConditionally(persons, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
		});
	}

	private static void printConditionally(List<Person> persons, Condition condition) {
		for (Person person : persons)
			if (condition.test(person)) {
				System.out.println(person);
			}
	}

	private static void printLastnameBeginningWithC(List<Person> persons) {
		for (Person people : persons)
			if (people.getLastName().startsWith("C")) {
				System.out.println(people);
			}

	}

	private static void printAll(List<Person> persons) {
		for (Person people : persons)
			System.out.println(people);
	}
}

interface Condition {
	boolean test(Person p);
}
