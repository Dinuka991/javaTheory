package org.example.codePractice.practice1.string;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("amma"));
    }

    public static boolean isPalindrome(String str) {

        char[] chars = str.toCharArray();
        int l = 0;
        int r = chars.length - 1;

        while (l < r) {
            if (chars[l] != chars[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
