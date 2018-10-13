package com.lam.utilString;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberToLettersTest {
	NumberToLetters letters;
	
	@Before
	public void setUp() throws Exception {
		this.letters = new NumberToLetters();
	}

	@After
	public void tearDown() throws Exception {
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
