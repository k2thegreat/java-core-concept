
package com.learning.examples.singletonPattern;

import java.lang.reflect.Constructor;

/**
 * @author nishant.bhardwaz
 *
 */
public class ReflectionSingletonTest6 {

	public static void main(String[] args) {
		EagerInitializedSingleton1 instanceOne = EagerInitializedSingleton1.getInstance();
		EagerInitializedSingleton1 instanceTwo = null;
		try {
			Constructor[] constructors = EagerInitializedSingleton1.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (EagerInitializedSingleton1) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

}
