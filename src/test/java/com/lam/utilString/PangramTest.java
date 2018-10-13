package com.lam.utilString;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * @author  L.Azuaje
 */


public class PangramTest  {
    Pangram pangram;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testPangram() {
        this.pangram = new Pangram("TheQuickBrownFoxJumpsOverTheLazyDog");
        this.pangram.find();
        Assert.assertTrue(this.pangram.isPangram());
    }

    @Test
    public void testGetNumbers() {
        this.pangram = new Pangram("A slow yellow fox crawls under the proactive dog");
        this.pangram.find();
        Assert.assertFalse(this.pangram.isPangram());
        Assert.assertEquals("bjkmqz", pangram.getMissingLetters());
    }
}
