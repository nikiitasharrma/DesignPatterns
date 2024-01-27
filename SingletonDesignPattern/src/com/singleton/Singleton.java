package com.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.singleton.eagerway.EagerSingleton;
import com.singleton.lazyway.LazySingleton;

/**
 * Singleton design pattern is a creational pattern which 
 * ensures that a class has only one instance
 */

public class Singleton {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {
		
		//Lazy initialization
		LazySingleton singleton1 = LazySingleton.getSingleton();
		LazySingleton singleton2 = LazySingleton.getSingleton();
		
		//return same hashcode values
		System.out.println(singleton1);
		System.out.println(singleton2);
		
		//Eager initialization
		EagerSingleton singleton3 = EagerSingleton.getSingleton();
		EagerSingleton singleton4 = EagerSingleton.getSingleton();
		
		//return same hashcode values
		System.out.println(singleton3);
		System.out.println(singleton4);
		
		/**
		 * Singleton pattern can be broken using 3 ways:
		 * 1. through reflection api
		 * 2. through serialization
		 * 3. through cloning
		 */
		
		/**
		 * Using reflection api to make constructor of class LazySingleton accessible
		 * and then creating two objects. Resolved by adding a condtional statement to 
		 * the constructor of class
		 */
		Constructor<LazySingleton> constructor = LazySingleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		
		LazySingleton singleton5 = constructor.newInstance();
		
		//return different hashcode values if not resolved. Otherwise, throws RuntimeException
		System.out.println(singleton1);
		System.out.println(singleton5);
		
		/**
		 * Serializing the singleton instance of class and then deserializing it into 
		 * another object can lead to a breach in singleton design pattern. This can be 
		 * resolved by implementing readResolve method in the class.
		 */
		
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("abc.ob"));
		obj.writeObject(singleton1);
		obj.close();
		
		ObjectInputStream inObj = new ObjectInputStream(new FileInputStream("abc.ob"));
		LazySingleton singleton6 = (LazySingleton) inObj.readObject();
		inObj.close();
		
		//returns different hashcodes if not resolved. Otherwise, returns same values
		System.out.println(singleton1);
		System.out.println(singleton6);
		
		/**
		 * Cloning is another way through which singleton design pattern can be breached. 
		 * This can be resolved by overriding the clone() method of Cloneable
		 */
		
		LazySingleton singleton7 = (LazySingleton) singleton1.clone();
		
		//returns different hashcodes if not resolved. Otherwise, returns same values.
		System.out.println(singleton1);
		System.out.println(singleton7);
	}
}
