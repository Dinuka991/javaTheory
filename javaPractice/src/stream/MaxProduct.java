package stream;

import java.util.Arrays;
import java.util.Comparator;

public class MaxProduct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] arr) {

        var list = Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder()).toList();
        return   list.stream().limit(2).reduce(1,(a,b)-> (a*b));
    }
}
