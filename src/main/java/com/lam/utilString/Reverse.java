package com.lam.utilString;

/*
Assume that the parameter String can only contain spaces and alphanumeric characters.
Please implement this method to
reverse each word in the original String while maintaining the word order.
For example:
parameter: "Hello world", result: "olleH dlrow"
*/

public class Reverse {

    public static String reverseWords(String chainedWords) {
    	String reverseWords = "";
    	String[] words  = chainedWords.split(" "); 
      	
       	for (int i=0 ; i < words.length; i++ ) {
       		if ( i < words.length - 1 ) {
           		reverseWords +=  Reverse.reverseExpression(words[i]) + " " ;
       		} else {
           		reverseWords +=  Reverse.reverseExpression(words[i]) ;
       		};
       	};
    	return reverseWords;
    };
    
    @Deprecated
    public static String reverseSingleWord_2(String word) {
    	String reverse = "";
    	
    	for ( int i = 0; i < word.length(); i++  ) {
    		reverse +=  word.charAt(word.length() - i - 1) + "";
    	};
    	return reverse;
    };
    
    public static String reverseExpression(String word) {
    	StringBuilder builder = new StringBuilder(word);
    	builder = builder.reverse();
    	return builder.toString();
    };

    @Deprecated
    public static boolean isPalindrome(String word) {
		return word.equals(reverseExpression(word));
	};
	
    @Deprecated
    public static boolean isPalindrome(int word) {
		return isPalindrome(word + "");
	};
 
    public static void main(String[] args ) {
        System.out.println( Reverse.isPalindrome("adan nada") );
        System.out.println( Reverse.reverseWords("Hello world") );
        System.out.println( Reverse.reverseExpression("1234") );
        System.out.println( Reverse.reverseExpression("Caracas 23 de Enero") );
        System.out.println( Reverse.reverseSingleWord_2("Hello world") );
        System.out.println( "olleH dlrow".equals(Reverse.reverseWords("Hello world")) );
    }
    
}