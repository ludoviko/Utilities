package com.lam.utilString;

/**
 * Number to letter converter
 * 
 * Write out the numbers from 1 to 1000 in words.
 * 
 * For example, 342 (three hundred and forty-two)
 * 
 * and 115 (one hundred and fifteen) letters.
 * 
 * The use of "and" when writing out numbers is in compliance with British
 * usage.
 * 
 */

public class NumberToLetters {
	public String find(int number) {
		String output = "";
		long m = Math.round(Math.log10(number) + 0.5);
		// System.out.println(m);
		int tenDigit;
		int unitDigit;
		int hundredDigit;
		int thousandDigit;

		// Extreme case
		if (number == 0) {
			return "zero";
		}

		switch ((int) m) {
		case (1): {
			output = this.findUnits(number);
			break;
		}
		case (2): {
			tenDigit = number / 10;
			unitDigit = number % 10;
			if (tenDigit == 1) {
				output = this.findFromt10UpTo19(number);
			} else {
				output = this.findTensBut10(tenDigit);
				if (unitDigit == 0) {
				} else {
					output += "-" + this.find(unitDigit);
				}
			}
			break;
		}
		case (3): {
			hundredDigit = number / 100;
			tenDigit = number % 100;
			output = this.findHundreds(hundredDigit);
			if (tenDigit == 0) {
			} else {
				output += " and " + this.find(tenDigit);
			}
			break;
		}
		case (4): {
			thousandDigit = number / 1000;
			hundredDigit = number % 1000;
			output = this.findThousands(thousandDigit);
			if (hundredDigit == 0) {
			} else {
				output += " " + this.find(hundredDigit);
			}
			break;
		}
		}
		return output;
	}

	public String findUnits(int units) {
		String output = "";

		switch (units) {
		case 0: {
			output = "";
			break;
		}
		case 1: {
			output = "one";
			break;
		}
		case 2: {
			output = "two";
			break;
		}
		case 3: {
			output = "three";
			break;
		}
		case 4: {
			output = "four";
			break;
		}
		case 5: {
			output = "five";
			break;
		}
		case 6: {
			output = "six";
			break;
		}
		case 7: {
			output = "seven";
			break;
		}
		case 8: {
			output = "eight";
			break;
		}
		case 9: {
			output = "nine";
			break;
		}
		}
		return output;
	}

	public String findTensBut10(int tens) {
		String output = "";

		switch (tens) {
		case 0: {
			output = "";
			break;
		}
		case 1: {
			// Excluded
			break;
		}
		case 2: {
			output = "twenty";
			break;
		}
		case 3: {
			output = "thirty";
			break;
		}
		case 4: {
			output = "forty";
			break;
		}
		case 5: {
			output = "fifty";
			break;
		}
		case 6: {
			output = "sixty";
			break;
		}
		case 7: {
			output = "seventy";
			break;
		}
		case 8: {
			output = "eighty";
			break;
		}
		case 9: {
			output = "ninety";
			break;
		}
		}
		return output;
	}

	public String findFromt10UpTo19(int tens) {
		String output = "";

		switch (tens) {
		case 10: {
			output = "ten";
			break;
		}
		case 11: {
			output = "eleven";
			break;
		}
		case 12: {
			output = "twelve";
			break;
		}
		case 13: {
			output = "thirteen";
			break;
		}
		case 14: {
			output = "fourteen";
			break;
		}
		case 15: {
			output = "fifteen";
			break;
		}
		case 16: {
			output = "sixteen";
			break;
		}
		case 17: {
			output = "seventeen";
			break;
		}
		case 18: {
			output = "eighteen";
			break;
		}
		case 19: {
			output = "nineteen";
			break;
		}
		}
		return output;
	}

	public String findHundreds(int hundreds) {
		String output = "";

		switch (hundreds) {
		case 0: {
			output = "";
			break;
		}
		case 1: {
			output = "one hundred";
			break;
		}
		case 2: {
			output = "two hundred";
			break;
		}
		case 3: {
			output = "three hundred";
			break;
		}
		case 4: {
			output = "four hundred";
			break;
		}
		case 5: {
			output = "five hundred";
			break;
		}
		case 6: {
			output = "six hundred";
			break;
		}
		case 7: {
			output = "seven hundred";
			break;
		}
		case 8: {
			output = "eight hundred";
			break;
		}
		case 9: {
			output = "nine hundred";
			break;
		}
		}
		return output;
	}

	public String findThousands(int thousands) {
		String output = "";

		switch (thousands) {
		case 0: {
			output = "";
			break;
		}
		case 1: {
			output = "one thousand";
			break;
		}
		case 2: {
			output = "two thousand";
			break;
		}
		case 3: {
			output = "three thousand";
			break;
		}
		case 4: {
			output = "four thousand";
			break;
		}
		case 5: {
			output = "five thousand";
			break;
		}
		case 6: {
			output = "six thousand";
			break;
		}
		case 7: {
			output = "seven thousand";
			break;
		}
		case 8: {
			output = "eight thousand";
			break;
		}
		case 9: {
			output = "nine thousand";
			break;
		}
		}
		return output;
	}

	public static int countAllCharsSequence() {
		// A method for checking the sum of chars from 1 up to 1000,
		// Spaces and hyphens are discharged.
		// Answer: 21124
		String string = "";
		int len = 0;
		NumberToLetters counter = new NumberToLetters();
		for (int i = 1; i <= 1000; i++) {
			string = (counter.find(i) + "").replaceAll("[-\\s]", "");
			len += string.length();
		}
		return len;
	}

	public static void main(String[] args) {
		int len = countAllCharsSequence();
		System.out.println(len);
	}
}
