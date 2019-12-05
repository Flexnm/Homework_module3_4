package module3_4_Exercise_5;

public class Ex51 { // Define 2 random numbers and print the larger one.
	public static void main(String[] args) {

		int num1 = (int) (Math.random() * 101);
		int num2 = (int) (Math.random() * 101);

		if (num1 > num2) {
			System.out.println("num1 has the larger value: " + num1);
		} else {
			System.out.println("num2 has the larger value: " + num2);
		}
	}

}
