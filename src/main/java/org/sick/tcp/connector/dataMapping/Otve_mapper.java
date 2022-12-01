package org.sick.tcp.connector.dataMapping;
import org.sick.tcp.connector.dto.Otve;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class Otve_mapper {
	Otve data = new Otve();
	RandomValueGenerator random = new RandomValueGenerator();
    public Otve_mapper(){
    	data.setUnit("mm/sec");
    	data.setValue("1871");
    }
    }
