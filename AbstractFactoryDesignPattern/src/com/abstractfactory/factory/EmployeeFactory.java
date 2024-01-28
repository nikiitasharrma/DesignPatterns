package com.abstractfactory.factory;

import com.abstractfactory.employee.Employee;

/**
 * Adds an additional abstract layer of EmployeeAbstract Factory.
 * Not conditional statement unlike Factory design pattern.
 * Doesn't know which object is being created since no 
 * specification of concreate class
 */

public class EmployeeFactory {
	
	public static Employee getEmployee(EmployeeAbstractFactory factory) {
		return factory.createEmployee();
	}
}
