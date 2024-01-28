package com.abstractfactory.factory;

import com.abstractfactory.employee.Employee;

/**
 * The additional abstract layer which hides the concrete 
 * class whose instance has to be created
 */

abstract public class EmployeeAbstractFactory {
	
	public abstract Employee createEmployee();
}
