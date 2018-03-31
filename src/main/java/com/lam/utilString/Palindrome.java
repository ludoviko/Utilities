package com.lam.utilString;

/**
 * @author Ludoviko Azuaje
 * 
 *         Definition: A palindrome is a string that reads the same forward and
 *         backward. For example, "abcba" is a palindrome, "abab" is not. Please
 *         implement this method to return true if the parameter is a palindrome
 *         and false otherwise.
 */


// XXX...  Compare w calFlac
public class Palindrome {
	public static final String REGEX_Not_Letters_Numbers = "[^a-zA-Z0-9]";

	public static boolean isPalindrome(String string) {
		return isPalindrome(string, false);
	}

	public static boolean isPalindrome(String string, boolean ignorePunctuation) {
		if (ignorePunctuation) {
			string = string.replaceAll(REGEX_Not_Letters_Numbers, "").toLowerCase();
		} else {
		}

		int len = string.length();
		int half_len = len / 2;

		for (int i = 0; i < half_len; i++) {
			if (string.charAt(i) == string.charAt(len - i - 1)) {
			} else {
				return false;
			}
		}
		return true;
	}

    public static boolean isPalindrome(char[] array) {
        // This method is intended to be lowlevel
        boolean result = true;

        for (int i = 0; i < array.length / 2; i++) {
            if ( array[i] == array[array.length - 1 - i] ) {
            } else {
                result = false;
                break;
            }
        }

        return  result;
    }

	public static boolean isPalindrome(Integer[] array) {
		boolean result = true;

        for (int i = 0; i < array.length / 2; i++) {
            if ( array[i] == array[array.length - 1 - i] ) {
			} else {
				result = false;
				break;
			}
		}

		return  result;
	}

	private static boolean isAlpha(char a) {
		if (a >= 'a' && a <= 'z')
			return true;
		if (a >= 'A' && a <= 'Z')
			return true;
		return false;
	}

	public static void main(String[] strings) {
		System.out.println(Palindrome.isPalindrome("a"));
		System.out.println(Palindrome.isPalindrome("abba"));
		System.out.println("abXba: " + Palindrome.isPalindrome("abXba"));
		System.out.println(Palindrome.isPalindrome("La calabaza"));
		System.out.println(Palindrome.isPalindrome("adan nada") + "\n");

		System.out.println(Palindrome.isPalindrome("a".toCharArray()));
		System.out.println(Palindrome.isPalindrome("abba".toCharArray()));
		System.out.println(Palindrome.isPalindrome("abXba".toCharArray()));
		System.out
				.println(Palindrome.isPalindrome("La calabaza".toCharArray()));
		System.out.println(Palindrome.isPalindrome("adan nada".toCharArray()));

		// System.out.println( Palindrome.isPalindrome(new char[] {'a', 'b',
		// 'b', 'a' } ));
		// System.out.println( Palindrome.isPalindrome(new char[] {'a', 'b',
		// 'X', 'b', 'a' } ));
		// System.out.println( Palindrome.isPalindrome(new char[] {'L', 'a',
		// 'c', 'a' , 'l' , 'a' , 'b' , 'a' , 'z', 'a' } ));
		// System.out.println( Palindrome.isPalindrome(new char[] { 'a', 'd',
		// 'a' , 'n' , ' ' , 'n' , 'a' , 'd', 'a' } ));
	}

    // XXX...  Compare w calFlac
    public boolean isPalindrome(String data, int from, int upTo,
                                boolean ignorePunctuation) {
        //	String data = string;
        // Data is in lower case
        // XXX in construction XXX
        // REGEX is too slow
        int half_len = (upTo - from) / 2 + from;
        int rest = (upTo - from) % 2;

        int i = 0;
        int j = 0;
        int c = 0;
        for (; i < (upTo - from) / 2 || j < (upTo - from) / 2; ) {
            if (ignorePunctuation) {
                while ((data.charAt(half_len - i - 1) + "")
                        .matches(REGEX_Not_Letters_Numbers)) {
                    i++;
                }
                while ((data.charAt(half_len + rest + j) + "")
                        .matches(REGEX_Not_Letters_Numbers)) {
                    j++;
                }
            }
            if (data.charAt(half_len - i - 1) == data.charAt(half_len + rest
                    + j)) {
                i++;
                j++;
                c++;
            } else {
                return false;
            }
        }
        return true;
    }
}
