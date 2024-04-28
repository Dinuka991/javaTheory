package org.example.stream.flatMap;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findDistinctCharacters(new String[]{"amma", "poosa", "ayya", "balla"})));
    }

    /**
     * Type 1
     * <p>
     * Find the distinct characters of  given set of words
     */

    public static Character[] findDistinctCharacters(String[] strArray) {

        return Arrays.stream(strArray).flatMap(c -> c.chars().mapToObj(c2 -> (char) c2)).collect(Collectors.toSet()).toArray(Character[]::new);

    }
}
