package com.lam.utilString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ludoviko Azuaje
 *
 */
public class StringUtils {
	private static final char SPACE = ' ';

	public static String getNotNull(String string) {
		if (string != null && !string.equals("")) {
			return string;
		} else {
			return "";
		}
	}

	/**
	 * This method returns the first letter within a string.
	 * 
	 * If the string is null or empty it returns an empty string.
	 * 
	 * @param string
	 *            - The string from where to extract the first char.
	 * @return a string that contains the first char.
	 */
	public static String getFirst(String string) {
		return getNotNull(string).equals("") ? "" : string.charAt(0) + "";
	}

	public static String getLast(String string) {
		return getNotNull(string).equals("") ? "" : string.charAt(string
				.length() - 1) + "";
	}

	public static String getMiddle(String string) {
		string = getNotNull(string);

		if (string.length() > 2) {
			return string.substring(1, string.length() - 1);
		} else {
			return "";
		}
	}

	// Exercise 10.12 A word is said to be a “doubloon” if every letter that
	// appears in the word appears exactly twice.
	public static boolean isDoublon(String string) {
		int max, min;

		string = string.toLowerCase();

		if (string == null || string.length() == 0) {
			return true;
		}

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Collection<Integer> values;

		for (int i = 0; i < string.length(); i++) {
			if (map.containsKey(string.charAt(i))) {
				map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
			} else {
				map.put(string.charAt(i), 1);
			}
		}

		values = map.values();

		max = Collections.max(values);
		min = Collections.min(values);

		if (max == 2 && min == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPalindromeRecursive(String string) {
		if (string == null) {
			return true;
		}

		if (string.length() <= 1) {
			return true;
		}

		if (string.charAt(0) == string.charAt(string.length() - 1)) {
			return isPalindrome(StringUtils.getMiddle(string));
		} else {
			return false;
		}
	}

	public static boolean isPalindrome(String string) {
		boolean isPalindrome = true;

		if (string == null) {
			return true;
		}

		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
			} else {
				isPalindrome = false;
				break;
			}
		}

		return isPalindrome;
	}

	public static boolean isAbecedarian(String string) {
		boolean isAbecedarian = true;

		if (string == null) {
			return true;
		}

		char[] letters = string.toCharArray();

		for (int i = 0; i < letters.length - 1; i++) {
			if (letters[i] <= letters[i + 1]) {
			} else {
				isAbecedarian = false;
				break;
			}
		}

		return isAbecedarian;
	}

	// No matter letter case.
	public static String sort(String string) {
		StringBuilder builder = new StringBuilder();

		string = StringUtils.getNotNull(string).toLowerCase();

		char[] letters = string.toCharArray();

		Arrays.sort(letters);

		for (char aChar : letters) {
			builder.append(aChar);
		}

		return builder.toString();
	}

	// Exercise 7.7 A dupledrome is a word that contains only double letters,
	// like
	// “llaammaa” or “ssaabb”.
	// Case insensitive
	public static boolean isDupledrome(String string) {
		boolean isDupledrome = true;

		string = StringUtils.getNotNull(string).toLowerCase();

		if (string.length() % 2 == 1) {
			isDupledrome = false;
		} else {
			for (int i = 0; i < string.length() / 2; i += 2) {
				if (string.charAt(i) == string.charAt(i + 1)) {
				} else {
					isDupledrome = false;
					break;
				}
			}
		}

		return isDupledrome;
	}

	// Remove duplicate letters where ever occurs except the first ocurrence.
	public static String removeDuplicateLetters(String data) {
		if (data == null ) {
			return data;
		}

		StringBuilder builder = new StringBuilder();
		int i = 0;

		while (i < data.length()) {
			if (builder.toString().contains(data.charAt(i) + "")) {
			} else {
				builder.append(data.charAt(i));
			}
			i++;
		}

		return builder.toString();
	}

