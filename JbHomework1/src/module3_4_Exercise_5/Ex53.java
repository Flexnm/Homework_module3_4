package module3_4_Exercise_5;

public class Ex53 { // Define a random number between 0-100.
	public static void main(String[] args) {
		// If the value is between 0-50 - print "Small!"
		// else - print "Big!"
		// If the value is even - print "Even"
		// else print "Odd"

		int num = (int) (Math.random() * 101);

		if (num <= 50) {
			System.out.println("Small!");
		} else {
			System.out.println("Big!");
		}
		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

}
