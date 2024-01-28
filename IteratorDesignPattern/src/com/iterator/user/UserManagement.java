package com.iterator.user;

import java.util.ArrayList;
import java.util.List;

import com.iterator.MyIterator;
import com.iterator.MyIteratorImpl;

public class UserManagement {
	
	List<User> list = new ArrayList<>();
	
	public void addUser(User user) {
		list.add(user);
	}
	
	public MyIterator getIterator(){
		return new MyIteratorImpl(list);
	}
}
