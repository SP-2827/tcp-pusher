package org.sick.tcp.connector.dataMapping;
import org.sick.tcp.connector.dto.Volumetric;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class Volumetric_mapper {
	Volumetric data =new Volumetric();
	Otve_mapper OtveData = new Otve_mapper();
	Oa_mapper OaData = new Oa_mapper();
	Obv_mapper ObvData = new Obv_mapper();
	Orv_mapper OrvData = new Orv_mapper();
	Size_mapper SizeData = new Size_mapper();
	Polygon_mapper PolygonData = new Polygon_mapper();
	RandomValueGenerator random = new RandomValueGenerator();
    public Volumetric_mapper(){
    	
    	data.setOms1("0000");
    	data.setOms2("00000000");
    	data.setOms3("10000001");
    	data.setOtve(OtveData.data);
    	data.setOa(OaData.data);
    	data.setObv(ObvData.data);
    	data.setOrv(OrvData.data);
    	data.setSize(SizeData.data);
    	data.setPolygon(PolygonData.data);
    	
    	
    	
    }
    	
    }