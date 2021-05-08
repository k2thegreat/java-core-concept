
package com.learning.examples.singletonPattern;

/**
 * @author nishant.bhardwaz
 *
 */
public class StaticBlockSingleton2 {

	private static StaticBlockSingleton2 instance;

	private StaticBlockSingleton2() {
	}

	// static block initialization for exception handling
	static {
		try {
			instance = new StaticBlockSingleton2();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockSingleton2 getInstance() {
		return instance;
	}
}
