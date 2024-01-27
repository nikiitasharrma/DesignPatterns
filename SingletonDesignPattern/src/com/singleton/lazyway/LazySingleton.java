package com.singleton.lazyway;

import java.io.Serializable;

/**
 * Lazy way to enable a singleton design pattern
 * Object created only when the getSingleton method is called.
 * Not thread safe without synchronized block.
 * 
 * Breach within singleton design pattern can be caused by:
 * 1. Reflection api: Making constructor accessible using 
 *    reflections and creating another object
 *    Solution: additional conditional statement inside constructor
 *    
 * 2. Serialization-Deserialization: serializing the instance of class
 *    and then deserializing it, creates another instance of the singleton class
 *    Solution: implement the readResolve method of Serializable interface, making 
 *    it return the single instance of the class during deserialization.
 *    
 * 3. Cloning: making a clone of the single instance using Cloneable interface
 *    creates another instance of the class.
 *    Solution: override clone() method making it return the single instance.
 */

public class LazySingleton implements Serializable, Cloneable {
	
	private static LazySingleton singleton;

	private LazySingleton() {
		//preventing breach through reflection api
		if(singleton != null) {
			throw new RuntimeException("Breaking singleton design pattern is not premitted!");
		}
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
	
	public Object readResolve() {
		return singleton;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return singleton;
	}
	
}
