package com.ptop.designpattern.proxy.jdk;

/**
 * 工厂类
 */
public class StarFactory {

	public static ShootingWork getStarInstance(String type) {
		if ("film".equals(type)) {
			return new FilmStar();
		}
		return null;
	}
}
