package io.java8.telusko;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		/*
		 * int result = 0;
		 * 
		 * 
		 * for (int i : values) {
		 * 
		 * result = result + i*2;
		 * 
		 * }
		 */

		Function<Integer, Integer> f = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer i) {

				return i * 2;
			}
		};

		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer i, Integer j) {
				return i + j;
			}

		};

		Stream s = values.stream();
		Stream s1 = s.map(f);
									//2,4,6,8,10,12
		Integer result = (Integer) s1.reduce(0, b);
		System.out.println(result);
		System.out.println(values.stream().map(i -> i*2).collect(Collectors.toList()));

	}

}
