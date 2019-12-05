package module3_4_Exercise_6;

public class Ex65 { // Define a random number between 0 to 10000
	public static void main(String[] args) {

		int num = (int) (Math.random() * 10001);
		System.out.println("num is: " + num);
		// print:
		// the number of digits
		int num1 = num; // defining num1, num2, num3 and num4 because num needs to stay intact for all
						// the calculations.
		int dig = 0; // dig is short for digits
		while (num1 > 0) {
			num1 = (int) (num1 / 10);
			dig += 1;
		}
		System.out.println("Number of digits is: " + dig);

		// the first left most digit
		int num2 = num;
		while (num2 >= 10) {
			num2 = num2 / 10;
		}
		System.out.println("Left most digit is: " + num2);

		// the sum of the digits
		int num3 = num;
		int sum = 0;
		while (num3 > 0) {
			sum += num3 % 10;
			num3 = (int) (num3 / 10);
		}
		System.out.println("The sum of the digits is: " + sum);

		// reverse order of digits
		int num4 = num;
		int mun = 0; // mun is the reverse letter order of num.
		while (num4 > 0) {
			mun = mun * 10; // this is here because 0*10 = 0 and if this will be placed after mun += num4 %
							// 10; then when we add the last digit of num4 the number will go through an
							// unnecessary *10.
			mun += num4 % 10;
			num4 = (int) (num4 / 10);
		}
		System.out.println(mun);

	}

}
