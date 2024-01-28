package com.iterator.client;

import com.iterator.MyIterator;
import com.iterator.user.User;
import com.iterator.user.UserManagement;

/**
 * Iterator design pattern is a behavioral design pattern 
 * which provides a way to access elements of an object 
 * without exposing it's underlying implementation.
 * We only have to change MyIteratorImpl class' 
 * implementation to provide different functionalities 
 * in order to traverse over different collections.
 */

public class IteratorClient {
	
	public static void main(String[] args) {
		
		UserManagement userManagement = new UserManagement();
		
		userManagement.addUser(new User("Michael","1"));
		userManagement.addUser(new User("Pam","2"));
		userManagement.addUser(new User("Jim","3"));
		
		MyIterator myIterator = userManagement.getIterator();
		
		while(myIterator.hasNext()) {
			User user = myIterator.next();
			System.out.println(user.getName() + " " + user.getUserId());
		}
	}
}
