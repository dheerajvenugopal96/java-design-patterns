package com.patterns.factory;

public class PlainCheessPizze implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing cheese pizza");
	}

	@Override
	public void bake() {
		System.out.println("Bake cheese pizza");

	}

	@Override
	public void cut() {
		System.out.println("Cut cheese pizza");

	}

}
