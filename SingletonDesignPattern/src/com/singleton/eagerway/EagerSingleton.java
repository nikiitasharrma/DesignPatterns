package com.singleton.eagerway;

/**
 * Eager way to enable a singleton design pattern
 * Object is create with class loading
 * Object is created even when it has no use
 * ****Not an efficient way****
 */

public class EagerSingleton {
	
	private static EagerSingleton singleton = new EagerSingleton();
	
	public static EagerSingleton getSingleton() {
		return singleton;
	}
	
}
