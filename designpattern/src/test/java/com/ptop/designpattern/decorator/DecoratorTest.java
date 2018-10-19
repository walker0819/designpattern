package com.ptop.designpattern.decorator;

import org.junit.Test;

public class DecoratorTest {
	@Test
	public void test() {
		Pancake pancake = new Torncake();
		System.out.printf(pancake.getDesc());
		System.out.println("，价格：" + pancake.getPrice());
		pancake = new Tudousi(pancake);
		System.out.printf(pancake.getDesc());
		System.out.println("，价格" + pancake.getPrice());
		pancake = new Ludoupi(pancake);
		System.out.printf(pancake.getDesc());
		System.out.println("，价格" + pancake.getPrice());
		Pancake roujiamo = new Roujiamo();
		System.out.printf(roujiamo.getDesc());
		System.out.println("，价格" + roujiamo.getPrice());
		roujiamo = new Ludoupi(roujiamo);
		System.out.printf(roujiamo.getDesc());
		System.out.println("，价格" + roujiamo.getPrice());

	}
}
