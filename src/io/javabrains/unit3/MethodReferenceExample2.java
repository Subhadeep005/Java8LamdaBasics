package io.javabrains.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.javabrains.common.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlile", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		System.out.println("Print All the Person using method references");
		printConditionally(persons, p -> true, System.out::println); // p -> method(p)

	}

	private static void printConditionally(List<Person> persons, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person person : persons)
			if (predicate.test(person)) {
				consumer.accept(person);
			}
	}
}
