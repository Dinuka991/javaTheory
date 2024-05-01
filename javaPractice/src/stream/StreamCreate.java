package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreate {
    public static void main(String[] args) {

        // Create a stream of integers from 1 to 10
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7);
        integerStream.forEach(System.out::println);

        // Creat a stream from Array
        int[]  intArr = new int[]{1,2,3,4,5,8};
        IntStream intStream = Arrays.stream(intArr);
        intStream.forEach(System.out::println);

        // Create a stream  from String
        String str = "outOfLog";
        IntStream intStream1 = str.chars();
        intStream1.forEach(c -> System.out.println( (char) c ));

        // create range of integers using stream
        IntStream intStream2 = IntStream.range(1,4).filter(i -> i%2 == 0);
        intStream2.forEach(t -> System.out.println(t));




    }
}
