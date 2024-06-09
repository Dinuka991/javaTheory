package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

public class ArrayGames {
    public static void main(String[] args) {
        System.out.println(findSecondLargestElementArray(new int[] {1,3,5,6}));
    }

    public static int findSecondLargestElementArray(int[] arr){

            Optional<Integer> num = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst();
            if(num.isPresent()){
                return  num.get();
            }else {
                throw  new ArrayIndexOutOfBoundsException("Array size less than 2");
            }
    }
}
