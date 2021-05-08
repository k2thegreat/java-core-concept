
package com.learning.examples.singletonPattern;

/**
 * @author nishant.bhardwaz
 *
 */
public class ThreadSafeSingleton4 {

	private static ThreadSafeSingleton4 instance;

	private ThreadSafeSingleton4() {
	}

	public static synchronized ThreadSafeSingleton4 getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton4();
		}
		return instance;
	}

}
