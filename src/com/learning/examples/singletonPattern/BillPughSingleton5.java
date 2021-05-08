
package com.learning.examples.singletonPattern;

/**
 * @author nishant.bhardwaz
 *
 */
public class BillPughSingleton5 {

	private BillPughSingleton5() {
	}

	private static class SingletonHelper {
		private static final BillPughSingleton5 INSTANCE = new BillPughSingleton5();
	}

	public static BillPughSingleton5 getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
