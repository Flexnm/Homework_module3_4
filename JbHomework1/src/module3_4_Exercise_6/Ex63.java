package module3_4_Exercise_6;

public class Ex63 { // Define a random number and print all even numbers from 0 to the number.
	public static void main(String[] args) {

		int num = (int) (Math.random() * 101);
		System.out.println("num is: " + num);

		for (int i = 0; i <= num; i += 2) {
			System.out.print(i + " ");
		}
	}

}
