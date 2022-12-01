package org.sick.tcp.connector.helper;

public class UniversalValues {

	String vcc = null;
	RandomValueGenerator random = new RandomValueGenerator();

	public void setVccValue(String vcc) {
		this.vcc = vcc;
	}

	public String getAlreadySetVcc() {

		return vcc;
	}

	public String getRandomVcc() {

		if (vcc == null) {
			vcc = String.valueOf(random.getRandomNumberUsingInts(3, 7));
		}
		return vcc;
	}

}
