package io.java8.telusko;

interface Phone {
	void call();

	default void message() {
		System.out.println("Sent");
	}

	static void contacts() {
		System.out.println("Contact List");
	}
}

class AndroidPhone implements Phone {

	@Override
	public void call() {
		System.out.println("Calling");
	}

}

public class DefaultMethodOfJava8 {

	public static void main(String[] args) {
		Phone phone = new AndroidPhone();
		phone.call();
		phone.message();
		Phone.contacts();
	}

}
