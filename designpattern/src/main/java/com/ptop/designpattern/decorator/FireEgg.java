package com.ptop.designpattern.decorator;

public class FireEgg extends Condiment {
	private Pancake pancake;

	public FireEgg(Pancake pancake) {
		this.pancake = pancake;
	}

	@Override
	public String getDesc() {
		return pancake.getDesc() + "加煎蛋";
	}

	@Override
	public double getPrice() { //计算价格
		return pancake.getPrice() + 1.0;
	}
}
