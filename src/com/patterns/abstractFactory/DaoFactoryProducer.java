package com.patterns.abstractFactory;

public class DaoFactoryProducer {
	
	//abstract factory pattern 
	//based on the type given by the client 
	//it decides which factory to invoke
	//once the client gets the factory it then asks the factory to give him the dao based on 
	//further type
	//so basically as Abstract factory is just a factory for the selection of factories😑😑
	public static DaoAbstractFactory produce(String factoryType) {
		
		DaoAbstractFactory daf = null;
		
		if(factoryType.equals("xml")) {
			daf = new XmlDaoFactory();
		}else if(factoryType.equals("db")) {
			daf = new DbDaoFactory();
		}
		return daf;
	}

}
