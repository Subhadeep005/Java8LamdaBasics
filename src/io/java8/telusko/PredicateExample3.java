package io.java8.telusko;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample3 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Multiple Filters

		List<Integer> collect = list.stream().filter(x -> x > 5 && x < 8).collect(Collectors.toList());

		System.out.println(collect); // [6, 7]

	}

}
