package com.lam.utilString;

/*
 * Please implement this method to return the sum of all integers found in
 * the parameter String. You can assume that integers are separated from
 * other parts with one or more spaces (' ' symbol). For example,
 * s="12 some text 3  7", result: 22 (12+3+7=22)
 */

public class ExtractNumbers {
	public static int getSumOfNumbers(String s) {
		int sum = 0;
		int n = 0;

		String[] result = s.split("\\D+");
		for (int x = 0; x < result.length; x++) {
			if (result[x].matches("^\\d+$")) {
			//	System.out.println(result[x] + " is a number");
				n = Integer.parseInt(result[x]);
				sum += n;
			} else {
			//	System.out.println(result[x] + " is not a number");
			}
		}
		return sum;
	}

	public static String getNumbers(String s) {
		String string = "";

		String[] result = s.split("\\D");
		for (int i = 0; i < result.length; i++) {
			if (result[i].matches("^\\d+$")) {
				// System.out.println(result[i] + " is a number");
				string += result[i];
			} else {
				// System.out.println(result[i] + " is not a number");
			}
		}
		return string;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ExtractNumbers.getNumbers("12 some text 3**7"));
		System.out.println(ExtractNumbers.getNumbers("acc1"));
	}
}
