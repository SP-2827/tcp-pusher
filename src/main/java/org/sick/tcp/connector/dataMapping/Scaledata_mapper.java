
package org.sick.tcp.connector.dataMapping;

import org.sick.tcp.connector.dto.Scaledata;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class Scaledata_mapper {
	//private static final String System001_20220720_092317_46784 = null;
	Scaledata data =new Scaledata();
	RandomValueGenerator random = new RandomValueGenerator();
	HostMsg_mapper hostmsgData = new HostMsg_mapper();
	Owe_mapper OweData = new Owe_mapper();
	
	public Scaledata_mapper() {
		
		data.setOwe(OweData.data);
		data.setOws("98");
	}
}