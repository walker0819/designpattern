package com.ptop.designpattern.proxy.jdk;

/**
 * 电影明星
 */
public class FilmStar implements ShootingWork {
	@Override
	public void shooting() {
		System.out.println("电影明星准备拍摄");
		System.out.println("电影明星拍摄中");
		System.out.println("电影明星拍摄完成");
	}
}
