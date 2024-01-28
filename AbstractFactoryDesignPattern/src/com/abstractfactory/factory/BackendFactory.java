package com.abstractfactory.factory;

import com.abstractfactory.employee.BackendDeveloper;
import com.abstractfactory.employee.Employee;

public class BackendFactory extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		return new BackendDeveloper();
	}

}
