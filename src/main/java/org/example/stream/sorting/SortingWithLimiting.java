package org.example.stream.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingWithLimiting {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 4, 5, 6));

        Long sum = integerList.stream().sorted(Comparator.reverseOrder()).limit(4).mapToLong(Integer::intValue).sum();
        System.out.println(sum);
    }
}
