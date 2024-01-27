package com.singleton.lazyway;

/**
 * Lazy way to enable a singleton design pattern
 * Object created only when the getSingleton method is called
 * Not thread-safe without synchronization
 */

public class LazySingleton {
	
	private static LazySingleton singleton;

	private LazySingleton() {
		
	}
	
	public static LazySingleton getSingleton() {
		if(singleton == null) {
			//Synchronized block to ensure thread safety
			synchronized(LazySingleton.class) {
				singleton = new LazySingleton();
			}
		}
		return singleton;
	}
	
}
