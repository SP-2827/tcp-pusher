package org.sick.tcp.connector.dataMapping;
import org.sick.tcp.connector.dto.Polygon;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class Polygon_mapper {
	Polygon data =new Polygon();
	RandomValueGenerator random = new RandomValueGenerator();
    public Polygon_mapper(){
    	
    	data.setOc1x("0.00");
    	data.setOc1y("14.68");
    	data.setOc1z("12.50");
    	data.setOc2x("0.09");
    	data.setOc2y("1.46");
    	data.setOc2z("12.50");
    	data.setOc3x("17.81");
    	data.setOc3y("14.80");
    	data.setOc3z("12.50");
    	data.setOc4x("17.90");
    	data.setOc4y("1.59");
    	data.setOc4z("12.50");
    	data.setUnit("inch");
    }
    
    }
