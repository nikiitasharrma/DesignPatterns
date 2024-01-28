package com.prototype.network;

/**
 * Prototype Design Pattern is a creational pattern that 
 * focuses on creating objects by copying an existing object, 
 * known as the prototype.
 * USeful when cost of creating an object is more expensive
 * than cloning one.  
 */

public class Client {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		NetworkConnection conn1 = new NetworkConnection();
		conn1.setIp("198.681.1.1");
		conn1.setImportantData("IP address of Asus Vivobook");
		conn1.veryImportantData();
		
		NetworkConnection conn2 = (NetworkConnection) conn1.clone();
		conn2.setIp("196.651.9.5");
		conn2.setImportantData("Ip address of Lenovo Yoga");
		conn2.veryImportantData();
		
	}
}
