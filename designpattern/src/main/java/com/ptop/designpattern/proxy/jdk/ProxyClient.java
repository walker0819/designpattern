package com.ptop.designpattern.proxy.jdk;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

/**
 * 客户端
 */
public class ProxyClient {
	/**
	 * 静态代理
	 */
	@Test
	public void filming() {
		ShootingWork film = new FilmProxy();
		film.shooting();
	}
	/**
	 * 动态代理
	 */
	@Test
	public void dyProxy() {
		ShootingWork film = StarFactory.getStarInstance("film");
		ShootingWork subject = (ShootingWork) Proxy.newProxyInstance(getClass().getClassLoader(),
				new Class<?>[] { ShootingWork.class },
				new ShootInvocationHandler(film));
		subject.shooting();
	}
}
