package com.singleton;

import com.singleton.eagerway.EagerSingleton;
import com.singleton.lazyway.LazySingleton;

/**
 * Singleton design pattern is a creational pattern which 
 * ensures that a class has only one instance
 */

public class Singleton {
	
	public static void main(String[] args) {
		
		//Lazy initialization
		LazySingleton singleton1 = LazySingleton.getSingleton();
		LazySingleton singleton2 = LazySingleton.getSingleton();
		
		System.out.println(singleton1);
		System.out.println(singleton2);
		
		//Eager initialization
		EagerSingleton singleton3 = EagerSingleton.getSingleton();
		EagerSingleton singleton4 = EagerSingleton.getSingleton();
		
		System.out.println(singleton3);
		System.out.println(singleton4);
	}
}
