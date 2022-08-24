package io.javabrains.unit2;

public class ThisReferenceExample {

	public static void main(String[] args) {
		
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		thisReferenceExample.doProcess(10, new Process() {

			@Override
			public void process(int i) {
				System.out.println("Value of i is :" + i);
				System.out.println(this);
			}

			@Override
			public String toString() {
				return "This is the anonumous inner class";
			}
		});

		thisReferenceExample.doProcess(10, i -> {
			System.out.println("Value of i is :" + i);
			// System.out.println(this); // Not allowed because Anonymous class treat as a
			// instance of the class but Lamda is not the instance of the class
		});

		thisReferenceExample.execute();
	}

	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public void execute() {
		doProcess(10, i -> {
			System.out.println("Value of i is :" + i);
			System.out.println(this);
		});
	}

	@Override
	public String toString() {
		return "This is the main ThisReferenceExample class instance";
	}
}
