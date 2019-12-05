package module3_4_Exercise_6;

public class Ex64 { // Define two random numbers "max" and "den" and print all numbers from 0 to max
					// that are divided by den.
	public static void main(String[] args) {

		int max = (int) (Math.random() * 101);
		int den = (int) (Math.random() * 11);
		System.out.println("num is: " + max);
		System.out.println("den is: " + den);

		for (int i = 0; i <= max; i++) {
			if (i % den == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
