package org.example;

public class Palindrome {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            boolean pal = isPalindrome(s);
            System.out.println(s + " is " + (pal ? "palindrome" : "not palindrome"));
        }
    }

    public static String reverseString(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        return r;
    }

    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}
