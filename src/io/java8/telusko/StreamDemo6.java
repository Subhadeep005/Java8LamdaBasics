package io.java8.telusko;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo6 {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("Prakash", "Samir", "Subha", "Holly", "Neha", "Koushik");
		// stream.forEach(i -> System.out.println(i));
		// stream.forEach(System.out::println);

		/*
		 * try { stream.forEach(System.out::println); } catch (Exception e) {
		 * System.out.println("Exception Occur:" + e); }
		 */

		/*
		 * try { System.out.println(stream.collect(Collectors.toList())); } catch
		 * (Exception e) { System.out.println("Exception Occur :" + e); }
		 */

		// stream.peek(c -> System.out.println(c)).count();

		stream.filter(p -> p.startsWith("S")).peek(c -> System.out.println("Filtered Value :" + c))
				.map(String::toUpperCase).peek(c -> System.out.println("Uppercase Value :" + c)).count();

	}

}
