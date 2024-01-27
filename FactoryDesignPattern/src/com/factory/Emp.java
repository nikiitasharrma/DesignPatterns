package com.factory;

import com.factory.employee.Employee;
import com.factory.employee.EmployeeFactory;

/**
 * Factory design pattern is a creational design pattern used when a 
 * superclass has multiple subclasses. In this design pattern, an 
 * object of a specific subclass is returned based on an input.
 */

public class Emp {
	
	public static void main(String[] args) {
		Employee emp1 = EmployeeFactory.getEmployee("BACKEND DEVELOPER");
		System.out.println("Salary of employee is: " + emp1.salary());
		
		Employee emp2 = EmployeeFactory.getEmployee("FRONTEND DEVELOPER");
		System.out.println("Salary of employee is: " + emp2.salary());
	}
}
