package org.sick.tcp.connector.dataMapping;

import org.sick.tcp.connector.dto.Norca;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class Norca_mapper {

	Norca data = new Norca();
	RandomValueGenerator random = new RandomValueGenerator();
	
	public Norca_mapper() {
		 data.setFee("1");
		 data.setFv("0");
		 data.setRq("100");
		 data.setVee("0");
	}
}
	
