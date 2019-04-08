package com.ptop.designpattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 实现调用类
 */
public class ShootInvocationHandler implements InvocationHandler {
	private ShootingWork star;
	/**
	 * 构造方法中动态传入对象
	 *
	 * @param star
	 */
	public ShootInvocationHandler(ShootingWork star) {
		this.star = star;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("动态代理人开始协商合同");
		System.out.println("动态代理人开始签合同");
		return method.invoke(star, args);
	}
}
