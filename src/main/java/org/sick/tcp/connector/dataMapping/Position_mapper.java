package org.sick.tcp.connector.dataMapping;

import org.sick.tcp.connector.dto.Position;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class Position_mapper {
	Position data = new Position();
	RandomValueGenerator random = new RandomValueGenerator();
	
	public Position_mapper() {
	
		data.setUnit("mm");
		//data.setX("1487");
		data.setX(random.getRandomNumberUsingIntsString(1485, 1491));
		data.setY("413");
		data.setZ("39");
		data.setXmax("1491");
		data.setXmin("1485");
}
}
