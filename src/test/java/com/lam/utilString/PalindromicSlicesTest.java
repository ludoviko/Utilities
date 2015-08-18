package com.lam.utilString;


import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PalindromicSlicesTest extends TestCase {
	PalindromicSlices slices;

	@Override
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		this.slices = new PalindromicSlices(new ArrayList<String>());
	}

	@Override
	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		this.slices = null;
	}

	@Test
	public void testSolution() {
		Assert.assertEquals(6, this.slices.size("baababa"));
		List<String> list = this.slices.getSlices();
		Assert.assertEquals("aa", list.get(0) );
		Assert.assertEquals("aba", list.get(1) );
		Assert.assertEquals("aba", list.get(2) );
		Assert.assertEquals("ababa", list.get(3) );
		Assert.assertEquals("baab", list.get(4) );
		Assert.assertEquals("bab", list.get(5) );
	}
}
