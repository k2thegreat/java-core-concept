
package com.learning.examples.singletonPattern;

/**
 * @author nishant.bhardwaz
 *
 */
public class LazyInitializedSingleton3 {

	private static LazyInitializedSingleton3 instance;

	private LazyInitializedSingleton3() {
	}

	public static LazyInitializedSingleton3 getInstance() {
		if (instance == null) {
			instance = new LazyInitializedSingleton3();
		}
		return instance;
	}
}
