package com.patterns.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable,Cloneable {


	private static final long serialVersionUID = 1L;
	
	
	// should have a static member
	//mark as volatile to avoid any issues in multithreading environment
	private static volatile DateUtil instance; // = new DateUtil(); //Eager initialization

	// also type of eager initialization
	/*
	 * static { instance = new DateUtil(); }
	 */

	// define a private constructor
	private DateUtil() {

	}

	// should have static method of type of the class which should
	// return the static object only if it is not null
	public static DateUtil getInstance() {

		// lazy initialization approach

		
		//to make it thread safe
		
		if(instance == null) {
			synchronized (DateUtil.class) {
				if (instance == null) {
					instance = new DateUtil();
				}
			}
		}


		return instance;
	}
	
	//to handle the serialization issue
	protected Object readResolve() {
		return instance;
	}
	
	//we don't want out singleton clases to be cloned 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
