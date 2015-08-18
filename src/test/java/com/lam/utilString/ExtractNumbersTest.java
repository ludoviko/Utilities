package com.lam.utilString;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class ExtractNumbersTest  {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetSumOfNumbers() {
		Assert.assertEquals(22, ExtractNumbers.getSumOfNumbers("12 some text 3**7"));
		Assert.assertEquals(1, ExtractNumbers.getSumOfNumbers("acc1"));
	}

	@Test
	public void testGetNumbers() {
		Assert.assertEquals("1237", ExtractNumbers.getNumbers("12 some text 3**7"));
		Assert.assertEquals("1", ExtractNumbers.getNumbers("acc1"));
	}
}
