package io.java8.telusko;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo5LazyEvaluationandTerminalFunction {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

		int result = 0;

		for (int i : values) {
			if (i % 5 == 0) {
				result = i * 2;
				break;
			}
		}
		System.out.println(result);

		System.out.println(values.stream().filter(StreamDemo5LazyEvaluationandTerminalFunction::isDivisible) // Lazy Function and its do Lazy Evaluation
										  .map(StreamDemo5LazyEvaluationandTerminalFunction::mapDouble) // Lazy Function and its do Lazy Evaluation
										  .findFirst() // Eager Method or Terminal Function
										  .orElse(0));

	}

	public static boolean isDivisible(int i) {
		System.out.println("In isDiv :" + i);
		return i % 5 == 0;
	}

	public static int mapDouble(int i) {
		System.out.println("In mapDouble :"+i);
		return i*2;
	}

}
