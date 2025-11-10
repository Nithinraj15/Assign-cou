package com.example.company;

public class Employee {
	// here all the attributes were declared 
	//name in private
	// employeeid in int , department in protected salary in double on public
	private String name;
	int employeeId;         //This will be `default` or package-private)
	protected String department;
	public double salary;
	// Constructor fo the clsaa Employee
	public Employee(String name, int employeeId, String department, double salary) {
		this.name = name;
		this.employeeId = employeeId;
		this.department = department;
		this.salary = salary;
	}
	// getName() is used to acces the private name on other class
	 public String getName() {
	        return this.name;
	    }
	 // this will give the Employee details
	public String getEmployeeDetails() {
		return "Employee Name: " + this.name + " Employee Id: " + this.employeeId;
	}
	// it is used to calculate the Annual Bonus
	private double calculateAnnualBonus() {
		double bonus = salary * 0.10;
		return bonus;
	}
	//it is used to display the Salary info
	public void displaySalaryInfo() {
		System.out.println(getEmployeeDetails());
		System.out.println("Calculated bonus: " + calculateAnnualBonus());
	}
}
