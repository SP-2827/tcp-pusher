package org.sick.tcp.connector.dataMapping;
import org.sick.tcp.connector.dto.Size;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class Size_mapper {
	Size data =new Size();
	RandomValueGenerator random = new RandomValueGenerator();
    public Size_mapper(){
    	data.setOhe("12.60");
    	data.setOle("18.00");
    	data.setOwi("13.20");
    	data.setUnit("inch");
    }
    }
