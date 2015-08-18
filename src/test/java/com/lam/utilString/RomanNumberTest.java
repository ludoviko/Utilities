package com.lam.utilString;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanNumberTest extends TestCase {

	@Override
	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@Override
	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testIsRoman() {
		Assert.assertTrue(RomanNumber.isRomanString("I"));
		Assert.assertTrue(RomanNumber.isRomanString("IV"));
		Assert.assertTrue(RomanNumber.isRomanString("MCMXCIX"));
		Assert.assertTrue(RomanNumber.isRomanString("MMDCC"));
		Assert.assertFalse(RomanNumber.isRomanString("Z"));
		Assert.assertFalse(RomanNumber.isRomanString("AZ"));
		Assert.assertFalse(RomanNumber.isRomanString("ABZ"));
	}

	@Test
	public void testGetRoman() {
		Assert.assertEquals("IV", RomanNumber.getRoman(4));
		Assert.assertEquals("IX", RomanNumber.getRoman(9));
		Assert.assertEquals("X", RomanNumber.getRoman(10));
		Assert.assertEquals("XI", RomanNumber.getRoman(11));
		Assert.assertEquals("XXVII", RomanNumber.getRoman(27));
		Assert.assertEquals("XLIX", RomanNumber.getRoman(49));
		Assert.assertEquals("CD", RomanNumber.getRoman(400));
		Assert.assertEquals("MCMXCIX", RomanNumber.getRoman(1999));
		Assert.assertEquals("MMD", RomanNumber.getRoman(2500));
		Assert.assertEquals("MMDC", RomanNumber.getRoman(2600));
		Assert.assertEquals("MMDCC", RomanNumber.getRoman(2700));
		Assert.assertEquals("MMM", RomanNumber.getRoman(3000));
	}

	@Test
	public void testGetDecimal() {
		Assert.assertEquals("4", RomanNumber.getDecimal("IV"));
		Assert.assertEquals("9", RomanNumber.getDecimal("IX"));
		Assert.assertEquals("10", RomanNumber.getDecimal("X"));
		Assert.assertEquals("11", RomanNumber.getDecimal("XI"));
		Assert.assertEquals("27", RomanNumber.getDecimal("XXVII"));
		Assert.assertEquals("49", RomanNumber.getDecimal("XLIX"));
		Assert.assertEquals("1999", RomanNumber.getDecimal("MCMXCIX"));
		Assert.assertEquals("2500", RomanNumber.getDecimal("MMD"));
		Assert.assertEquals("2600", RomanNumber.getDecimal("MMDC"));
		Assert.assertEquals("2700", RomanNumber.getDecimal("MMDCC"));
		Assert.assertEquals("3000", RomanNumber.getDecimal("MMM"));
		// Assert.assertEquals("", RomanNumber.getDecimal(""));
	}
}
