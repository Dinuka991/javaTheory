package string;

import java.util.stream.IntStream;

public class PalindromeDemo {
    public static void main(String[] args) {
        PalindromeDemo pd = new PalindromeDemo();
        System.out.println(pd.isPalindrome("madam"));
        System.out.println(pd.isPalindrome2("madam"));
        System.out.println(pd.isPalindrome3("madam"));
        System.out.println(pd.isPalindrome4("madam"));
    }

    public boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.contentEquals(sb.reverse());
    }

    public boolean isPalindrome2(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean isPalindrome3(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome4(String str) {
        return IntStream.range(0, str.length() / 2)
            .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
    }
}