package com.iterator;

import java.util.List;

import com.iterator.user.User;

public class MyIteratorImpl implements MyIterator{
	
	private List<User> list;
	private int length;
	
	private int position = 0;
	
	public MyIteratorImpl(List<User> list) {
		this.list = list;
		length = this.list.size();
	}
	
	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public boolean hasNext() {
		if(position >= length) {
			return false;
		}
		return true;
	}

	@Override
	public User next() {
		User user = list.get(position);
		position++;
		return user;
	}

}
