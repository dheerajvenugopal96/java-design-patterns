package com.patterns.abstractFactory;

public class XmlDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Xml dept dao");
	}

}
