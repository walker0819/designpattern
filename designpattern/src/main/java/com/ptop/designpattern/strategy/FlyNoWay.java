package com.ptop.designpattern.strategy;

public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("Fly no Way!!");
	}
}
