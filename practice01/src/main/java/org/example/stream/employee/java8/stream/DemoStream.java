package org.example.stream.employee.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DemoStream {

    public static void main(String[] args) {
        System.out.println( secondLargest(List.of(555.0,3232.0,2323.0 , 222323.0)));

    }

    // Find the second  largest salary i

    public static double  secondLargest(List<Double> numbers){
        List<Double> toSort = new ArrayList<>(numbers);
        toSort.sort(Comparator.reverseOrder());
        boolean first = true;
        for (Double number : toSort) {
            if (first) {
                first = false;
                continue;
            }
            return Optional.of(number).get();
        }
        return Optional.<Double>empty().get();
    }

}
