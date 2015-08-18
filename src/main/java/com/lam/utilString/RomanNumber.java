package com.lam.utilString;

import java.util.List;

public class RomanNumber {
	public static final int UP_TO = 4999;

	public static String getRoman(int decimal) {
		String output = "";

		if (decimal > UP_TO || decimal < 0) {
			throw new IllegalArgumentException("The value " + decimal
					+ " must between " + UP_TO + " and  1.");
		}

		int units = decimal % 10;
		int tens = (decimal % 100) / 10;
		int hundreds = (decimal % 1000) / 100;
		int thousands = (decimal % 10000) / 1000;

		output = RomanNumber.findUnits(units);

		if (tens > 0) {
			output = RomanNumber.findTens(tens) + output;
		}
		if (hundreds > 0) {
			output = RomanNumber.findHundreds(hundreds) + output;
		}
		if (thousands > 0) {
			output = RomanNumber.findThousands(thousands) + output;
		}

		return output;
	}

	private static String findUnits(int units) {
		String output = "";

		switch (units) {
		case 0: {
			output = "";
			break;
		}
		case 1: {
			output = "I";
			break;
		}
		case 2: {
			output = "II";
			break;
		}
		case 3: {
			output = "III";
			break;
		}
		case 4: {
			output = "IV";
			break;
		}
		case 5: {
			output = "V";
			break;
		}
		case 6: {
			output = "VI";
			break;
		}
		case 7: {
			output = "VII";
			break;
		}
		case 8: {
			output = "VIII";
			break;
		}
		case 9: {
			output = "IX";
			break;
		}
		}
		return output;
	}

	private static String findTens(int tens) {
		String output = "";

		switch (tens) {
		case 0: {
			output = "";
			break;
		}
		case 1: {
			output = "X";
			break;
		}
		case 2: {
			output = "XX";
			break;
		}
		case 3: {
			output = "XXX";
			break;
		}
		case 4: {
			output = "XL";
			break;
		}
		case 5: {
			output = "L";
			break;
		}
		case 6: {
			output = "LX";
			break;
		}
		case 7: {
			output = "LXX";
			break;
		}
		case 8: {
			output = "LXXX";
			break;
		}
		case 9: {
			output = "XC";
			break;
		}
		}
		return output;
	}

	private static String findHundreds(int hundreds) {
		String output = "";

		switch (hundreds) {
		case 0: {
			output = "";
			break;
		}
		case 1: {
			output = "C";
			break;
		}
		case 2: {
			output = "CC";
			break;
		}
		case 3: {
			output = "CCC";
			break;
		}
		case 4: {
			output = "CD";
			break;
		}
		case 5: {
			output = "D";
			break;
		}
		case 6: {
			output = "DC";
			break;
		}
		case 7: {
			output = "DCC";
			break;
		}
		case 8: {
			output = "DCCC";
			break;
		}
		case 9: {
			output = "CM";
			break;
		}
		}
		return output;
	}

	private static String findThousands(int thousands) {
		String output = "";

		switch (thousands) {
		case 0: {
			output = "";
			break;
		}
		case 1: {
			output = "M";
			break;
		}
		case 2: {
			output = "MM";
			break;
		}
		case 3: {
			output = "MMM";
			break;
		}
		case 4: {
			output = "MMMM";
			break;
		}
		case 5: {
			output = "";
			break;
		}
		case 6: {
			output = "";
			break;
		}
		case 7: {
			output = "";
			break;
		}
		case 8: {
			output = "";
			break;
		}
		case 9: {
			output = "";
			break;
		}
		}
		return output;
	}

	public static boolean isRomanString(String string) {
		List<String> list = RomanNumbersEnum.getNames();

		for (int i = 0; i < string.length(); i++) {
			if (list.contains(string.charAt(i) + "")) {
			} else {
				return false;
			}
		}
		return true;
	}

	public static String getDecimal(String roman) {
		int len = roman.length();
		int count = 0;
		RomanNumbersEnum r;
		RomanNumbersEnum r2;

		for (int i = 0; i < len;) {
			if (i < len - 1) {
				r = RomanNumbersEnum.valueOf(roman.charAt(len - 2 - i) + "");
				r2 = RomanNumbersEnum.valueOf(roman.charAt(len - 1 - i) + "");

				if (r.getValue() >= r2.getValue()) {
					// read individual value
					count += r2.getValue();
					i++;
				} else {
					// read two consecutive values
					count += r2.getValue() - r.getValue();
					i = i + 2;
				}
			} else {
				r2 = RomanNumbersEnum.valueOf(roman.charAt(len - 1 - i) + "");
				count += r2.getValue();
				i++;
			}
		}
		return count + "";
	}

	public static void main(String[] args) {
		// getDecimal("MCMXCIX");
		// getDecimal("X");
		// getDecimal("IX");
		// getDecimal("IV");
		getRoman(1);
		getRoman(1927);
	}
}
