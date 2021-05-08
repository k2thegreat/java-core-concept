
package com.learning.examples.singletonPattern;

/**
 * @author nishant.bhardwaz
 *
 */
public class EagerInitializedSingleton1 {

	private static final EagerInitializedSingleton1 instance = new EagerInitializedSingleton1();

	// private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton1() {
	}

	public static EagerInitializedSingleton1 getInstance() {
		return instance;
	}
}
