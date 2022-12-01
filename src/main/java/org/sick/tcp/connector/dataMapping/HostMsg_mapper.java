package org.sick.tcp.connector.dataMapping;

import org.sick.tcp.connector.dto.HostMsg;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class HostMsg_mapper {

	HostMsg data = new HostMsg();
	RandomValueGenerator random = new RandomValueGenerator();
	
	public HostMsg_mapper() {
	
		data.setExternalReader(random.getRandomNumberUsingIntsString(1, 99));
		data.setScanData2("SCANNER,,,SCAN_DATA2,000152726,0000,609640000,1Z9Y459V7804993885,???????????,609640000,840,078,1Z04993885?,9Y459V,000,000,087,189,014,P,???"
				+ "");
		
	}
}
