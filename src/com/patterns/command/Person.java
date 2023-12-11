package com.patterns.command;

public class Person {
	public static void main(String[] args) {
		
		Television television= new Television();
		RemoteControl ctrl = new RemoteControl();
		
		OnCommand onCommand = new OnCommand(television);
		ctrl.setCommand(onCommand);
		ctrl.pressButton();
		
		OffCommand offCommand = new OffCommand(television);
		ctrl.setCommand(offCommand);
		ctrl.pressButton();
	}

}
