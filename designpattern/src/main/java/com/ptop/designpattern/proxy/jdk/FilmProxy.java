package com.ptop.designpattern.proxy.jdk;

/**
 * 经纪人
 */
public class FilmProxy implements ShootingWork {
	private ShootingWork star = new FilmStar();

	@Override
	public void shooting() {
		/**
		 * 处理一些事务后，调用实际执行人的方法
		 */
		System.out.println("经纪人协商合同");
		System.out.println("签合同。。。");
		this.star.shooting();
	}
}
