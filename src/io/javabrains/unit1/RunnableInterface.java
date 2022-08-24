package io.javabrains.unit1;

public class RunnableInterface {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed inside Runnable");
			}
		});
		myThread.run();
		
		Thread myLamdaThread2 = new Thread(() -> System.out.println("Printed inside Lamda Runnable"));
		myLamdaThread2.run();
	}

}
