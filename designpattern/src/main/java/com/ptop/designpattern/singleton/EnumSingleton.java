package com.ptop.designpattern.singleton;

/**
 * 枚举方式
 *
 * @author josh
 */
public class EnumSingleton {

	private EnumSingleton() {

	}

	public static EnumSingleton getInstance() {
		return SingletonEnum.SINGLETON_ENUM.getInstance();
	}
	private enum SingletonEnum {
		//定义枚举值
		SINGLETON_ENUM;
		private EnumSingleton singleton;
		private SingletonEnum() {
			singleton = new EnumSingleton();
		}

		public EnumSingleton getInstance() {
			return singleton;
		}
	}
}
