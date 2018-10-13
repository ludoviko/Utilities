package com.lam.utilString;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PalindromicSlicesTest {
	PalindromicSlices slices;

	@Before
	public void setUp() throws Exception {
		this.slices = new PalindromicSlices(new ArrayList<String>());
	}

	@After
	public void tearDown() throws Exception {
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
