package org.example.method_refference;

import java.util.Arrays;
import java.util.List;

public class DemoMethodRef {
    public static void main(String[] args) {

        Integer number = Integer.valueOf(10);
        int n = number.intValue();
        System.out.println(n);

        /**
         * Using method reference directly call to intValue method of Integer class
         */
        List<Integer> integerList = Arrays.asList(1,3,5,7,9);
        int sum = integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }



}
