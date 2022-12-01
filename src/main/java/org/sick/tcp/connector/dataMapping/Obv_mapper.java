package org.sick.tcp.connector.dataMapping;
import org.sick.tcp.connector.dto.Obv;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class Obv_mapper {
	Obv data = new Obv();
	RandomValueGenerator random = new RandomValueGenerator();
    public Obv_mapper(){
    	data.setUnit("inch3/10");
    	data.setValue("29938");
    	
    }
    }
