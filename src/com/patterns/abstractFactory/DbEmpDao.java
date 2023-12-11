package com.patterns.abstractFactory;

public class DbEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("DB emp dao");
	}

}
