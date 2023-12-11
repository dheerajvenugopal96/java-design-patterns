package com.patterns.command;

public class RemoteControl {
	
	/*
	 * this takes the command interface and based on the setter interface type set executes the action
	 * */

	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
		command.execute();
	}
}
