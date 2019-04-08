package com.ptop.designpattern.commond;

public class LightOnCommand  implements Command{
	private Light light;
	public LightOnCommand(Light light) {
		this.light = light;
	}
	@Override
	public void excute() {
		light.on();
	}
}
