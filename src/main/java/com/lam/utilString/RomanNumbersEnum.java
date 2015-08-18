package com.lam.utilString;

import java.util.ArrayList;
import java.util.List;

public enum RomanNumbersEnum {
	I("I", 1), IV("IV", 4), V("V", 5), IX("IX", 9), X("X", 10), XL("XL", 40), L(
			"L", 50), XC("XC", 90), C("C", 100), CD("CD", 400), D("D", 500), CM(
			"CM", 900), M("M", 1000);

	private String name;
	private int value;

	private RomanNumbersEnum(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return this.name;
	}

	public int getValue() {
		return this.value;
	}

	public static List<String> getNames() {
		List<String> list = new ArrayList<String>();

		RomanNumbersEnum[] array = RomanNumbersEnum.values();

		for (RomanNumbersEnum roman : array) {
			list.add(roman.getName());
		}
		return list;
	}
}
