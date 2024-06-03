package string;

import java.util.*;

public class Pangram {
    public static void main(String[] args) {
        System.out.println(pangrams("We  judged antique ivory buckles for the next prize"));
    }

    public static String pangrams(String s) {
        // Write your code here

        String s1 = s.toLowerCase().replaceAll("[^a-z]","");

        Set<Character> myCharSet =  new HashSet<>();
        for(int i = 0 ; i < s1.length() ; i ++){
            myCharSet.add(s1.charAt(i));
        }

        if(myCharSet.size() < 26){
            return "No Pangram";
        }

        return "pangram";
    }

    // Type 2  Using streams
    public static String pangrams2(String s) {
        return Arrays.stream(s.toLowerCase().split(""))
                .filter(c -> c.matches("[a-z]"))
                .distinct()
                .count() == 26 ? "pangram" : "not pangram";
    }




}
