package com.lam.utilString;

import java.util.Arrays;

/**
 * @author L.Azuaje
 *
 *        <p/>Class for testing whether a sentence is a pangram.
 *
 *        It also can provide which letters are missing in the sentence to complete a pangram.
 *
 *         <p/>
 *         A pangram (Greek: παν γράμμα, pan gramma, "every letter") or holoalphabetic sentence for a given
 *         alphabet is a sentence using every letter of the alphabet at least once. Pangrams have been used
 *         to display typefaces, test equipment, and develop skills in handwriting, calligraphy, and keyboarding.
 */

public class Pangram {
    private static final String LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final char[] LETTER_CHARS = LETTERS.toCharArray();

    private String string;
    private String missingLetters;
    private boolean isPangram;

    Pangram(String string) {
        this.string = string;
        this.missingLetters = "";
        this.isPangram = false;
    }

    /**
     * Finds whether the string is a pangram.
     *
     * If not then it finds the missing letters.
     *
     */
    public void find() {
        String missings = "";

        string = string.toLowerCase();

        int[] frequency = new int[LETTER_CHARS.length];

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                frequency[string.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == 0) {
                missings += (char) (i + 'a');
            }
        }

        if (missings.length() > 0) {
            char[] missData = missings.toCharArray();
            Arrays.sort(missData);
            this.missingLetters = new String(missData);
        } else {
            this.isPangram = true;

        }
    }

    public String getMissingLetters() {
        return this.missingLetters;
    }

    public boolean isPangram() {
        return this.isPangram;
    }

}
