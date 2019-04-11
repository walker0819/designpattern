package com.ptop.designpattern.singleton;

/**
 * 饿汉方式
 *
 * @author josh
 */
public class HungrySingleton {
	private static HungrySingleton singleton = new HungrySingleton();

	private HungrySingleton() {

	}
	public static HungrySingleton getInstance() {
		return singleton;
	}
}
