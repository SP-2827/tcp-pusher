package org.sick.tcp.connector.helper;

public class Utils {

	static RandomValueGenerator random = new RandomValueGenerator();

	public String getOlc() {
		String[] olc_set1 = { "NoRead", "MultiRead", "ValidRead", "PDFw9612", "PDFNoRead" };
		String[] olc_set2 = { "OverWeight", "Long", "ValidWeight", "ValidDim", "LFT" };

		String olc = olc_set1[random.getRandomNumberUsingInts(0, 5)] + ","
				+ olc_set2[random.getRandomNumberUsingInts(0, 5)] + ",Shape";
		return olc;
	}

	public String getBlc(int blcCount) {
		String[] blc_set1 = { "BaseITCudws", "ITCudws", "ZIPudws", "BasePTNudws", "PTNudws" };
		String[] blc_set2 = { "CondRaw1D", "CondTN", "CodeStartB" };
		String[] blc_set3 = { "TN1Z", "ZIP", "MAXI", "PTN", "Small", "C128", "Camera", "PDF" };
		String[] blc_set4 = { "FXGtrack11", "FXGtrack2", "FXGpdf417", "FXG2DBarcode", "FXG9612" };
		String[] blc_set5 = { "OcsRx", "OcsValid", "OcsGood", "RefBarcode", "Ref", "Info", "InfoBarcode " };
		String[] blc_set6 = { "T1T2", "T1", "T2", "Track1Side1", "Track1Side2" };

		String blc = null;

		if (blcCount == 1) {
			blc = blc_set1[random.getRandomNumberUsingInts(0, 4)];
		} else if (blcCount == 2) {
			blc = blc_set1[random.getRandomNumberUsingInts(0, 4)] + ","
					+ blc_set2[random.getRandomNumberUsingInts(0, 2)];
		} else if (blcCount == 3) {
			blc = blc_set1[random.getRandomNumberUsingInts(0, 4)] + ","
					+ blc_set2[random.getRandomNumberUsingInts(0, 2)] + ","
					+ blc_set3[random.getRandomNumberUsingInts(0, 7)];
		} else if (blcCount == 4) {
			blc = blc_set1[random.getRandomNumberUsingInts(0, 4)] + ","
					+ blc_set2[random.getRandomNumberUsingInts(0, 2)] + ","
					+ blc_set3[random.getRandomNumberUsingInts(0, 7)] + ","
					+ blc_set4[random.getRandomNumberUsingInts(0, 4)];
		} else if (blcCount == 5) {
			blc = blc_set1[random.getRandomNumberUsingInts(0, 4)] + ","
					+ blc_set2[random.getRandomNumberUsingInts(0, 2)] + ","
					+ blc_set3[random.getRandomNumberUsingInts(0, 7)] + ","
					+ blc_set4[random.getRandomNumberUsingInts(0, 4)] + ","
					+ blc_set5[random.getRandomNumberUsingInts(0, 6)];
		} else if (blcCount >= 6) {
			blc = blc_set1[random.getRandomNumberUsingInts(0, 4)] + ","
					+ blc_set2[random.getRandomNumberUsingInts(0, 2)] + ","
					+ blc_set3[random.getRandomNumberUsingInts(0, 7)] + ","
					+ blc_set4[random.getRandomNumberUsingInts(0, 4)] + ","
					+ blc_set5[random.getRandomNumberUsingInts(0, 4)] + ","
					+ blc_set6[random.getRandomNumberUsingInts(0, 4)];
		}

		// String olc = olc_set1[random.getRandomNumberUsingInts(0, 5)]
		// +","+olc_set2[random.getRandomNumberUsingInts(0, 5)]+",Shape";
		return blc;

	}

	public static void main(String[] args) {
		Utils u = new Utils();

		System.out.println(u.getBlc(3));
	}
}
