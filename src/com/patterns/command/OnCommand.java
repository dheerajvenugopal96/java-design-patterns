package com.patterns.command;

public class OnCommand implements Command {

	/*
	 * This is the concreate class that implements commnad and passes the commnd on to the television
	 * */
	Television television ;
	
	public OnCommand(Television television) {
		this.television = television;
	}
	
	@Override
	public void execute() {
		television.on();
	}

}
