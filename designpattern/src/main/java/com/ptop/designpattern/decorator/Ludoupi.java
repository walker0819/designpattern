package com.ptop.designpattern.decorator;

public class Ludoupi extends Condiment {
	private Pancake pancake;

	public Ludoupi(Pancake pancake) {
		this.pancake = pancake;
	}

	@Override
	public String getDesc() {
		return pancake.getDesc() + "加卤豆皮（1元）";
	}

	@Override
	public double getPrice() {
		return pancake.getPrice() + 1;
	}
}
