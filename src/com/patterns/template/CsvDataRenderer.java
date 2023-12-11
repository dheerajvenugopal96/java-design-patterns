package com.patterns.template;

public class CsvDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		return "csv data";
	}

	@Override
	public String processData(String data) {
		return "Processed "+data;
	}

}
