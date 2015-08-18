package com.lam.utilString;

/**
 *  @author Ludoviko Azuaje
 * 
 * Implement a functionality which shall receive a double number as string
 * input. It shall format its input according to the Hungarian currency format,
 * and it shall return the formatted value as string. In this particular format,
 * the thousands are separated with spaces, and the decimal mark is a comma. You
 * can assume that the input is always in the right format.
 * 
 * For example:
 * 
 * 100 -> 100
 * 
 * 1000 -> 1 000
 * 
 * 1000000.01 -> 1 000 000,01
 * 
 * Problem source: http://zsoltfabok.com/blog/2011/02/the-currency-format-kata/
 * 
 */

public class HungarianCurrencyFormat {
	private static final String REGEX_DEC_SEPARATOR = "\\.";
	private static final String REGEX_FLOAT = "\\d+(\\.\\d{0,2})*";
	private static final char COMMA = ',';

	public static boolean isDouble(String string) {
		return string.matches(REGEX_FLOAT);
	}

	public static String format(String string) {
		// StringBuilder solution = new StringBuilder();
		String solution = "";

		// Check is a number
		if (!HungarianCurrencyFormat.isDouble(string)) {
			throw new IllegalArgumentException(
					"The expected format must be a double number as a String.");
		}

		String mantissa = Character.toString(COMMA);

		if (string.contains(".")) {
			String[] data = string.split(REGEX_DEC_SEPARATOR);
			if (data.length > 1) {
				mantissa += data[1];
			} else {
				mantissa += '0';
			}

			solution = formatInteger(data[0]) + mantissa;
		} else {
			solution = formatInteger(string);
		}

		return solution;
	}

	private static String formatInteger(String string) {
		StringBuilder solution = new StringBuilder();
		;
		int p = string.length();
		while (p - 3 > 0) {
			solution.insert(0, " " + string.substring(p - 3, p));
			p = p - 3;
		}
		if (p > 0) {
			solution.insert(0, string.substring(0, p));
		}

		return solution.toString();
	}

	public static void main(String[] args) {
		System.out.println(format("1"));
		System.out.println(format("12"));
		System.out.println(format("123"));
		System.out.println(format("1234"));
		System.out.println(format("12345"));
		System.out.println(format("123456"));
		System.out.println(format("1234567"));
		System.out.println(format("12345678"));
		System.out.println(format("123456789"));
		System.out.println(format("1234567890"));
		System.out.println(format("12345678901"));
		System.out.println(format("123456789012"));

		System.out.println(format("1."));
		System.out.println(format("1.1"));
		System.out.println(format("1.12"));
		System.out.println(format("12.12"));
		System.out.println(format("123.12"));
		System.out.println(format("1234.12"));
		System.out.println(format("12345.12"));
		System.out.println(format("123456.12"));
		System.out.println(format("1234567.12"));
		System.out.println(format("12345678.12"));
		System.out.println(format("123456789.12"));
		System.out.println(format("1234567890.12"));
		System.out.println(format("12345678901.12"));
		System.out.println(format("123456789012.12"));
	}
}
