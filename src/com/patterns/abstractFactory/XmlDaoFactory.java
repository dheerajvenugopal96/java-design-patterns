package com.patterns.abstractFactory;

public class XmlDaoFactory extends DaoAbstractFactory {

	//this is the normal factory pattern
	@Override
	public Dao createDao(String type) {

		Dao dao = null;
		if(type.equals("Emp")) {
			dao = new XmlEmpDao();
		}else if(type.equals("Dept")) {
			dao = new XmlDeptDao();
		}
		return dao;
	}

}
