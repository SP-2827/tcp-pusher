package org.sick.tcp.connector.dataMapping;

	import org.sick.tcp.connector.dto.Tt;
	import org.sick.tcp.connector.helper.RandomValueGenerator;

	public class Tt_mapper {

		Tt data = new Tt();
		RandomValueGenerator random = new RandomValueGenerator();
		
		public Tt_mapper() {
			data.setUnit("ms");
			data.setValue(random.getRandomNumberUsingIntsString(99, 999));
			
			
		}


}
