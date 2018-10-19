package com.ptop.designpattern.decorator;

public class Torncake extends Pancake {
	public Torncake() {
		desc = "手抓饼";
	}

	@Override
	public double getPrice() {
		return 6;
	}
}
