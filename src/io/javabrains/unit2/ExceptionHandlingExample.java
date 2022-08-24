package io.javabrains.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int[] someNumbers = { 1, 2, 3, 4, 5 };
		int key = 0;

		// Handling Exception while passing the Lamda
		process(someNumbers, key, (v, k) -> {
			try {
				System.out.println(v / k);
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
		});

		// Wrapping Exception handling with generic method

		process(someNumbers, key, wrapperLamda((v, k) -> System.out.println(v / k)));
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : someNumbers)
			consumer.accept(i, key);
	}

	private static BiConsumer<Integer, Integer> wrapperLamda(BiConsumer<Integer, Integer> consumer) {
		return (v, k) -> {
			try {
				consumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("Exception caught in Wrapper Lamda");
			}
		};

	}

}
