package org.sick.tcp.connector.dataMapping;

import org.sick.tcp.connector.dto.Owe;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class Owe_mapper {

	Owe data = new Owe();
	RandomValueGenerator random = new RandomValueGenerator();
	
	public Owe_mapper() {
	
		data.setUnit("lb");
		data.setValue(random.getRandomNumberUsingIntsString(5, 25)+"."+random.getRandomNumberUsingIntsString(10, 99));
		
	}
}
