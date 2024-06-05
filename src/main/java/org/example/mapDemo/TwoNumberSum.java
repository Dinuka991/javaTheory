package org.example.mapDemo;

import java.util.Arrays;
import java.util.HashMap;

public class TwoNumberSum {
    public static void main(String[] args) throws IllegalAccessException {
     var s = twoNumberSum(new int[] {3,7,5,3},10);
        Arrays.stream(s).boxed().forEach(System.out::println);
    }

    public static int[] twoNumberSum(int[] arr , int target) throws IllegalAccessException {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0 ; i < arr.length ; i ++) {
            int compliment = target - arr[i];
            if( hashMap.containsKey(compliment) ) {
                return new int[]{i, hashMap.get(compliment)};
            }
            hashMap.put(arr[i], i);
        }
            throw  new IllegalAccessException("No solutions");
        }
}
