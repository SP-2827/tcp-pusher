package org.sick.tcp.connector.dataMapping;

import org.sick.tcp.connector.dto.Position;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class Position_mapper2 {
	Position data = new Position();
	RandomValueGenerator random = new RandomValueGenerator();
	
	public Position_mapper2() {
	
		data.setUnit("mm");
		data.setX("1491");
		data.setY("219");
		data.setZ("14");
}
}