package com.patterns.template;

public class XmlDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		return "xml data";
	}

	@Override
	public String processData(String data) {
		return "Processed "+data;
	}

}
