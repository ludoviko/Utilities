package com.lam.utilString;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class HungarianCurrencyFormatTest {
	HungarianCurrencyFormat hungary;

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Before
	public void setUp() {
		this.hungary = new HungarianCurrencyFormat();
	}

	@After
	public void tearDown() {
		this.hungary = null;
	}

	@Test
	public void expectedRunTimeException() {
		this.exception.expect(IllegalArgumentException.class);
		HungarianCurrencyFormat.format("123..4");
		HungarianCurrencyFormat.format("123.456");
		HungarianCurrencyFormat.format("123..4");
		HungarianCurrencyFormat.format("1.23.123");
		HungarianCurrencyFormat.format(".");
		HungarianCurrencyFormat.format(".0");
		HungarianCurrencyFormat.format(".00");
		HungarianCurrencyFormat.format(".000");
		HungarianCurrencyFormat.format(".0000");
	}

	@Test
	public void testIsDouble() {
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("1"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("12"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("123"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("1234"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("12345"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("123456"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("1234567"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("12345678"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("123456789"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("1234567890"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("12345678901"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("123456789012"));

		Assert.assertTrue(HungarianCurrencyFormat.isDouble("1."));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("1.1"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("1.12"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("12.12"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("123.12"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("1234.12"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("12345.12"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("123456.12"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("1234567.12"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("12345678.12"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("123456789.12"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("1234567890.12"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("12345678901.12"));
		Assert.assertTrue(HungarianCurrencyFormat.isDouble("123456789012.12"));
	}

	@Test
	public void testConversion() {
		Assert.assertEquals("1", HungarianCurrencyFormat.format("1"));
		Assert.assertEquals("12", HungarianCurrencyFormat.format("12"));
		Assert.assertEquals("123", HungarianCurrencyFormat.format("123"));
		Assert.assertEquals("1 234", HungarianCurrencyFormat.format("1234"));
		Assert.assertEquals("12 345", HungarianCurrencyFormat.format("12345"));
		Assert.assertEquals("123 456", HungarianCurrencyFormat.format("123456"));
		Assert.assertEquals("1 234 567", HungarianCurrencyFormat.format("1234567"));
		Assert.assertEquals("12 345 678", HungarianCurrencyFormat.format("12345678"));
		Assert.assertEquals("123 456 789", HungarianCurrencyFormat.format("123456789"));
		Assert.assertEquals("1 234 567 890", HungarianCurrencyFormat.format("1234567890"));
		Assert.assertEquals("12 345 678 901", HungarianCurrencyFormat.format("12345678901"));
		Assert.assertEquals("123 456 789 012", HungarianCurrencyFormat.format("123456789012"));

		Assert.assertEquals("1,0", HungarianCurrencyFormat.format("1."));
		Assert.assertEquals("1,0", HungarianCurrencyFormat.format("1.0"));
		Assert.assertEquals("1,1", HungarianCurrencyFormat.format("1.1"));
		Assert.assertEquals("1,12", HungarianCurrencyFormat.format("1.12"));
		Assert.assertEquals("12,12", HungarianCurrencyFormat.format("12.12"));
		Assert.assertEquals("123,12", HungarianCurrencyFormat.format("123.12"));
		Assert.assertEquals("1 234,12", HungarianCurrencyFormat.format("1234.12"));
		Assert.assertEquals("12 345,12", HungarianCurrencyFormat.format("12345.12"));
		Assert.assertEquals("123 456,12", HungarianCurrencyFormat.format("123456.12"));
		Assert.assertEquals("1 234 567,12", HungarianCurrencyFormat.format("1234567.12"));
		Assert.assertEquals("12 345 678,12", HungarianCurrencyFormat.format("12345678.12"));
		Assert.assertEquals("123 456 789,12", HungarianCurrencyFormat.format("123456789.12"));
		Assert.assertEquals("1 234 567 890,12", HungarianCurrencyFormat.format("1234567890.12"));
		Assert.assertEquals("12 345 678 901,12", HungarianCurrencyFormat.format("12345678901.12"));
		Assert.assertEquals("123 456 789 012,12", HungarianCurrencyFormat.format("123456789012.12"));
	}
}
