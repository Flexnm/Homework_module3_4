package module3_4_Exercise_6;

public class Ex67 { // Define a random number between 0-100 and print the factorial value.
	public static void main(String[] args) {

		int num = (int) (Math.random() * 101);
		System.out.println(num);
		double factorial = 1; // setting the factorial to double because factorial numbers become really big
								// really fast.
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i; // calculating factorial numbers.
		}
		System.out.println(factorial);
	}

}
