package module3_4_Exercise_5;

public class Ex52 { // Define a random number between 0-100
	public static void main(String[] args) {

		int num = (int) (Math.random() * 101);

		// If the number is greater than 50 - print "Big!"
		// If the number is smaller than 50 - print "Small!"
		// If the number is equals to 50 - print "Bingo!"
		if (num > 50) {
			System.out.println("Big!");
		} else if (num < 50) {
			System.out.println("Small!");
		} else {
			System.out.println("Bingo!");
		}

	}

}
