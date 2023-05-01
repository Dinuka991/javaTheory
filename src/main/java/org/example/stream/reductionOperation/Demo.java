package org.example.stream.reductionOperation;

import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Integer> integersList = List.of(1, 3, 4, 5, 6, 7, 8, 9, 11);

        // Find the sum of even numbers
        System.out.println((long) integersList.stream().reduce(0, Integer::sum));

        // Find the  multiplication of starting second number of list
        System.out.println(integersList.stream().reduce(1, (a,b) -> a*b));

    }
}
