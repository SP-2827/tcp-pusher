package org.sick.tcp.connector.dataMapping;
import org.sick.tcp.connector.dto.General;
import org.sick.tcp.connector.helper.RandomValueGenerator;

public class General_mapper {
	//private static final String System001_20220720_092317_46784 = null;
	General data =new General();
	RandomValueGenerator random = new RandomValueGenerator();
	Tt_mapper TtData = new Tt_mapper();
	Uds_mapper UdsData = new Uds_mapper();
	otl_mapper Ot1Data = new otl_mapper ();
	Oga_mapper OgaData = new Oga_mapper();
	Udi_mapper UdiData = new Udi_mapper();
	Udf_mapper UdfData = new Udf_mapper();
	public General_mapper(){
    	
    	data.setTimestamp(random.StringDate()+ ".876");
    	data.setErrornb("0");
    	data.setTt(TtData.data);
    	data.setUds(UdsData.data);
    	data.setOtl(Ot1Data.data);
    	data.setOga(OgaData.data);
    	data.setIostate("0C08");
    	data.setIs("14538");
    	data.setIe("14586");
    	data.setLfts("7");
    	data.setDevicelist("FC00000C");
    	data.setOc("0");
    	data.setUdi(UdiData.data);
    	data.setUdf(UdfData.data);
    	data.setIe(random.getRandomNumberUsingIntsString(99, 999));
    	data.setOn("119");
    	data.setLftf("N");
    	data.setOx("0119");
    	data.setOi("119");
    	
    	}
}
