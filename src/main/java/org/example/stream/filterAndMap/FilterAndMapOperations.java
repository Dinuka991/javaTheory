package org.example.stream.filterAndMap;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapOperations {

    /**
     * Write the programme to filter out even numbers from list
     */
    public static void main(String[] args) {
        List<Integer> integersList = List.of(1, 3, 4, 5, 6, 7, 8, 9, 11);
        integersList.stream().filter(i -> i%2 != 0).toList().forEach(System.out::println);
    }
}
