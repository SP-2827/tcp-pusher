package org.sick.tcp.connector.dataMapping;

import org.sick.tcp.connector.dto.Oga;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class Oga_mapper {

	Oga data = new Oga();
	RandomValueGenerator random = new RandomValueGenerator();
	
	public Oga_mapper() {
		
		data.setUnit("inch");
		data.setValue(random.getRandomNumberUsingIntsString(30, 70)+"."+random.getRandomNumberUsingIntsString(10, 99));
	}
	}