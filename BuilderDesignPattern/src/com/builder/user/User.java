package com.builder.user;

/**
 * A static inner class is used to create setters of 
 * attributes of the object to make the object immutable.
 */

public class User {
	
	private final int userId;
	private final String userName;
	private final String userEmail;
	
	private User(UserBuilder userbuilder) {
		this.userId = userbuilder.userId;
		this.userName = userbuilder.userName;
		this.userEmail = userbuilder.userEmail;
	}
	
	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + "]";
	}



	public static class UserBuilder {
		
		private int userId;
		private String userName;
		private String userEmail;
		
		public UserBuilder setUserId(int userId) {
			this.userId = userId;
			return this;
		}
		
		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}
		
		public UserBuilder setUserEmail(String userEmail) {
			this.userEmail = userEmail;
			return this;
		}
		
		public User build(){
			User user = new User(this);
			return user;
		}
		
	}
}
