package com.ptop.designpattern.singleton;

/**
 * 双重校验锁
 *
 * @author josh
 */
public class DoubleCheckSingleton {
	/**
	 * 防止java指令重排优化
	 */
	private volatile static DoubleCheckSingleton uniqueInstance;
	/**
	 * 构造方法私有化
	 */
	private DoubleCheckSingleton() {
	}
	/**
	 * 双重校验 获取实例
	 *
	 * @return
	 */
	public static DoubleCheckSingleton getInstance() {
		//第一次检查
		if (uniqueInstance == null) {
			synchronized (DoubleCheckSingleton.class) {
				//第二次检查
				if (uniqueInstance == null) {
					uniqueInstance = new DoubleCheckSingleton();
				}
			}
		}
		return uniqueInstance;
	}
}
