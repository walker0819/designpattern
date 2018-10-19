package com.ptop.designpattern.strategy;

public class Squeak implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Squeak! Squeak!");
	}
}
