package com.prototype.network;

/**
 * Implementing Cloneable interface to enable cloning of 
 * instance of this class and overriding the clone method 
 * to make it visible
 */

public class NetworkConnection implements Cloneable {
	
	private String ip;
	private String importantData;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getImportantData() {
		return importantData;
	}
	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	
	public void veryImportantData() {
		System.out.println(importantData + ": " + ip);
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
