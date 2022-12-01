package org.sick.tcp.connector.dataMapping;

import org.sick.tcp.connector.dto.Otl;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class otl_mapper {

	Otl data = new Otl();
	RandomValueGenerator random = new RandomValueGenerator();
	
	public otl_mapper() {
		
		data.setUnit("inch");
	    data.setValue(random.getRandomNumberUsingIntsString(30, 70)+"."+random.getRandomNumberUsingIntsString(10, 99));	
	}
	}