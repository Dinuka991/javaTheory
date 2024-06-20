package org.example.mock;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcdeabcbb";
        System.out.println("Length of the longest substring without repeating characters: " + lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        // Use the HashSet to store characters in the current window
        Set<Character> characters = new HashSet<>();

        // Initialize two pointers for the sliding window
        int left = 0, right = 0;

        // Max length
        int maxLength = 0;

        // Loop through the String using the right pointer
        while (right < s.length()) {
            // If the character at the right pointer is not in the set, then add it
            if (!characters.contains(s.charAt(right))) {
                characters.add(s.charAt(right));
                right++;

                // Update the maximum length if the current window is larger
                maxLength = Math.max(maxLength, right - left);
            } else {
                // If the character is already in the set, remove the character at the left pointer
                characters.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}
