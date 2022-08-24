package io.java8.telusko;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample7 {

	public static void main(String[] args) {

		// Predicate Chaining

		Predicate<String> startWithA = x -> x.startsWith("a");

		// start with 'a' or 'm'
		boolean result = startWithA.or(x -> x.startsWith("m")).test("mkyong");
		System.out.println(result); // true

		boolean result2 = startWithA.and(x -> x.length() == 3).negate().test("abc");
		System.out.println(result2); // false

	}

}