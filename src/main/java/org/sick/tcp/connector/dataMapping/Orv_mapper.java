package org.sick.tcp.connector.dataMapping;
import org.sick.tcp.connector.dto.Orv;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class Orv_mapper {
	Orv data =new Orv();
	RandomValueGenerator random = new RandomValueGenerator();
    public Orv_mapper(){
    	
    	data.setUnit("inch3/10");
    	data.setValue("29839");
    	
    
    }
}