package io.java8.telusko;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;


public class CollectionIterationExample2 {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		System.out.println("Printing Collection values with External Iteration");
		System.out.println("Using For loop");
		for(int i=0; i < values.size() ; i++) {
			System.out.println(values.get(i));
		}
		
		System.out.println("Using Iterator");
		Iterator<Integer> it = values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Using Enhanced For loop");
		for(Integer i : values) {
			System.out.println(i);
		}
		System.out.println("Printing Collection values with Internal Iteration");
		System.out.println("Using ForEach and Lamda expression using Consumer Interface");
		values.forEach(i -> System.out.println(i));
		
		System.out.println("Internal View");
		Consumer<Integer> c= new Consumer<Integer>() {

			@Override
			public void accept(Integer i) {
				System.out.println(i);
			}
		};
		values.forEach(c);
		
		System.out.println("Using method Reference");
		values.forEach(System.out::println); // Call by method
		
		System.out.println("Method Reference example");
		values.forEach(CollectionIterationExample2::doubleIt);
	}

	private static void doubleIt(Integer i) {
		System.out.println(i*2);
	}

}

