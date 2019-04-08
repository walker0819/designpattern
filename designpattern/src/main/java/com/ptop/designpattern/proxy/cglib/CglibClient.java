package com.ptop.designpattern.proxy.cglib;

import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.Enhancer;

public class CglibClient {

	@Test
	public void testCglib() {
//		Enhancer enhancer = new Enhancer();
//		enhancer.setSuperclass(ActualActor.class);
//		enhancer.setCallback(new DoMethodIterceptor());

		ActualActor actualActor = (ActualActor) Enhancer.create(ActualActor.class, new DoMethodIterceptor());
		System.out.println(actualActor.doSomething("拍电影"));
		System.out.println(actualActor.doSomething("拍电视"));
	}
}