	// In a given text, if there are two or more identical characters in sequence, 
	// delete the repetitions and leave only the first character.
	// Case sensitive.
	public static String removeDubleLettersInSequence(String string) {
		if (string == null || string.length() == 0 ) {
			return string;
		}
		
		StringBuilder builder = new StringBuilder();
		
		char old = string.charAt(0);
		
		for (int i = 1; i < string.length(); i++) {
			if ( string.charAt(i) == old ) {
			} else {
				builder.append(old);
			}
			old = string.charAt(i);
		}
		
		builder.append(string.charAt(string.length()-1));
		return builder.toString();
	}

	
	// Special match: it tests whether a word contains repeated letters from a
	// pattern.
	public static boolean wordMatch(String pattern, String match) {
		int p = 0;

		pattern = StringUtils.getNotNull(pattern);
		match = StringUtils.getNotNull(match);

		if (match.length() < pattern.length()) {
			return false;
		} else if (pattern.isEmpty() && !match.isEmpty()) {
			return false;
		} else if (pattern.isEmpty() && match.isEmpty()) {
			return true;
		}

		int m = 0;
		while (m < match.length() && p < pattern.length()) {
			if (match.charAt(m) == pattern.charAt(p)) {
				p++;
				m++;
			} else if (m > 0 && match.charAt(m) == match.charAt(m - 1)) {
				m++;
			} else {
				return false;
			}
		}

		// Are there any chars left in match and the end of word has been
		// reached ?
		if (m < match.length() && p == pattern.length()) {
			p--;
			while (m < match.length() && m < match.length()) {
				if (match.charAt(m) == pattern.charAt(p)) {
					m++;
				} else {
					return false;
				}
			}
		} else if (p < pattern.length()) {
			// The match string is over and still there are characters in word
			// unmatched.
			return false;
		}
		return true;
	}

	// The first letter of each word is capitalized.
	public static String toFirstUpperCase(String title) {
		char[] output = title.toCharArray();
		boolean space = true;

		for (int i = 0; i < output.length; i++) {
			if (output[i] == SPACE) {
				space = true;
				continue;
			}

			if (space) {
				output[i] = Character.toUpperCase(output[i]);
				space = false;
			}

		}

		return new String(output);
	}

	// The first letter of each word is in lower case
	public static String toFirstLowerCase(String title) {
		char[] output = title.toCharArray();
		boolean space = true;

		for (int i = 0; i < output.length; i++) {
			if (output[i] == SPACE) {
				space = true;
				continue;
			}

			if (space) {
				output[i] = Character.toLowerCase(output[i]);
				space = false;
			}
		}
		return new String(output);
	}
	
	/**
	 * Implement a method merge. The method takes two Strings as parameters and
	 * merges them, alternating letters, starting with the first letter of the
	 * first String, followed by the first letter of the second String, then
	 * second letter of first String, etc. The remaining letters of the longer
	 * String are then appended to the end of the mergered String and this
	 * mergered String is returned.
	 */
	public static String merge(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		char[] c3 = new char[s1.length() + s2.length()];

		int c = 0;
		int i = 0;
		while (i < c1.length && i < c2.length) {
			c3[c++] = c1[i];
			c3[c++] = c2[i];
			i++;
		}

		while (i < c1.length) {
			c3[c++] = c1[i];
			i++;
		}

		while (i < c2.length) {
			c3[c++] = c2[i];
			i++;
		}

		return new String(c3);
	}

	/**
	 * Method to search the index of the two left most consecutive letters
	 * within a string.
	 * 
	 * If the string is null or empty the method returs -1;
	 * 
	 * @param string
	 *            - the string to be scanned.
	 * @return an integer - the index of the the two left most consecutive
	 *         letters within the string. It returns -1 if not any.
	 */
	public static int indexTwoLeftMostConsecutiveChars(String string) {
		int index = -1;

		string = getNotNull(string);

		for (int i = 0; i < string.length() - 1; i++) {
			if (string.charAt(i) == string.charAt(i + 1)) {
				index = i;
				break;
			}
		}

		return index;
	}

