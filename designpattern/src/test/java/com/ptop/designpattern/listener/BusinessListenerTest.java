package com.ptop.designpattern.listener;

import org.junit.Test;

public class BusinessListenerTest {
	@Test
	public void listenerTest() {
		BusinessOperator operator = new BusinessOperator();
		operator.setListener(new BusinessListener());
		operator.doBusiness();
	}
}