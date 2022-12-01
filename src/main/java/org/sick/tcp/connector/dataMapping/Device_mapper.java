package org.sick.tcp.connector.dataMapping;

import org.sick.tcp.connector.dto.Device;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class Device_mapper {

	Device data = new Device();
	RandomValueGenerator random = new RandomValueGenerator();
	Norca_mapper NorcaData = new Norca_mapper();
	Position_mapper2 PositionData = new Position_mapper2
			();
	 
	public Device_mapper() { 
		data.setDcs(random.intGenerator(2, 1));
		data.setDn("3");
		data.setNorca(NorcaData.data);
		data.setPosition(PositionData.data);
		}
}