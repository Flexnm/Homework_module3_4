package module3_4_Exercise_5;

public class Ex57 { // Define a random number to present a year and print if the year is a leap
					// year.
	public static void main(String[] args) {
		// leap year: divided by 4, not divided by 100. but if divided by 100, it is a
		// leap year if it also divided by 400.

		int year = (int) ((Math.random() * 4001) - 2000); // I decided to run between 2000BC to 2000AD, doesnt really
															// matter.

		if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) { // Definition of leap year
			if (year < 0) {
				System.out.println((year * -1) + "BC is leap year"); // * -1 because the negative years are the BC
																		// years.
			} else {
				System.out.println(year + "AD is leap year");
			}
		} else {
			if (year < 0) {
				System.out.println((year * -1) + "BC is not leap year"); // * -1 because the negative years are the BC
																			// years.
			} else {
				System.out.println(year + "AD is not leap year");
			}
		}
	}

}
