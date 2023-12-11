package com.patterns.abstractFactory;

public class XmlEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Xml emp dao");
	}

}
