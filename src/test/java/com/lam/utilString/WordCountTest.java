package com.lam.utilString;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.TreeMap;


public class WordCountTest {

	// Tested with JUnit 4
	TreeMap<String, Integer> map;

    @Before
    public void setUp() throws Exception {
        this.map  = new TreeMap<String, Integer>();
    }

    @After
    public void tearDown() throws Exception {
        this.map = null;
    }

    @Test
    public void testWordCount() {
        WordCount wc = new WordCount();
        wc.processLine("Abcam Z ZZ z Abcam and the and the  Abcam");
        System.out.println(wc.getMap());
        this.map.put("abcam", 3);
        this.map.put("z", 2);
        this.map.put("zz", 1);
        this.map.put("and", 2);
        this.map.put("the", 2);
        Assert.assertEquals("Sorry, error in the output.", this.map, wc.getMap());
    }
}
