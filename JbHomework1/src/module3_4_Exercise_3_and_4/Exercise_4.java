package module3_4_Exercise_3_and_4;

public class Exercise_4 {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 101);
		int num2 = (int) (Math.random() * 101);

		// Print:

		// Each number.
		System.out.println("The frist number is: " + num1);
		System.out.println("The second number is: " + num2);

		// The sum of the numbers
		System.out.println("The sun of the numbers is: " + (num1 + num2));

		// The average value
		int avg = (num1 + num2) / 2;
		System.out.println("The average value is: " + avg);

		// The remainder when dividing each by 10
		System.out.println("The remainder when dividing the first by 10 is: " + num1 % 10);
		System.out.println("The remainder when dividing the second by 10 is: " + num2 % 10);

		// The area of a rectangle where one number is the width and the other is the
		// height.
		// This is similar to asking to multiply both numbers.
		System.out.println("The area of the required rectangle is: " + (num1 * num2));

	}

}
