package org.example.codePractice.practice1.string;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println(reverseString("palayan"));
        System.out.println(areAnagrams("amma", "amma"));
    }

    /**
     * using StringBuilder  reverse the string
     *
     * @param str
     * @return
     */
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    /**
     * Without using any library reverse the string
     */

    public static String reverseStringLa(String str) {

        char[] arr = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    /**
     * compare give two strings anaragms
     */

    public static Boolean areAnagrams(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        char[] ch = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        return Arrays.equals(ch, ch2);
    }
}