	/**
	 * Your job is to write a justifier for a simplified piece of text. You are
	 * given a String[], lines, each element of which is a single line
	 * consisting of tokens separated by single spaces. For the present
	 * purposes, a token is a sequence of lowercase alphabetical characters. You
	 * are to return a String[] containing the same tokens in the same order and
	 * still separated by single spaces, distributed in such a way that no line
	 * exceeds the desired column width, which is specified by the int
	 * columnWidth. Within these constraints, you should put as many tokens as
	 * possible in the first line, then as many as possible in the second, and
	 * so on.
	 * 
	 * Note that tokens must not be split between consecutive lines, and that
	 * the number of lines in the result may differ from that in the input. The
	 * resulting lines must contain tokens separated by single spaces, without
	 * extraneous spaces at the beginning or end of a line, akin to the input.
	 * No input token will be longer than the column width.
	 * 
	 * @param lines
	 * @param columnWidth
	 * @return
	 * 
	 */

	public static String[] justify(String[] lines, int columnWidth) {
		List<String> output = new ArrayList<String>();
		String[] words = null;

		StringBuilder line = new StringBuilder();
		String data = "";

		for (String string : lines) {
			data += string + SPACE;
		}

		data = data.trim();
		if (data.contains(SPACE + "")) {
			words = data.split(SPACE + "");
		} else {
			words = new String[] { data };
		}

		int i = 0;
		while (i < words.length) {
			while (i < words.length
					&& (line.length() + words[i].length() <= columnWidth)) {
				line.append(words[i++]).append(" ");
			}

			output.add(line.toString().trim());
			line = new StringBuilder();
		}

		return output.toArray(new String[] {});
	}

	/**
	 * A method to search a pattern within a string and replace it by a replace
	 * string
	 * 
	 * @param text
	 *            : String - Text to be search into
	 * @param regex
	 *            : String - A pattern to search for
	 * @param replace
	 *            : String - The replacement text.
	 * @return The text with the pattern occurrences replaced by the replacement
	 *         text.
	 * 
	 */
	public static String replacePattern(String text, String regex,
			String replace) {
		Pattern pattern = Pattern.compile(regex);

		StringBuffer out = new StringBuffer();

		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			matcher.appendReplacement(out, replace);
		}

		// The last part of text is appended, otherwise it is missing in the
		// output string.
		matcher.appendTail(out);

		return out.toString();
	}

	/**
	 * A method for swapping elements within a string.
	 * 
	 * @param string
	 *            -the source string
	 * @param a
	 *            -the index of the first element.
	 * @param b
	 *            -the index of the second element.
	 * @return -the new string with the elements swapped.
	 */
	public static String swap(String string, int a, int b) {
		if (string == null || string.length() == 0) {
			return string;
		}

		if (a < 0 || b < 0) {
			return string;
		}

		if (a > string.length() || b > string.length()) {
			return string;
		}

		if (a == b) {
			return string;
		}

		char[] chars = string.toCharArray();
		char x = chars[a];
		chars[a] = chars[b];
		chars[b] = x;

		return new String(chars);
	}

	
	// Swap case
	public static String swapCase(String string) {
		char[] data = string.toCharArray();
		
		for (int i = 0; i < data.length; i++) {
			if (Character.isLowerCase(data[i])) {
				data[i] = Character.toUpperCase(data[i]); 
			} else if (Character.isUpperCase(data[i])) {
				data[i] = Character.toLowerCase(data[i]); 
			}
		}
		
		return new String(data);
	}
	
	// name, testing XXX
	private static String[] trans(String[] snake) {
		String[] data = new String[snake[0].length()];

		String line = "";
		for (int j = 0; j < snake[0].length(); j++) {

			for (int i = 0; i < snake.length; i++) {
				line += snake[i].charAt(j);
			}
			data[j] = line;
			line = "";
		}

		return data;
	}

	// public static String circularMoveToRight(String string, int n) {
	// return string.substring(n, n) + string.substring(0, n + 1);
	// }

	
	// Pad all lines with pad chars on the right side until they are exactly n -size- characters wide. 
	public static String padOnTheRightSide(String string, char separator, int size) {
		StringBuilder builder = new StringBuilder(string); 
		
		if (string == null ) {
			return string;
		}

		int len = string.length();
		
		if ( len >= size ) {
			return string;
		} else {
			for (int i = len; i < size; i++) {
				builder.append(separator);
			}
		}
		
		return builder.toString();
	}

}
