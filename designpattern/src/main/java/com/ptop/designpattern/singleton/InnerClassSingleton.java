package com.ptop.designpattern.singleton;

/**
 * 静态内部类
 *
 * @author josh
 */
public class InnerClassSingleton {
	private static class Singleton {
		public static InnerClassSingleton singleton = new InnerClassSingleton();
	}

	private InnerClassSingleton() {

	}
	public InnerClassSingleton getInstance() {
		return Singleton.singleton;
	}
}
