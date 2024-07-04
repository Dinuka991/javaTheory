package map;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {
    public static void main(String[] args) {
       var k = List.of(1,2,2,4,4,5,5,5);
        System.out.println( lonelyinteger(k));
        System.out.println( lonelyinteger3(k));


    }

    // Type 1

    public static int lonelyinteger(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int a: arr){
            frequencyMap.put(a,frequencyMap.getOrDefault(a,0)+1);
        }
        for(int a: frequencyMap.keySet()){
            if(frequencyMap.get(a) ==1){
                return a;
            }
        }
        return -1;
    }

    // Type 2
    public static int lonelyinteger3(List<Integer> arr) {
        return arr.stream()
                .filter(n -> Collections.frequency(arr, n) == 1)
                .findFirst()
                .orElse(-1);
    }





}
