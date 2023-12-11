package com.patterns.abstractFactory;

public class DbDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(String type) {
		
		Dao dao = null;
		if(type.equals("Emp")) {
			dao = new DbEmpDao();
		}else if(type.equals("Dept")) {
			dao = new DbDeptDao();
		}
		return dao;
	}

}
