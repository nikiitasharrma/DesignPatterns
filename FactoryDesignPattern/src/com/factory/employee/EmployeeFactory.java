package com.factory.employee;

public class EmployeeFactory {
	
	public static Employee getEmployee(String empType) {
		if(empType.equalsIgnoreCase("BACKEND DEVELOPER")) {
			return new BackendDeveloper();
		}
		else if(empType.equalsIgnoreCase("FRONTEND DEVELOPER")) {
			return new FrontendDeveloper();
		}
		else{
			throw new RuntimeException("Not a valid employee type");
		}
	}
}
