package org.sick.tcp.connector.dataMapping;

import org.sick.tcp.connector.dto.Objectdata;
import org.sick.tcp.connector.helper.RandomValueGenerator;
import org.sick.tcp.connector.helper.Utils;

public class Objectdata_mapper {
	public Objectdata data = new Objectdata();
	RandomValueGenerator random = new RandomValueGenerator();
	HostMsg_mapper HostmsgData = new HostMsg_mapper();
	General_mapper generalmapper = new General_mapper();
	Volumetric_mapper volumetric = new Volumetric_mapper();
	Image_mapper Image = new Image_mapper();
	Sorterstate_mapper sorter = new Sorterstate_mapper();
	Sortstate_mapper sort = new Sortstate_mapper();
	Scaledata_mapper Scale = new Scaledata_mapper();
	barcode_mapper barcode = new barcode_mapper();
	Utils utils = new Utils();

	public Objectdata_mapper() {

		// String devicename = random.stringGenerator(10);
		//int randomDevicename = random.getRandomNumberUsingInts(1, deviceId);
		data.setDeviceid("32");
		data.setDevicename("01");
//		if (deviceId == 1) {
//			data.setDevicename("01");
//		} else {
//			if (randomDevicename >= 10) {
//				data.setDevicename(String.valueOf(randomDevicename));
//			} else {
//				data.setDevicename("0" + String.valueOf(randomDevicename));
//			}
//
//		}

		data.setTimestamp(random.StringDate());
		data.setHostmessage(random.stringGenerator(10));
		data.setIncr(random.getRandomNumberUsingIntsString(99, 999));
		data.setTokenid("01" + data.getTimestamp().split(".199")[0]);
		data.setSeqnb(random.getRandomNumberUsingIntsString(99, 999));
		data.setCondition(utils.getOlc());
		// data.setCondition(random.intGenerator(10, 5));
		data.setHostMsg(HostmsgData.data);
//		data.setVersion("1.0");
		data.setTimestamp(random.StringDate() + ".199");
		data.setImages(Image.data);
		data.setSortstate(sort.data);
		data.setSorterstate(sorter.data);
		data.setBarcode(barcode.data);
		data.setGeneral(generalmapper.data);
		data.setVolumetric(volumetric.data);
		data.setImages(Image.data);
		data.setScaledata(Scale.data);

	}
}
