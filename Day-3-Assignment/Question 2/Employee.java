
public class Employee {
	public static void main(String args[]) {
		//Employee information
		String name = "Maxwell Zuma";
		int dayOfBirth = 1;
		int monthOfBirth = 4;
		int birthYear = 2001;
		int monthlySalary = 4500;
		
		//Calculate tax payable
		double tax = getTaxAmount(monthlySalary);
		double annualTax = tax * 12;
		//Calculate annual salary
		double annualSalary = 12 * (monthlySalary-tax);
		
		//Calculate age
		int age = 2020 - 2001;
		
		//Display employee information
		System.out.printf("Name: %s\nAge: %d\n"
				+ "AnnualSalary: %.2f\n"
				+ "TaxAmount: %.2f", name, age, annualSalary,
				annualTax);
	}
	static double getTaxAmount(int salary) {
		/*The tax percentages are given below
		 * 5000 - 20%
		 * 4000 - 15%
		 * 3000 - 10%
		 * 2000 - 5%
		 * */
		double tax = 0;
		if (salary>= 5000)
			tax = 0.2*salary;
		else if (salary>= 4000)
			tax = 0.15*salary;
		else if (salary>= 3000)
			tax = 0.1*salary;
		else if (salary>= 2000)
			tax = 0.05*salary;
		return tax;
	}
}
