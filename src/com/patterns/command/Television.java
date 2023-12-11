package com.patterns.command;

public class Television {

	/*
	 * this is the receiver class that will receive the command from concreate command classed
	 * */
	
	public void on() {
		System.out.println("Television is on");
	}
	
	public void off() {
		System.out.println("Television is off");
	}
}
