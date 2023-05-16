package org.example.codePractice.practice1.string;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("polos"));
    }


    public static String reverseString(String str) {

        char[] chr = str.toCharArray();
        int length = str.length();

        int l = 0;
        int r = length - 1;

        while (l < r) {
            char temp = chr[l];
            chr[l] = chr[r];
            chr[r] = temp;
            l++;
            r--;
        }
        return new String(chr);

    }
}
