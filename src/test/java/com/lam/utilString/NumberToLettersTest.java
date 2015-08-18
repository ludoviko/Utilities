package com.lam.utilString;


import junit.framework.TestCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberToLettersTest extends TestCase {

	NumberToLetters letters;
	
	@Override
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		this.letters = new NumberToLetters();
	}

	@Override
	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		this.letters = null;
	}

	@Test
	public void testFind() {
		Assert.assertEquals("zero", this.letters.find(0));
		Assert.assertEquals("one", this.letters.find(1));
		Assert.assertEquals("three hundred and forty-two", this.letters.find(342));
	}
	
	@Test
	public void testcountAllCharsSequence() {
		Assert.assertEquals(21124, NumberToLetters.countAllCharsSequence()); 
	}
}
