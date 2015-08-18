package com.lam.utilString;

import junit.framework.TestCase;

/**
 * Test cases for {@link LevenshteinWordDistanceCalculator}.
 *
 */
public class LevenshteinWordDistanceCalculatorTest extends TestCase {
    private LevenshteinWordDistanceCalculator _calculator;

    @Override
	protected void setUp() throws Exception {
        super.setUp();

        this._calculator = LevenshteinWordDistanceCalculator.DEFAULT;
    }

    public void testEmptyToEmpty() {
        this.assertDistance(0, "", "");
    }

    public void testEmptyToNonEmpty() {
        String target = "any";
        this.assertDistance(target.length(), "", target);
    }

    public void testSamePrefix() {
        this.assertDistance(3, "unzip", "undo");
    }

    public void testSameSuffix() {
        this.assertDistance(4, "eating", "running");
    }

    public void testArbitrary() {
        this.assertDistance(3, "msteak", "mistake");
        this.assertDistance(3, "necassery", "neccessary");
        this.assertDistance(5, "donkey", "mule");
    }

    private void assertDistance(int distance, String source, String target) {
        assertEquals(distance, this._calculator.calculate(source, target));
        assertEquals(distance, this._calculator.calculate(target, source));
    }
}
