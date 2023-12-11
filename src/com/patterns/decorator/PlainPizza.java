package com.patterns.decorator;

public class PlainPizza implements Pizza {

	@Override
	public void bake() {

		System.out.println("Plain Pizza is baking");
	}

}
