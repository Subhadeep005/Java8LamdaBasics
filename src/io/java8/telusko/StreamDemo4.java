package io.java8.telusko;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

		System.out.println(values.stream().filter(p -> p % 5 == 0).reduce(0, Integer::sum));
		System.out.println(values.stream().filter(p -> p % 5 == 0).map(i -> i*2).reduce(0, Integer::sum));
		System.out.println(values.stream().filter(p -> p % 5 == 0).map(i -> i*2).findFirst()); // It will return the value Optional. Because the list may not have the value which divisible by 5. In that case it will not throw any error.
		System.out.println(values.stream().filter(p -> p % 5 == 0).map(i -> i*2).findFirst().orElse(0));

	}

}
