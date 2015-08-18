package com.lam.utilDate;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsLeapYear() {
		Assert.assertFalse(DateUtil.isLeapYear(2014));
	}

	@Test
	public void testIsCentury() {
		Assert.assertTrue(DateUtil.isCentury(100));
		Assert.assertTrue(DateUtil.isCentury(200));
		Assert.assertTrue(DateUtil.isCentury(300));
		Assert.assertTrue(DateUtil.isCentury(400));
		Assert.assertFalse(DateUtil.isCentury(5));
		Assert.assertFalse(DateUtil.isCentury(15));
		Assert.assertFalse(DateUtil.isCentury(25));
		Assert.assertFalse(DateUtil.isCentury(2005));
	}

	@Test
	public void testIsDateRight() {
		Assert.assertTrue(DateUtil.isDateRight(1, 1, 2000));
		Assert.assertTrue(DateUtil.isDateRight(23, 1, 2005));
		Assert.assertTrue(DateUtil.isDateRight(31, 1, 2000));
		Assert.assertFalse(DateUtil.isDateRight(30, 2, 2000));
		Assert.assertFalse(DateUtil.isDateRight(31, 2, 2000));
	}
}
