package com.ptop.designpattern.proxy.cglib;

/**
 * 一名演员
 */
public class ActualActor {

	public String doSomething(String something) {
		return "ActualActor is doing " + something;
	}
}
