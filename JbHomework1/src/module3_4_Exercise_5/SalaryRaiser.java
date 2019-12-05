package module3_4_Exercise_5;

// Ex54
public class SalaryRaiser {
	public static void main(String[] args) {
		// Define a random number names "salary" with a value between 5000-6000.
		// Raise the salary by 10% if the result is not greater than 6000.
		// Print the current salary and the updated salary

		int salary = (int) ((Math.random() * 1001) + 5000);
		System.out.println("Current salary: " + salary);

		int raise = (int) (salary * 0.1);
		if ((salary + raise) <= 6000) { // 6000 is the maximum salary that is given before and after raise.
			System.out.println("The updated salary is: " + (salary + raise));
		}
	}

}
