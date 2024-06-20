package org.example.mock;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String testString = "madam";
        System.out.println(isPalindrome(testString) ? "is a palindrome." : "is not a palindrome.");
    }
}
