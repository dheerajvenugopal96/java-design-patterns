package com.patterns.adapter;

public class WeatherAdapter {
	
	//we are not getting the string from ui and we need an adapter that takes in the int and converts to 
	//a string . visualize how a normal foreign adapter would work in real life
	public int findTemperature(int zipCode) {
		
		String city = null;
		if(zipCode == 680018) {
			city = "Thrissur";
		}
		
		WeatherFinder finder = new WeatherFinderImpl();
		int temperature = finder.find(city);
		return temperature;
	}

}
