package module3_4_Exercise_6;

public class Boom { // Create the game "7 boom" for numbers between 0-100.
	public static void main(String[] args) {
		// if the current number can be divided by 7 - print "boom"
		// if the current number has the digit 7 - print "boom"
		// otherwise - print the number.

		for (int i = 0; i <= 100; i++) {
			if (i % 7 == 0 && i != 0) {
				System.out.println("boom"); // prints "boom" for every number divided by 7.
			} else if (i % 10 == 7 || (int) ((i / 10) % 10) == 7) {
				System.out.println("boom"); // if first digit is 7, print "boom" OR if the first digit of i/10 is 7,
											// print "boom".
			} else {
				System.out.println(i);
			}
		}

	}

}
