package com.lam.utilString;

import java.util.TreeMap;

import junit.framework.TestCase;


public class WordCountTest extends TestCase {

	// Tested with JUnit 4
	TreeMap<String, Integer> map;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.map  = new TreeMap<String, Integer>();
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		this.map = null;
	}

	public void testWordCount() {
        WordCount wc = new WordCount();
        wc.processLine("Abcam Z ZZ z Abcam and the and the  Abcam");
        System.out.println(wc.getMap());
		this.map.put("abcam", 3);
		this.map.put("z", 2);
		this.map.put("zz", 1);
		this.map.put("and", 2);
		this.map.put("the", 2);
		WordCountTest.assertEquals("Sorry, error in the output.", this.map, wc.getMap());
	}
}
