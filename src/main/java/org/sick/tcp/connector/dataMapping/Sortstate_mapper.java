package org.sick.tcp.connector.dataMapping;
import org.sick.tcp.connector.dto.Sortstate;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class Sortstate_mapper {
	Sortstate data =new Sortstate();
	RandomValueGenerator random = new RandomValueGenerator();
    public Sortstate_mapper(){
    	
    	data.setSession("SOS");
    	//data.setSortname("2018-04-11T10:00:00 Day");
    	data.setSortname("2018-04-11T10:00:00 Day");
    	
    
    }


}
