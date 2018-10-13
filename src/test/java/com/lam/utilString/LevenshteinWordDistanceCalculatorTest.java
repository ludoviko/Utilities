package com.lam.utilString;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test cases for {@link LevenshteinWordDistanceCalculator}.
 *
 */
public class LevenshteinWordDistanceCalculatorTest {
    private LevenshteinWordDistanceCalculator _calculator;

    @After
    public void tearDown() throws Exception {
        this._calculator = null;
    }

    @Before
    public void setUp() throws Exception {
        this._calculator = LevenshteinWordDistanceCalculator.DEFAULT;
    }

    @Test
    public void testEmptyToEmpty() {
        this.assertDistance(0, "", "");
    }

    @Test
    public void testEmptyToNonEmpty() {
        String target = "any";
        this.assertDistance(target.length(), "", target);
    }

    @Test
    public void testSamePrefix() {
        this.assertDistance(3, "unzip", "undo");
    }

    @Test
    public void testSameSuffix() {
        this.assertDistance(4, "eating", "running");
    }

    @Test
    public void testArbitrary() {
        this.assertDistance(3, "msteak", "mistake");
        this.assertDistance(3, "necassery", "neccessary");
        this.assertDistance(5, "donkey", "mule");
    }


    private void assertDistance(int distance, String source, String target) {
        Assert.assertEquals(distance, this._calculator.calculate(source, target));
        Assert.assertEquals(distance, this._calculator.calculate(target, source));
    }
}
