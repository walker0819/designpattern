package com.ptop.designpattern.decorator;

public class Tudousi extends Condiment {
	private Pancake pancake;

	public Tudousi(Pancake pancake) {
		this.pancake = pancake;
	}

	@Override
	public String getDesc() {
		return pancake.getDesc() + "加土豆丝（0.5元）";
	}

	@Override
	public double getPrice() {
		return pancake.getPrice() + 0.5;
	}
}
