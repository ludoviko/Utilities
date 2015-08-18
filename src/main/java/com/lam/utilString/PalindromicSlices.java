package com.lam.utilString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         In this problem we consider only strings consisting of lower-case
 *         English letters (a−z).
 * 
 *         A string is a palindrome if it reads exactly the same from left to
 *         right as it does from right to left. For example, these strings are
 *         palindromes:
 * 
 *         aza abba abacaba
 * 
 *         These strings are not palindromes:
 * 
 *         zaza abcd abacada
 * 
 *         Given a string S of length N, a slice of S is a substring of S
 *         specified by a pair of integers (p, q), such that 0 ≤ p < q < N. A
 *         slice (p, q) of string S is palindromic if the string consisting of
 *         letters S[p], S[p+1], ..., S[q] is a palindrome. For example, in a
 *         string S = abbacada:
 * 
 *         slice (0, 3) is palindromic because abba is a palindrome, slice (6,
 *         7) is not palindromic because da is not a palindrome, slice (2, 5) is
 *         not palindromic because baca is not a palindrome, slice (1, 2) is
 *         palindromic because bb is a palindrome.
 * 
 *         Write a function
 * 
 *         int solution(char *S);
 * 
 *         that, given a string S of length N letters, returns the number of
 *         palindromic slices of S. The function should return −1 if this number
 *         is greater than 100,000,000.
 * 
 *         For example, for string S = baababa the function should return 6,
 *         because exactly six of its slices are palindromic; namely: (0, 3),
 *         (1, 2), (2, 4), (2, 6), (3, 5), (4, 6).
 * 
 *         Assume that:
 * 
 *         N is an integer within the range [0..20,000]; string S consists only
 *         of lower-case letters (a−z).
 * 
 *         Complexity:
 * 
 *         expected worst-case time complexity is O(N); expected worst-case
 *         space complexity is O(N) (not counting the storage required for input
 *         arguments).
 * 
 *         Copyright 2009–2013 by Codility Limited. All Rights Reserved.
 *         Unauthorized copying, publication or disclosure prohibited. + add
 *         your test case(s)
 * 
 *         Score: 38 %.
 */

public class PalindromicSlices {
	
	private List<String> slices; 
	
	public PalindromicSlices(List<String> slices) {
		this.slices = slices;
	}
	
	private int solution_2(String string) {
		this.slices.clear();
		
		int TOP = 100000000;
		int sum = 0;
		char[] chars = new char[string.length()];
		char[] chars_b;

		for (int i = 0; i < string.length() - 1; i++) {
			chars[i] = string.charAt(i);
			for (int j = i + 1; j < string.length(); j++) {
				chars[j] = string.charAt(j);

				chars_b = new char[j + 1 - i];

				for (int m = 0; m < j + 1 - i; m++) {
					chars_b[m] = chars[m + i];
				}
				if (Palindrome.isPalindrome(chars_b)) {
				//	System.out.println(chars_b);
					this.slices.add(new String(chars_b));
					sum++;
				}
			}
//			for (int k = 0; k < string.length(); k++) {
//				chars[k] = ' ';
//			}
			Arrays.fill(chars, ' ');
		}
	
		if (sum > TOP) {
			sum = -1;
		}
		return sum;
	}

	public int size(String string) {
		// 38 %
		this.slices.clear();
		int TOP = 100000000;
		int sum = 0;

		for (int i = 0; i < string.length() - 1; i++) {
			for (int j = i + 2; j <= string.length(); j++) {
				if (Palindrome.isPalindrome(string.substring(i, j))) {
					this.slices.add(string.substring(i,j));
					sum++;
				}
			}
		};
		Collections.sort(slices); 
		if (sum > TOP) {
			sum = -1;
		}
		return sum;
	}

	private void traverse(String string) {
		for (int i = 0; i < string.length() - 1; i++) {
			for (int j = i + 2; j <= string.length(); j++) {
				System.out.println(string.substring(i,j));
			}
		}
	}
	
	public List<String> getSlices() {
		return this.slices;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PalindromicSlices solution = new PalindromicSlices(new ArrayList<String>());
		System.out.println("Answer: " + solution.size("baababa"));
		System.out.println("Answer: " + solution.getSlices());
		System.out.println("Answer: " + solution.size("confuciussaymadamimadam"));
		System.out.println("Answer: " + solution.getSlices());
			
		}
}
