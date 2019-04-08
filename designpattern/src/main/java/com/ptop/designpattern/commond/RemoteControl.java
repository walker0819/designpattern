package com.ptop.designpattern.commond;

public class RemoteControl {
	private Command command;
	public void setCommand(Command command) {
		this.command = command;
	}
	public void buttonWasPassed() {
		command.excute();
	}
}
