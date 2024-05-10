package array;

import java.util.List;
import java.util.stream.IntStream;

public class CountSubList {
    public static void main(String[] args) {
        List<Integer> squares = List.of(1, 2, 1, 3, 2);
        int day = 3;
        int month = 2;
        System.out.println(countSubList(squares, month, day)); // Output: 2
        System.out.println(countSubList2(squares, month, day)); // Output: 2
    }

    // Type 1
    public static int countSubList(List<Integer> s, int m, int d) {
        int count = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int segmentSum = 0;
            for (int j = i; j < i + m; j++) {
                segmentSum += s.get(j); // Calculate sum of current segment
            }
            if (segmentSum == d) { // Check if sum equals Ron's birth day
                count++;
            }
        }
        return count;
    }

    // Type 2
public static long countSubList2(List<Integer> s, int m, int d) {
    return IntStream.range(0, s.size() - m + 1)
            .mapToObj(i -> s.subList(i, i + m))
            .filter(seg -> seg.stream().mapToInt(Integer::intValue).sum() == d)
            .count();
}



}
