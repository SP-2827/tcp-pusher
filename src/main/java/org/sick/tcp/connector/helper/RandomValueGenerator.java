package org.sick.tcp.connector.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomValueGenerator {
	Random rand = new Random(); // instance of random class

	public static void main(String[] args) {

		RandomValueGenerator r = new RandomValueGenerator();

		System.out.println(r.getRandomNumberUsingInts(10,100));
		
		System.out.println(r.stringGenerator(120));
	
	}

	public String intGenerator(int boundry, int digits) {

		int upperbound = boundry;

		String randomNumbers = "";
		for (int i = 1; i <= digits; i++) {
			randomNumbers = randomNumbers.concat(String.valueOf(rand.nextInt(upperbound)));

		}

		return randomNumbers;
	}

	public String stringGenerator(int length) {
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = length;
	    Random random = new Random();

	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();

	    return generatedString;
	}

	public String StringDate() {
		String value="";
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String str = formatter.format(date);

			String strDateFormat = "HH:mm:ss";
			DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
			String formattedDate = dateFormat.format(date);

			value=str + "T" + formattedDate;
		return value;

	}
	
	public int getRandomNumberUsingInts(int min, int max) {
	    Random random = new Random();
	    return random.ints(min, max)
	      .findFirst()
	      .getAsInt();
	}
	
	public String getRandomNumberUsingIntsString(int min, int max) {
	    Random random = new Random();
	    int a= random.ints(min, max)
	      .findFirst()
	      .getAsInt();
	    String valueOf = String.valueOf(a);
	    return valueOf;
	}
	
	

}
