package org.sick.tcp.connector.dataMapping;
import org.sick.tcp.connector.dto.Sorterstate;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class Sorterstate_mapper {
		Sorterstate data =new Sorterstate();
		RandomValueGenerator random = new RandomValueGenerator();
		Speed_mapper SpeedData =new Speed_mapper();
	    public Sorterstate_mapper(){
	    	
	    	data.setSpeed(SpeedData.data);
	    	data.setState("started");
	    }
	
	

}
