package com.lam.utilString;


import junit.framework.TestCase;

/**
 * Test cases for {@link SoundexPhoneticEncoder}.
 *
 */
public class SoundexPhoneticEncoderTest extends TestCase {
    private SoundexPhoneticEncoder _encoder;

    @Override
	protected void setUp() throws Exception {
        super.setUp();
        this._encoder = SoundexPhoneticEncoder.INSTANCE;
    }

    public void testFirstLetterIsAlwaysUsed() {
        for (char c = 'A'; c <= 'Z'; ++c) {
            String result = this._encoder.encode(c + "-");

            assertNotNull(result);
            assertEquals(4, result.length());
            assertEquals(c, result.charAt(0));
        }
    }

    public void testVowelsAreIgnored() {
        this.assertAllEquals('0', new char[] {'A', 'E', 'I', 'O', 'U', 'H', 'W', 'Y'});
    }

    public void testLettersRepresentedByOne() {
        this.assertAllEquals('1', new char[] {'B', 'F', 'P', 'V'});
    }

    public void testLettersRepresentedByTwo() {
        this.assertAllEquals('2', new char[] {'C', 'G', 'J', 'K', 'Q', 'S', 'X', 'Z'});
    }

    public void testLettersRepresentedByThree() {
        this.assertAllEquals('3', new char[] {'D', 'T'});
    }

    public void testLettersRepresentedByFour() {
        this.assertAllEquals('4', new char[] {'L'});
    }

    public void testLettersRepresentedByFive() {
        this.assertAllEquals('5', new char[] {'M', 'N'});
    }

    public void testLettersRepresentedBySix() {
        this.assertAllEquals('6', new char[] {'R'});
    }

    public void testDuplicateCodesAreDropped() {
        assertEquals("B100", this._encoder.encode("BFPV"));
        assertEquals("C200", this._encoder.encode("CGJKQSXZ"));
        assertEquals("D300", this._encoder.encode("DDT"));
        assertEquals("L400", this._encoder.encode("LLL"));
        assertEquals("M500", this._encoder.encode("MNMN"));
        assertEquals("R600", this._encoder.encode("RRR"));
    }

    public void testSomeRealStrings() {
        assertEquals("S530", this._encoder.encode("Smith"));
        assertEquals("S530", this._encoder.encode("Smythe"));
        assertEquals("M235", this._encoder.encode("McDonald"));
        assertEquals("M235", this._encoder.encode("MacDonald"));
        assertEquals("H620", this._encoder.encode("Harris"));
        assertEquals("H620", this._encoder.encode("Harrys"));
    }

    private void assertAllEquals(char expectedValue, char[] chars) {
        for (int i = 0; i < chars.length; ++i) {
            char c = chars[i];
            String result = this._encoder.encode("-" + c);

            assertNotNull(result);
            assertEquals(4, result.length());

            assertEquals("-" + expectedValue + "00", result);
        }
    }
}
