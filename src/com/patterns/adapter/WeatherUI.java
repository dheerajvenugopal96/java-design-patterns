package com.patterns.adapter;

public class WeatherUI {
	
	public void showTemperature(int zipCode) {
		WeatherAdapter adapter = new WeatherAdapter();
		
		System.out.println("Weather is "+adapter.findTemperature(zipCode));
		
	}
	
	public static void main(String[] args) {
		WeatherUI ui = new WeatherUI();
		ui.showTemperature(680018);
	}

}
