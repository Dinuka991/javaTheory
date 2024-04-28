package org.example.stream.flatMapAndCollection;
import java.util.Collection;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<List<Integer>> listList = List.of(

                List.of(1,2,5,6,8),
                List.of(2,4,5,7),
                List.of(6,8,3,6),
                List.of(8,3,7,9)
        );

        listList.stream().flatMap(i -> i.stream().filter(j -> j%2 == 0)).forEach(System.out::println);

    }
}
