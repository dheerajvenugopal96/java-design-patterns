package com.patterns.abstractFactory;

public class DbDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Db dept dao");
	}

}
