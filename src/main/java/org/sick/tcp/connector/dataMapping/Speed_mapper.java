package org.sick.tcp.connector.dataMapping;

import org.sick.tcp.connector.dto.Speed;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class Speed_mapper {

	Speed data = new Speed();
	RandomValueGenerator random = new RandomValueGenerator();
	
	public Speed_mapper() {
		
		data.setUnit("ft/min");
		data.setValue(random.getRandomNumberUsingIntsString(100, 799)+"."+random.getRandomNumberUsingIntsString(10, 99));
	}
	}