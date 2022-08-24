package io.java8.telusko;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		System.out.println(values.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));
		System.out.println(values.stream().map(i -> i * 2).reduce(0, (c, e) -> Integer.sum(c, e)));
		System.out.println(values.stream().map(i -> i * 2).reduce(0, Integer::sum));

	}

}
