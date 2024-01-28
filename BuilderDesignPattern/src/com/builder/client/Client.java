package com.builder.client;

import com.builder.user.User;

/**
 * Builder design pattern is a creational design pattern that 
 * creates objects step by step and returns final object with 
 * the desired set of attributes.
 * Generally used when immutable objects are required.
 */

public class Client {
	
	public static void main(String[] args) {
		
		User user = new User.UserBuilder()
				            .setUserId(123)
				            .setUserName("nikita")
				            .setUserEmail("nikita@example.com")
				            .build();
		
		System.out.println(user);
	}
}
