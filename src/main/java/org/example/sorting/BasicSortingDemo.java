package org.example.sorting;

import java.util.Comparator;
import java.util.List;

public class BasicSortingDemo {


    public static void main(String[] args) {

        List<Integer> integerList = List.of(1,3,55,2,55,22,67);
        integerList.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);


    }

}
