package com.abstractfactory.client;

import com.abstractfactory.employee.Employee;
import com.abstractfactory.factory.BackendFactory;
import com.abstractfactory.factory.EmployeeFactory;
import com.abstractfactory.factory.FrontendFactory;

/**
 * Abstract factory design pattern is a creational design pattern 
 * which implements the concept of factory of factories. It adds 
 * an extra abstract layer so that object is created without 
 * specifying their concrete class.
 */

public class Client {
	
	public static void main(String[] args) {
		
		Employee emp1 = EmployeeFactory.getEmployee(new BackendFactory());
		Employee emp2 = EmployeeFactory.getEmployee(new FrontendFactory());
		
		String str1 = emp1.name();
		System.out.println(str1 + ": " + emp1.salary());
		String str2 = emp2.name();
		System.out.println(str2 + ": " + emp2.salary());
	}
}
