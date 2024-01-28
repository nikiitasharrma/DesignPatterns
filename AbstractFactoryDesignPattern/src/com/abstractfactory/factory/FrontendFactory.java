package com.abstractfactory.factory;

import com.abstractfactory.employee.Employee;
import com.abstractfactory.employee.FrontendDeveloper;

public class FrontendFactory extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		return new FrontendDeveloper();
	}

}
