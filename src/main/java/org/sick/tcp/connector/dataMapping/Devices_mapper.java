package org.sick.tcp.connector.dataMapping;

import org.sick.tcp.connector.dto.Device;
import org.sick.tcp.connector.dto.Devices;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class Devices_mapper {

	Devices data = new Devices();
	RandomValueGenerator random = new RandomValueGenerator();
	Device_mapper DeviceData = new Device_mapper();
	
	Device[] devicevalidDataArr = {DeviceData.data};
	
	public Devices_mapper() {
		
		data.setDevice(devicevalidDataArr);
	}
	}
