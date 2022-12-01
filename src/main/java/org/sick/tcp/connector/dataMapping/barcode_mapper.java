package org.sick.tcp.connector.dataMapping;

import org.sick.tcp.connector.dto.Barcode;
import org.sick.tcp.connector.dto.Codevalid;
import org.sick.tcp.connector.helper.RandomValueGenerator;
import org.sick.tcp.connector.helper.UniversalValues;

public class barcode_mapper {
	Barcode data = new Barcode();
	RandomValueGenerator random = new RandomValueGenerator();

	UniversalValues values = new UniversalValues();

	String cc = values.getRandomVcc();

	// Codevalid_mapper codevalidData = new Codevalid_mapper();
	public barcode_mapper() {

		data.setCc(cc);
		data.setVcc(cc);
		int ccInt = Integer.parseInt(cc);
		Codevalid[] codevalidDataArr = new Codevalid[ccInt];
		for (int i = 0; i <= ccInt - 1; i++) {
			// Codevalid_mapper codevalidData = new Codevalid_mapper();
			codevalidDataArr[i] = new Codevalid_mapper().data;

		}
		// codevalidDataArr = codeValidList.toArray();
		data.setCodevalid(codevalidDataArr);

	}

}
