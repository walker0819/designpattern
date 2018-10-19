package com.ptop.designpattern.strategy;

import org.junit.Test;

public class DuckTest {
	@Test
	public void duckTest() {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
	}
	@Test
	public void modelDuck() {
		Duck model = new ModelDuck();
		model.performQuack();
		model.performFly();
		model.setFlyBehavior(new FlyWithWings());
		model.performFly();
	}
}