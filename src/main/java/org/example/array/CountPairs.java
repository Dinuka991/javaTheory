package array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountPairs {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(10,20,20,10,10,30,50,10,20);
        System.out.println(countPairs(integerList));

    }

    // Type 1

    public  static  int countPairs(List<Integer> integerList){

        Map<Integer , Integer>  countPair = new HashMap<>();
        int count = 0;

        for(int a: integerList){
            countPair.put(a, countPair.getOrDefault(a,0)+1);
        }

        for(int n: countPair.values()){
           count+=n/2;
        }
        return count;
    }


}
