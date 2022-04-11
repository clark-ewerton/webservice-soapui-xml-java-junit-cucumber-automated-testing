package numberConversion.builders;

import com.eviware.soapui.model.support.PropertiesMap;

public class NumberConversionBuilder {

	private PropertiesMap properties;
	
	private NumberConversionBuilder() {
		properties = new PropertiesMap();
	}
	
	public static NumberConversionBuilder builder() {
		return new NumberConversionBuilder();
	}

	public NumberConversionBuilder setDNum(String dNum) {
		properties.put("dNum", dNum);
		return this;
	}

	public PropertiesMap build() {
		return properties;
	}
}
