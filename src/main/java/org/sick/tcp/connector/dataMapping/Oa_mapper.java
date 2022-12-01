package org.sick.tcp.connector.dataMapping;

import org.sick.tcp.connector.dto.Oa;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class Oa_mapper {
	
	Oa data = new Oa();
	RandomValueGenerator  random = new RandomValueGenerator();
    public  Oa_mapper (){
    	data.setUnit("degree/10");
		data.setValue("-4");
    }
}
   