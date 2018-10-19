package com.ptop.designpattern.decorator;

public class Roujiamo extends Pancake {
	public Roujiamo() {
		desc = "肉夹馍";
	}

	@Override
	public double getPrice() {
		return 8;
	}
}
