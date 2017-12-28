package basics;

public class salaryCalculator {
	public static void main(String[] Args) {
		//We Will create a variable to define our career
		
		//Declare a variable
		String career;
		System.out.println("Program Is Starting");
		
		//define a variable
		career = "Software Developer";
		System.out.println("My Career Is " + career);
		
		//declare and define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My Salary as a " + career + " at the rate of "+ rate + 
				" is Rp." + salary + " Per Year");		
		
		//Computer Our Annual Salary
		//Rate * hoursPerweek * weekPerYears
	}
}
