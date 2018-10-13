package com.lam.utilString;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test cases for {@link SoundexPhoneticEncoder}.
 *
 */
public class SoundexPhoneticEncoderTest {
    private SoundexPhoneticEncoder _encoder;

    @Before
    public void setUp() throws Exception {
        this._encoder = SoundexPhoneticEncoder.INSTANCE;
    }

    @Test
    public void testFirstLetterIsAlwaysUsed() {
        for (char c = 'A'; c <= 'Z'; ++c) {
            String result = this._encoder.encode(c + "-");

            Assert.assertNotNull(result);
            Assert.assertEquals(4, result.length());
            Assert.assertEquals(c, result.charAt(0));
        }
    }

    @Test
    public void testVowelsAreIgnored() {
        this.assertAllEquals('0', new char[] {'A', 'E', 'I', 'O', 'U', 'H', 'W', 'Y'});
    }

    @Test
    public void testLettersRepresentedByOne() {
        this.assertAllEquals('1', new char[] {'B', 'F', 'P', 'V'});
    }

    @Test
    public void testLettersRepresentedByTwo() {
        this.assertAllEquals('2', new char[] {'C', 'G', 'J', 'K', 'Q', 'S', 'X', 'Z'});
    }

    @Test
    public void testLettersRepresentedByThree() {
        this.assertAllEquals('3', new char[] {'D', 'T'});
    }

    @Test
    public void testLettersRepresentedByFour() {
        this.assertAllEquals('4', new char[] {'L'});
    }

    @Test
    public void testLettersRepresentedByFive() {
        this.assertAllEquals('5', new char[] {'M', 'N'});
    }

    @Test
    public void testLettersRepresentedBySix() {
        this.assertAllEquals('6', new char[] {'R'});
    }

    @Test
    public void testDuplicateCodesAreDropped() {
        Assert.assertEquals("B100", this._encoder.encode("BFPV"));
        Assert.assertEquals("C200", this._encoder.encode("CGJKQSXZ"));
        Assert.assertEquals("D300", this._encoder.encode("DDT"));
        Assert.assertEquals("L400", this._encoder.encode("LLL"));
        Assert.assertEquals("M500", this._encoder.encode("MNMN"));
        Assert.assertEquals("R600", this._encoder.encode("RRR"));
    }

    @Test
    public void testSomeRealStrings() {
        Assert.assertEquals("S530", this._encoder.encode("Smith"));
        Assert.assertEquals("S530", this._encoder.encode("Smythe"));
        Assert.assertEquals("M235", this._encoder.encode("McDonald"));
        Assert.assertEquals("M235", this._encoder.encode("MacDonald"));
        Assert.assertEquals("H620", this._encoder.encode("Harris"));
        Assert.assertEquals("H620", this._encoder.encode("Harrys"));
    }

    private void assertAllEquals(char expectedValue, char[] chars) {
        for (int i = 0; i < chars.length; ++i) {
            char c = chars[i];
            String result = this._encoder.encode("-" + c);

            Assert.assertNotNull(result);
            Assert.assertEquals(4, result.length());

            Assert.assertEquals("-" + expectedValue + "00", result);
        }
    }
}
