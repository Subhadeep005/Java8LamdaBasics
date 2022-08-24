package io.javabrains.unit1;

public class TypeInterfaceExample {

	public static void main(String[] args) {
		
		StringLengthLamda myLamda = str -> str.length();
		System.out.println(myLamda.getLength("Hello World !!"));
		printLamda(str -> str.length());

	}

	public static void printLamda(StringLengthLamda l) {
		System.out.println(l.getLength("Hello World !!"));
	}
	
	interface StringLengthLamda{
		
		int getLength(String s);
	}
}
