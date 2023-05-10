package org.example.codePractice.collection;

import java.util.Collections;
import java.util.List;

public class CollectionDemo {

    public static void main(String[] args) {
        System.out.println(findMostFrequent(List.of(1, 1, 3, 5, 5, 77, 2, 15, 5, 5, 5)));
    }

    public static Integer findMostFrequent(List<Integer> integerList) {
        Integer max = Integer.MIN_VALUE;

        for (Integer val : integerList) {
            if (Collections.frequency(integerList, val) > max) {
                max = val;
            }
        }
        return max;
    }
}
