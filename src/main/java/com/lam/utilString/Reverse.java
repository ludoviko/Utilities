package com.lam.utilString;

public class Reverse {
    public static String reverse(String string) {
        if (  string == null  ) {
            return string;
        }

        char[] data = string.toCharArray();
        int m = data.length / 2;

        char x = ' ';
        for (int i = 0; i < m; i++) {
            x = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 -i] = x;
        }

        return  new String(data);
    }

    public static boolean isPalindrome(String word) {
		return word.equals(reverse(word));
	};
	
    public static void main(String[] args ) {
        System.out.println( Reverse.isPalindrome("adan nada") );
        System.out.println( Reverse.reverse("Hello world") );
        System.out.println( Reverse.reverse("1234") );
        System.out.println( Reverse.reverse("Caracas 23 de Enero") );
        System.out.println( Reverse.reverse("Hello world") );
    }
    
}