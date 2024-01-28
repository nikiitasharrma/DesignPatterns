package com.abstractfactory.employee;

public class FrontendDeveloper implements Employee {
	
	@Override
	public int salary() {
		return 90000;
	}

	@Override
	public String name() {
		System.out.println("I am a Frontend developer");
		return "FRONTEND DEVELOPER";
	}
}
