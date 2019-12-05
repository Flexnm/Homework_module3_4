package module3_4_Exercise_6;

public class Ex61 { // Define a random number and print all numbers from 1 to that number.
	public static void main(String[] args) {

		int num = (int) (Math.random() * 11);

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}

	}

}
