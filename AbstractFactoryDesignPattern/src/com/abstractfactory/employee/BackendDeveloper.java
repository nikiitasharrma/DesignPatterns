package com.abstractfactory.employee;

public class BackendDeveloper implements Employee {

	@Override
	public int salary() {
		return 100000;
	}

	@Override
	public String name() {
		System.out.println("I am a Backend developer");
		return "BACKEND DEVELOPER";
	}

}
