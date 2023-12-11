package com.patterns.factory;

public class ChickenCheesePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing chicken cheese pizza");
	}

	@Override
	public void bake() {
		System.out.println("Bake chicken cheese pizza");

	}

	@Override
	public void cut() {
		System.out.println("Cut chicken cheese pizza");

	}

}
