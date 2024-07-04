package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrequencyDemo {
    public static void main(String[] args) {
        var  stringList = List.of("abc","abc","bc");
        var queries = List.of("abc","ab","c");
        System.out.println(countFrequency(stringList,queries));
        System.out.println(countFrequency2(stringList,queries));
    }

    // Type 1
    public  static List<Integer> countFrequency(List<String> stringList , List<String> queries){
        List<Integer> integerList = new ArrayList<>();
        queries.forEach( t-> {
            var count = Collections.frequency(stringList ,t);
            integerList.add(count);
        });
        return  integerList;
    }

    // Type 2 - Using stream

    public  static List<Integer> countFrequency2(List<String> stringList , List<String> queries){
        return  queries.stream().mapToInt(t -> Collections.frequency(stringList,t)).boxed().toList();
    }

  

}
