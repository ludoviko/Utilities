package com.lam.utilDate;

import java.util.Calendar;
import java.util.GregorianCalendar;

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

    public static String getDay(String day, String month, String year) {
        Calendar calendar = new GregorianCalendar();

        calendar.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));

        String dayOfWeek = null;
        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1: {
                dayOfWeek = "Sunday".toUpperCase();
                break;
            }
            case 2: {
                dayOfWeek = "Monday".toUpperCase();
                break;
            }
            case 3: {
                dayOfWeek = "Tuesday".toUpperCase();
                break;
            }
            case 4: {
                dayOfWeek = "Wednesday".toUpperCase();
                break;
            }
            case 5: {
                dayOfWeek = "Thursday".toUpperCase();
                break;
            }
            case 6: {
                dayOfWeek = "Friday".toUpperCase();
                break;
            }
            case 7: {
                dayOfWeek = "Saturday".toUpperCase();
                break;
            }

        }

        return dayOfWeek;
    }
}
