package com.lam.utilDate;

public class DateUtil {
	public static boolean isLeapYear(int year) {
		if (isCentury(year)) {
			return year % 400 == 0 ? true : false;
		} else {
			return year % 4 == 0 ? true : false;
		}
	}

	public static boolean isCentury(int year) {
		return year % 100 == 0 ? true : false;
	}

	public static boolean isDateRight(int day, int month, int year) {
		int[] maxDayInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (month >= 1 & month <= 12) {
		} else {
			return false;
		}

		if (isLeapYear(year)) {
			maxDayInMonth[1]++;
		}

		if (day < 1 || day > maxDayInMonth[month - 1]) {
			return false;
		}

		return true;
	}
}
