package com.patterns.factory;

public class VeggiePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing veggie pizza");
	}

	@Override
	public void bake() {
		System.out.println("Bake veggie pizza");

	}

	@Override
	public void cut() {
		System.out.println("Cut veggie pizza");

	}

}
