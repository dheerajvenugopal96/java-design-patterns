package com.patterns.template;

public abstract class ComputerManufacturer {
	
	public void buildComputer() {
		String hardDisk = addHardDisk();
		String ram = addRam();
		String keyboard = addKeyboard();
		System.out.println("Computer configuration :");
		System.out.println("Hard disk = "+hardDisk);
		System.out.println("Ram = "+ram);
		System.out.println("keyboard = "+keyboard);
	}
	
	public abstract String addHardDisk();
	
	public abstract String addRam();
	
	public abstract String addKeyboard();

}
