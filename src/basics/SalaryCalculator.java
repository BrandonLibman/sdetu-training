package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// Let's create a variable to define our career
		
		// Declare a variable
		String career;
		System.out.println("Program is starting");
		
		// Defined a variable
		career = "electrician";
		System.out.println("My career is: " + career);
		
		// Declare & Define
		int hoursPerWeek = 40;
		int weeksPerYear = 48;
		double rate = 19.34;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as an " + career + " at the rate of $" + rate + "/hr " +"is: $" + salary + " per year.");
	}
}
