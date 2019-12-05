package module3_4_Exercise_6;

public class Ex69 { // Define a random number between 0-50 and print the fibonacci set up
					// to that number (from 1).
	public static void main(String[] args) {

		int num = (int) (Math.random() * 51);
		System.out.println("The number is: " + num);

		int f1 = 0;
		int f2 = 1;
		for (int i = 1; i < num; i += f2 - f1) { // i += f2 - f1 is like saying i == f1. but because the loop is always
													// adding to i rather than replacing it then this is like moving i
													// along the fibonacci set.
			int t = f1 + f2;
			f1 = f2;
			f2 = t;
			System.out.print(f1 + " ");
		}

	}

}
