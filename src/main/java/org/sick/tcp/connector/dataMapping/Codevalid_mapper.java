package org.sick.tcp.connector.dataMapping;

import org.sick.tcp.connector.dto.Codevalid;
import org.sick.tcp.connector.helper.RandomValueGenerator;
import org.sick.tcp.connector.helper.UniversalValues;
import org.sick.tcp.connector.helper.Utils;

public class Codevalid_mapper{

	Codevalid data = new Codevalid();
	RandomValueGenerator random = new RandomValueGenerator();
	Devices_mapper DevicesData = new Devices_mapper();
	Position_mapper PositionData = new Position_mapper();
	Norca_mapper NorcaData = new Norca_mapper();
	Utils utils = new Utils();
	//barcode_mapper barcode = new barcode_mapper();
	UniversalValues values = new UniversalValues();
	
	public Codevalid_mapper() {
		
		data.setCs(random.intGenerator(2, 4));
		data.setSt("0");
		data.setBc(random.stringGenerator(10));
		data.setReadlist("28000000");
		data.setCondition(utils.getBlc(Integer.parseInt(values.getRandomVcc())));
        data.setDevices(DevicesData.data);
        data.setWud("0");
        data.setCl(random.intGenerator(1,2));
        data.setId("j");
        data.setPosition(PositionData.data);
        data.setBdn(random.intGenerator(1, 2));
        data.setNorca(NorcaData.data);
		

	}
	}