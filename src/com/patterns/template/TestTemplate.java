package com.patterns.template;

public class TestTemplate {

	public static void main(String[] args) {
		
		DataRenderer renderer = new XmlDataRenderer();
		renderer.render();
		
		DataRenderer renderer2 = new CsvDataRenderer();
		renderer2.render();
		
		ComputerManufacturer desktop = new DesktopManufacturer();
		desktop.buildComputer();
		
		ComputerManufacturer laptop = new LaptopManufacturer();
		laptop.buildComputer();
	}
}
