package com.ptop.designpattern.singleton;

/**
 * 懒汉方式
 *
 * @author josh
 */
public class LazySingleton {
	private static LazySingleton lazySingleton = null;
	private LazySingleton() {
	}
	public static synchronized LazySingleton getInstance() {
		if (lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}
}
