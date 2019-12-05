package module3_4_Exercise_5;

public class Ex55 { // Define 3 random number and print the larger of the 3.
	public static void main(String[] args) {

		int num1 = (int) (Math.random() * 101);
		int num2 = (int) (Math.random() * 101);
		int num3 = (int) (Math.random() * 101);

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

		if (num1 > num2 && num1 > num3) { // num1 > num2&num3.
			System.out.println(num1 + " is the largest.");
		} else if (num2 > num3) { // num2 > num3 > num1
			System.out.println(num2 + " is the largest.");
		} else { // num3 > num2 > num1
			System.out.println(num3 + " is the largest.");
		}
	}

}
