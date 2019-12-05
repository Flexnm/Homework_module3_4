package module3_4_Exercise_6;

public class Ex66 { // Define a random number between 0-100000 and print if it is palindrome (digits
					// are symetric)
	public static void main(String[] args) {

		int num = (int) (Math.random() * 100001);

		System.out.println("The number is: " + num);
		int t = num;
		int mun = 0;
		while (t > 0) { // making a new number with reverse digit order to then compare to original
						// number.
			mun = mun * 10;
			mun += t % 10;
			t = (int) (t / 10);
		}
		if (mun == num) {
			System.out.println("The number is a palindrome.");
		} else {
			System.out.println("The number is not a palindrome.");
		}
	}

}
