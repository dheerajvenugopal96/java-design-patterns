package com.patterns.abstractFactory;

public class TestFactory {

	public static void main(String[] args) {
		
		DaoAbstractFactory daf = DaoFactoryProducer.produce("db");
		Dao dao = daf.createDao("Dept");
		dao.save();
	}
}
