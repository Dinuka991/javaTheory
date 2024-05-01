package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VowelCount {
    public static void main(String[] args) {
        String s = "somaon";
        VowelCount vowelCount = new VowelCount();
        System.out.println(vowelCount.countVowels2(s));
    }

    // Type 1
    public  int countVowels(String s) {
        int count=0;
        int end= s.length();
        String s2 = s.toLowerCase();

        for(int i = 0; i < end ; i++){
            if(s2.charAt(i) == 'a' ||
                    s.charAt(i) == 'e' ||
                    s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u' )
                count ++;
            }

        // Your code goes here.
        return count;
    }

    // Type 2
    public  long countVowels2(String s){

        Set<Character> characters = new HashSet<>();
        characters.add('a');
        characters.add('e');
        characters.add('i');
        characters.add('o');
        characters.add('u');
        return  s.chars().filter( i ->  characters.contains( (char) i)).count();
    }

}
