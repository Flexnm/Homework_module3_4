package module3_4_Exercise_5;
// Ex56
public class TaxCalculator {
	public static void main(String[] args) {
		// Salary taxes are calcualted according to the following:
		// 0 - 23000 - tax rate is 10%
		// 23000 - 50000 - tax rate is 20%
		// 50000 - 100000 - tax rate is 30%
		// 100000 - up - tax rate is 40%
		// define a random number that is the employee salary and print the value after
		// the tax calculation.

		int salary = (int) (Math.random() * 100001); // salary 0-1000000
		int newsal = salary; // newsal is defined in order to compare before the after calculation.
		int t1 = 23000; // tax steps like we did with the flowchart
		int t2 = 50000;
		int t3 = 100000;
		// pretty much similar to the flowchart.
		if (salary <= t1) {
			newsal = salary - (int) (salary * 0.1);
		} else if (salary <= t2) {
			newsal = salary - (int) (((salary - t1) * 0.2) + t1 * 0.1);
		} else if (salary <= t3) {
			newsal = salary - (int) (((salary - t2) * 0.3) + t1 * 0.1 + t2 * 0.2);
		} else {
			newsal = salary - (int) (((salary - t3) * 0.4) + t1 * 0.1 + t2 * 0.2 + t3 * 0.3);
		}
		System.out.println("Before tax: " + salary);
		System.out.println("After tax: " + newsal);
		// always printing both original value and post calculation value to check if
		// there were no mistakes.
	}

}
