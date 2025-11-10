package com.example.company;

public class CompanyApp {
	public static void main(String args[]) {
		Employee emp = new Employee("Alice", 101, "Sales", 60000.0);
		Manager mgr = new Manager("Bob", 201, "IT", 90000.0, "Project X");
		 System.out.println(emp.department); // Compilation error: department is protected, not accessible in non-subclass
	     System.out.println(emp.salary); // Accessible because salary is public
	        
	        // Call public methods
	     System.out.println(emp.getEmployeeDetails());
	     emp.displaySalaryInfo();
	        
	        // Attempt to call the private method
	        // System.out.println(emp.calculateAnnualBonus()); // Compilation error: calculateAnnualBonus() is private
	        
	        // Call methods from Manager class
	        mgr.displayManagerDetails();
	}
}
