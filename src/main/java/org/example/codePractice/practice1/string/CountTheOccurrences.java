package org.example.codePractice.practice1.string;

public class CountTheOccurrences {

    public static void main(String[] args) {
        System.out.println(countOccurrences("amama", 'a'));
    }

    public static int countOccurrences(String str, char c) {

        int count = 0;
        char[] chars = str.toCharArray();

        for (char c1 : chars) {
            if (c1 == c) {
                count++;
            }
        }
        return count;
    }
}
