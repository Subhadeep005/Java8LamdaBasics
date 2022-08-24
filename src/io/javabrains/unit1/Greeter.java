package io.javabrains.unit1;

public class Greeter {

	public void greet(Greetings greetings) {
		//System.out.println("Hello World!");
		greetings.perform();
	}
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		/*
		 *  Greetings greetings = new
		 * HelloWorldGreeting(); HelloWorldGreeting helloWorldGreeting = new
		 * HelloWorldGreeting(); greeter.greet(helloWorldGreeting);
		 * greeter.greet(greetings); greetings.perform();
		 * 
		 * Greetings greetings1 = new Greetings() {
		 * 
		 * @Override public void perform() {
		 * System.out.println("Hello World from Anonymous Class"); } };
		 * greetings1.perform();
		 */
		MyLamda myLamdaFunction = () -> System.out.println("Hello World from My Lamda !");
		myLamdaFunction.foo();
		
		//MyAdd addFunction = (int a, int b) -> a + b ;
		
		Greetings greetings = new HelloWorldGreeting();
		
		Greetings myLamdaFunction1 = () -> System.out.println("Hello World from Lamda !");
		
		greetings.perform();
		myLamdaFunction1.perform();
		
		Greetings innerClassGreeting = new Greetings() {
			  
			  @Override public void perform() {
			  System.out.println("Hello World from Anonymous Class !"); 
			  } 
		};
		
		greeter.greet(myLamdaFunction1);
		greeter.greet(() -> System.out.println("Hello World from Lamda 2!"));
		greeter.greet(innerClassGreeting);
		
	}
}


  interface MyLamda{
  
  void foo(); }
  
  interface MyAdd{ int add(int a, int b); }
 