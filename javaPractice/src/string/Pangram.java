package string;

import java.util.Arrays;
import java.util.List;

public class Pangram {
    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
    }

    public static String pangrams(String s) {
        // Write your code here


        List<Character> list = List.of('a','b','c','d','e','h','i','j','k','l','m','n'
                ,'m','o','p','q','r','s','t','u','v','x','y','z');

        for(int j=0; j < s.length() ; j ++){
            if( list.contains(s.charAt(j))){
                return "pangram";
            }
        }

        return "not pangram";
    }

    // Type 2  Using streams
    public static String pangrams2(String s) {
        return Arrays.stream(s.toLowerCase().split(""))
                .filter(c -> c.matches("[a-z]"))
                .distinct()
                .count() == 26 ? "pangram" : "not pangram";
    }




}
