package module3_4_Exercise_6;

public class Ex68 { // Define a random number between 0-50 "index" and print the Fibonacci number at
					// that index.
	public static void main(String[] args) {

		int index = (int) (Math.random() * 51);
		System.out.println("The number has index: " + index);

		int f1 = 0;
		int f2 = 1;
		for (int i = 1; i <= index; i++) { // this is a loop that just counts the fibonacci set up until a certain
											// index.
			int t = f1 + f2; // this is how a fibonacci set is defined in mathematics.
			f1 = f2;
			f2 = t;
		}
		System.out.println("The number at this index is: " + (double) f1);

	}

}
