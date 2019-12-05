package module3_4_Exercise_6;

public class Ex62 { // Define 2 random numbers and print all the numbers between them.
	public static void main(String[] args) {

		int num1 = (int) (Math.random() * 21);
		int num2 = (int) (Math.random() * 21);
		System.out.println(num1 + " is num1");
		System.out.println(num2 + " is num2");
		System.out.println("===========");

		if (num1 > num2) { // no need to swap values of the numbers, if-else is really nice looking.
			for (int i = num1; i >= num2; i--) {
				System.out.print(i + " ");
			}
		} else { // num2 >= num1 in this case.
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}
	}

}
